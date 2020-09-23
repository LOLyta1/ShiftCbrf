package intensive.start.ru.cft.team.cbrf.modules.currency_list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import intensive.start.ru.cft.team.cbrf.R
import intensive.start.ru.cft.team.cbrf.core.model.entity.Currency
import kotlinx.android.synthetic.main.item_currency.view.*

class CurrencyAdapter(
    private var onConvertBtnClick: (currency: Currency) -> Unit
) : RecyclerView.Adapter<CurrencyAdapter.CurrencyViewHolder>() {

    private val currencyList = mutableListOf<Currency>()

    fun setList(list: List<Currency>) {
        this.currencyList.clear()
        this.currencyList.addAll(list)
        this.notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_currency, parent, false)
        return CurrencyViewHolder(view).apply {
            view.findViewById<Button>(R.id.convertBTN).setOnClickListener {
                if (adapterPosition != RecyclerView.NO_POSITION) {
                    onConvertBtnClick(currencyList[adapterPosition])
                }
            }
        }
    }

    override fun getItemCount() = currencyList.count()

    override fun onBindViewHolder(holder: CurrencyViewHolder, position: Int) {
        holder.bind(currencyList[position])
    }

    class CurrencyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(currency: Currency) {
            itemView.currencyNameTV.text = currency.name
            itemView.currencyCharTV.text = currency.charCode
            itemView.currencyDenominationTV.text = currency.nominal.toString()
            itemView.priceTV.text = currency.value.toString()

        }
    }
}