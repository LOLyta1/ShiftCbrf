package intensive.start.ru.cft.team.cbrf.network

import intensive.start.ru.cft.team.cbrf.core.model.entity.CurrencyRemoteResponse

import retrofit2.Call
import retrofit2.http.GET

interface NetworkApi {
    @GET("daily_json.js")
    fun getCurrencyList(): Call<CurrencyRemoteResponse>
}