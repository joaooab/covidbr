package br.com.covidbr.ui.slideshow

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import br.com.covidbr.R
import kotlinx.android.synthetic.main.fragment_news.*
import org.koin.android.ext.android.inject

class NewsFragment : Fragment() {

    private val mViewModel: NewsViewModel by inject()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mViewModel.text.observe(viewLifecycleOwner, Observer {
            text_slideshow.text = it
        })
        mViewModel.newsResponse.observe(viewLifecycleOwner, Observer {
            Log.e("teste", "tteste")
        })
    }
}
