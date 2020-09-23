package intensive.start.ru.cft.team.cbrf.modules.convert_currency

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import intensive.start.ru.cft.team.cbrf.R
import kotlinx.android.synthetic.main.fragment_convert_currency.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ConvertCurrencyFragment : Fragment(R.layout.fragment_convert_currency) {
    private val viewModel by viewModel<ConvertCurrencyViewModel>()
    private val args by navArgs<ConvertCurrencyFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        currencyNameTV.text = args.currency.name
        currencyResultNameTV.text = args.currency.name
        priceTV.text = args.currency.value.toString()
        nominalTV.text = args.currency.nominal.toString()

        valueET.addTextChangedListener {
            try {
                if (it.toString().count() > 0) {
                    viewModel.convertTo(it.toString().toDouble(), args.currency)
                }
            } catch (e: Exception) {
                Toast.makeText(
                    context,
                    getText(R.string.ensureThanValueIsValid),
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        viewModel.amountLiveData.observe(viewLifecycleOwner, Observer {
            convertResultTV.text = it.toString()
        })

        closeBtn.setOnClickListener {
            hideKeyboard(it)
            findNavController().popBackStack()
        }

        valueETL.setEndIconOnClickListener {
            convertResultTV.text = ""
            valueET.setText("")
        }
    }

    private fun hideKeyboard(view: View) {
        val imm = context?.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)
    }
}