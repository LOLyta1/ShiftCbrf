package intensive.start.ru.cft.team.cbrf.core.model.entity


import com.google.gson.annotations.SerializedName

data class CurrencyRemoteResponse(
    @SerializedName("Date")
    val date: String = "",
    @SerializedName("PreviousDate")
    val previousDate: String = "",
    @SerializedName("PreviousURL")
    val previousURL: String = "",
    @SerializedName("Timestamp")
    val timestamp: String = "",
    @SerializedName("Valute")
    val valute: Valute = Valute()
) {
    data class Valute(
        @SerializedName("AMD")
        val aMD: AMD = AMD(),
        @SerializedName("AUD")
        val aUD: AUD = AUD(),
        @SerializedName("AZN")
        val aZN: AZN = AZN(),
        @SerializedName("BGN")
        val bGN: BGN = BGN(),
        @SerializedName("BRL")
        val bRL: BRL = BRL(),
        @SerializedName("BYN")
        val bYN: BYN = BYN(),
        @SerializedName("CAD")
        val cAD: CAD = CAD(),
        @SerializedName("CHF")
        val cHF: CHF = CHF(),
        @SerializedName("CNY")
        val cNY: CNY = CNY(),
        @SerializedName("CZK")
        val cZK: CZK = CZK(),
        @SerializedName("DKK")
        val dKK: DKK = DKK(),
        @SerializedName("EUR")
        val eUR: EUR = EUR(),
        @SerializedName("GBP")
        val gBP: GBP = GBP(),
        @SerializedName("HKD")
        val hKD: HKD = HKD(),
        @SerializedName("HUF")
        val hUF: HUF = HUF(),
        @SerializedName("INR")
        val iNR: INR = INR(),
        @SerializedName("JPY")
        val jPY: JPY = JPY(),
        @SerializedName("KGS")
        val kGS: KGS = KGS(),
        @SerializedName("KRW")
        val kRW: KRW = KRW(),
        @SerializedName("KZT")
        val kZT: KZT = KZT(),
        @SerializedName("MDL")
        val mDL: MDL = MDL(),
        @SerializedName("NOK")
        val nOK: NOK = NOK(),
        @SerializedName("PLN")
        val pLN: PLN = PLN(),
        @SerializedName("RON")
        val rON: RON = RON(),
        @SerializedName("SEK")
        val sEK: SEK = SEK(),
        @SerializedName("SGD")
        val sGD: SGD = SGD(),
        @SerializedName("TJS")
        val tJS: TJS = TJS(),
        @SerializedName("TMT")
        val tMT: TMT = TMT(),
        @SerializedName("TRY")
        val tRY: TRY = TRY(),
        @SerializedName("UAH")
        val uAH: UAH = UAH(),
        @SerializedName("USD")
        val uSD: USD = USD(),
        @SerializedName("UZS")
        val uZS: UZS = UZS(),
        @SerializedName("XDR")
        val xDR: XDR = XDR(),
        @SerializedName("ZAR")
        val zAR: ZAR = ZAR()
    ) {
        data class AMD(
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

        data class AUD(
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

        data class AZN(
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

        data class BGN(
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

        data class BRL(
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

        data class BYN(
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

        data class CAD(
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

        data class CHF(
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

        data class CNY(
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

        data class CZK(
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

        data class DKK(
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

        data class EUR(
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

        data class GBP(
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

        data class HKD(
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

        data class HUF(
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

        data class INR(
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

        data class JPY(
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

        data class KGS(
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

        data class KRW(
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

        data class KZT(
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

        data class MDL(
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

        data class NOK(
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

        data class PLN(
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

        data class RON(
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

        data class SEK(
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

        data class SGD(
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

        data class TJS(
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

        data class TMT(
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

        data class TRY(
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

        data class UAH(
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

        data class USD(
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

        data class UZS(
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

        data class XDR(
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

        data class ZAR(
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
    }
}