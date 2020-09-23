package intensive.start.ru.cft.team.cbrf.modules.convert_currency

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import intensive.start.ru.cft.team.cbrf.core.model.entity.Currency

class ConvertCurrencyViewModel : ViewModel() {
    val amountLiveData = MutableLiveData<Double>()

    fun convertTo(amount: Double, currency: Currency) {
        val pricePerOne = currency.value / currency.nominal
        amountLiveData.value =  amount/pricePerOne
    }
}