package intensive.start.ru.cft.team.cbrf.core.model.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Currency(
    val charCode: String = "",
    val nominal: Int = 0,
    val name: String = "",
    val value:Double=0.0
) : Parcelable