package intensive.start.ru.cft.team.cbrf.modules.currency_list.di

import intensive.start.ru.cft.team.cbrf.modules.currency_list.CurrencyListViewModel
import intensive.start.ru.cft.team.cbrf.modules.currency_list.use_case.GetCurrencyListUseCase
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val currencyListModule = module {
    single {
        GetCurrencyListUseCase(
            networkClient = get(),
            database = get()
        )
    }
    viewModel {
        CurrencyListViewModel(getCurrencyListUseCase = get(), application = androidApplication())
    }
}