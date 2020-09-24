package intensive.start.ru.cft.team.cbrf.core.model.entity

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity
@Parcelize
data class Currency(
    @PrimaryKey
    val charCode: String = "",
    val nominal: Int = 0,
    val name: String = "",
    val value:Double=0.0
) : Parcelable