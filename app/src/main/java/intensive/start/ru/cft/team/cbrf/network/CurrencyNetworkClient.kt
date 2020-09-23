package intensive.start.ru.cft.team.cbrf.network

import intensive.start.ru.cft.team.cbrf.core.model.entity.CurrencyRemoteResponse
import retrofit2.Call


class CurrencyNetworkClient(private val api: NetworkApi) : NetworkClient<Call<CurrencyRemoteResponse>> {
    override suspend fun getData(): Call<CurrencyRemoteResponse> {
        return api.getCurrencyList()
    }
}