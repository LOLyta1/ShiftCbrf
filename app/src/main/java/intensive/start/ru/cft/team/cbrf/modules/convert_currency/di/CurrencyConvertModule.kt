package intensive.start.ru.cft.team.cbrf.modules.convert_currency.di

import intensive.start.ru.cft.team.cbrf.modules.convert_currency.ConvertCurrencyViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val currencyConvertModule = module {
    viewModel { ConvertCurrencyViewModel() }
}