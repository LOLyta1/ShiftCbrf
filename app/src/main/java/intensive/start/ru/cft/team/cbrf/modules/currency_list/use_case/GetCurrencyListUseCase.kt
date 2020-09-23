package intensive.start.ru.cft.team.cbrf.modules.currency_list.use_case

import com.google.gson.Gson
import com.google.gson.JsonParser
import intensive.start.ru.cft.team.cbrf.core.model.entity.Currency
import intensive.start.ru.cft.team.cbrf.core.model.entity.CurrencyRemoteResponse
import intensive.start.ru.cft.team.cbrf.core.model.entity.ValuteValue
import intensive.start.ru.cft.team.cbrf.network.NetworkClient
import intensive.start.ru.cft.team.cbrf.network.NetworkStatus
import intensive.start.ru.cft.team.cbrf.toCurrency
import retrofit2.Call
import retrofit2.awaitResponse

class GetCurrencyListUseCase(
    private val networkClient: NetworkClient<Call<CurrencyRemoteResponse>>
) {
    suspend fun downloadCurrency(): NetworkStatus<List<Currency>> {
        return try {
            val response = networkClient.getData().awaitResponse()
            if (response.isSuccessful) {
                val gson = Gson()
                val bodyJson = gson.toJson(response.body()?.valute)
                val jsonElement = JsonParser.parseString(bodyJson)
                val list = mutableListOf<Currency>()
                jsonElement.asJsonObject.entrySet().forEach {
                    list.add(
                        gson.fromJson(it.value, ValuteValue::class.java).toCurrency()
                    )
                }
                NetworkStatus.Successful(list)
            } else {
                NetworkStatus.Error(response.errorBody()?.toString() ?: "")
            }
        } catch (e: Exception) {
            e.printStackTrace()
            NetworkStatus.Error(e.message ?: "")
        }
    }
}
