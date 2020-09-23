package intensive.start.ru.cft.team.cbrf.network.di

import intensive.start.ru.cft.team.cbrf.CONNECTION_TIMEOUT
import intensive.start.ru.cft.team.cbrf.ENDPOINT
import intensive.start.ru.cft.team.cbrf.network.CurrencyNetworkClient
import intensive.start.ru.cft.team.cbrf.network.NetworkApi
import intensive.start.ru.cft.team.cbrf.network.NetworkClient
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.bind
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val networkModule= module {
    val loggingInterceptor =  HttpLoggingInterceptor().apply{
        level = HttpLoggingInterceptor.Level.BODY
    }
    val httpClient = OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .connectTimeout(CONNECTION_TIMEOUT,TimeUnit.SECONDS)
        .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(ENDPOINT)
            .addConverterFactory( GsonConverterFactory.create())
            .client(httpClient)
            .build()

     single {   CurrencyNetworkClient( retrofit.create(NetworkApi::class.java) ) } bind NetworkClient::class
}

