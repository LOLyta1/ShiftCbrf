package intensive.start.ru.cft.team.cbrf.modules.currency_list

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import intensive.start.ru.cft.team.cbrf.core.model.entity.Currency
import intensive.start.ru.cft.team.cbrf.modules.currency_list.use_case.GetCurrencyListUseCase
import intensive.start.ru.cft.team.cbrf.network.DownloadingStatus
import kotlinx.coroutines.launch

class CurrencyListViewModel(
    val getCurrencyListUseCase: GetCurrencyListUseCase,
    application: Application
) : AndroidViewModel(application) {
    val currencyListLiveData = MutableLiveData<DownloadingStatus<List<Currency>>>()

    fun getCurrencyList() {
        viewModelScope.launch {
            currencyListLiveData.postValue(DownloadingStatus.Loading())
            currencyListLiveData.postValue(
                getCurrencyListUseCase.downloadCurrency()
            )
        }
    }

    fun reload() {
        viewModelScope.launch {
            getCurrencyListUseCase.cleareCache()
            getCurrencyList()
        }
    }
}