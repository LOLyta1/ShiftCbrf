package intensive.start.ru.cft.team.cbrf.modules.currency_list

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import intensive.start.ru.cft.team.cbrf.core.model.entity.Currency
import intensive.start.ru.cft.team.cbrf.modules.currency_list.use_case.GetCurrencyListUseCase
import intensive.start.ru.cft.team.cbrf.network.NetworkStatus
import kotlinx.coroutines.launch

class CurrencyListViewModel(
    val getCurrencyListUseCase: GetCurrencyListUseCase
) : ViewModel() {
    val currencyListLiveData = MutableLiveData<NetworkStatus<List<Currency>>>()

    fun getCurrencyList() {
        viewModelScope.launch {
            currencyListLiveData.postValue(NetworkStatus.Loading())
            currencyListLiveData.postValue(
                getCurrencyListUseCase.downloadCurrency()
            )
        }
    }
}