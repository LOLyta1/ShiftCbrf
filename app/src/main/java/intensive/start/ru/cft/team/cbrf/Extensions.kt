package intensive.start.ru.cft.team.cbrf

import intensive.start.ru.cft.team.cbrf.core.model.entity.Currency
import intensive.start.ru.cft.team.cbrf.core.model.entity.ValuteValue

fun ValuteValue.toCurrency() = Currency(
    charCode = this.charCode,
    nominal = this.nominal,
    name = this.name,
    value = this.value
)