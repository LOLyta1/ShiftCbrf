package intensive.start.ru.cft.team.cbrf.core.model.entity

import com.google.gson.annotations.SerializedName

data class ValuteValue(
    @SerializedName("CharCode")
    val charCode: String = "",
    @SerializedName("ID")
    val iD: String = "",
    @SerializedName("Name")
    val name: String = "",
    @SerializedName("Nominal")
    val nominal: Int = 0,
    @SerializedName("NumCode")
    val numCode: String = "",
    @SerializedName("Previous")
    val previous: Double = 0.0,
    @SerializedName("Value")
    val value: Double = 0.0
)


