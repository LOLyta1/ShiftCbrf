package intensive.start.ru.cft.team.cbrf

import android.app.Application
import intensive.start.ru.cft.team.cbrf.database.di.databaseModule
import intensive.start.ru.cft.team.cbrf.modules.convert_currency.di.currencyConvertModule
import intensive.start.ru.cft.team.cbrf.modules.currency_list.di.currencyListModule
import intensive.start.ru.cft.team.cbrf.network.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(networkModule, databaseModule,currencyListModule,currencyConvertModule)
        }
    }
}