package intensive.start.ru.cft.team.cbrf.modules.currency_list

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import intensive.start.ru.cft.team.cbrf.R
import intensive.start.ru.cft.team.cbrf.core.model.entity.Currency
import intensive.start.ru.cft.team.cbrf.network.NetworkStatus
import kotlinx.android.synthetic.main.fragment_currency_list.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class CurrencyListFragment : Fragment(R.layout.fragment_currency_list) {
    private val viewModel by viewModel<CurrencyListViewModel>()
    private var adapter: CurrencyAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerAdapter()

        swipeRL.setOnRefreshListener { viewModel.getCurrencyList() }

        viewModel.currencyListLiveData.observe(viewLifecycleOwner, Observer {
            when (it) {
                is NetworkStatus.Loading -> setLoadingState()
                is NetworkStatus.Successful -> {
                    removeLoadingState()
                    adapter?.setList(it.data)
                }
                is NetworkStatus.Error -> {
                    removeLoadingState()
                    showError(it.message)
                }
            }
        })

        viewModel.getCurrencyList()
    }

    private fun initRecyclerAdapter() {
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        adapter = CurrencyAdapter (::onCurrencyConvertClick)
        recyclerView.adapter = adapter
        recyclerView.addItemDecoration(createDecorator())
    }

    private fun onCurrencyConvertClick(currency: Currency){
        findNavController().navigate(
            CurrencyListFragmentDirections.actionCurrencyListFragmentToConvertCurrencyFragment(currency)
        )
    }
    private fun createDecorator(): DividerItemDecoration {
        val drawable =  ResourcesCompat.getDrawable(resources, R.drawable.vertical_divider_medium, null)
        val divider = DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
        drawable?.let{
            divider.setDrawable(it)
        }
        return divider
    }

    private fun setLoadingState() {
        progressBarContainer.visibility = View.VISIBLE
    }

    private fun removeLoadingState() {
        progressBarContainer.visibility = View.GONE
        swipeRL.isRefreshing = false
    }

    private fun showError(errorText: String) {
        Toast.makeText(context, "Error - $errorText", Toast.LENGTH_SHORT).show()
        swipeRL.isRefreshing = false
    }
}