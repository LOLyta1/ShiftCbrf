package intensive.start.ru.cft.team.cbrf.modules.currency_list.use_case

import com.google.gson.Gson
import com.google.gson.JsonParser
import intensive.start.ru.cft.team.cbrf.core.model.entity.Currency
import intensive.start.ru.cft.team.cbrf.core.model.entity.CurrencyRemoteResponse
import intensive.start.ru.cft.team.cbrf.core.model.entity.ValuteValue
import intensive.start.ru.cft.team.cbrf.database.CurrencyDao
import intensive.start.ru.cft.team.cbrf.database.CurrencyDatabaseImpl
import intensive.start.ru.cft.team.cbrf.network.DownloadingStatus
import intensive.start.ru.cft.team.cbrf.network.NetworkClient
import intensive.start.ru.cft.team.cbrf.toCurrency
import retrofit2.Call
import retrofit2.awaitResponse

class GetCurrencyListUseCase(
    private val networkClient: NetworkClient<Call<CurrencyRemoteResponse>>,
    private val database: CurrencyDatabaseImpl
) {

    suspend fun downloadCurrency(): DownloadingStatus<List<Currency>> {
        return try {
            val databaseInstance = database.invoke().currencyDao
            val savedCurrencyList = databaseInstance.getAllCurrency()
            if (savedCurrencyList.isNotEmpty()) {
                DownloadingStatus.Successful(savedCurrencyList)
            } else {
                loadFromNetworkAndSaveToDatabase(databaseInstance)
            }
        } catch (e: Exception) {
            e.printStackTrace()
            DownloadingStatus.Error(e.message ?: "")
        }
    }

    private suspend fun loadFromNetworkAndSaveToDatabase(
        databaseDao: CurrencyDao
    ): DownloadingStatus<List<Currency>> {
        val response = networkClient.getData().awaitResponse()
        if (response.isSuccessful) {
            response.body()?.valute?.let {
                val list = parseValuteList(it)
                databaseDao.saveCurrencyList(list)
                return DownloadingStatus.Successful(list)
            }
            return DownloadingStatus.Error(response.errorBody()?.toString() ?: "")
        } else {
            return DownloadingStatus.Error(response.errorBody()?.toString() ?: "")
        }
    }

    private fun parseValuteList(obj: Any): List<Currency> {
        val gson = Gson()
        val bodyJson = gson.toJson(obj)
        val jsonElement = JsonParser.parseString(bodyJson)
        val list = mutableListOf<Currency>()
        jsonElement.asJsonObject.entrySet().forEach {
            list.add(
                gson.fromJson(it.value, ValuteValue::class.java).toCurrency()
            )
        }
        return list
    }

    suspend fun cleareCache() {
        database.invoke().currencyDao.deleteAllCurrency()
    }
}

