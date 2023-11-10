package webview_memory_leak

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import com.example.base.BaseFragment
import com.example.memoryleaktest.R
import com.example.memoryleaktest.databinding.FragmentWebviewMainBinding

class WebViewMainFragment :
    BaseFragment<FragmentWebviewMainBinding>(R.layout.fragment_webview_main) {
    companion object {
        fun newInstance(): WebViewMainFragment {
            return WebViewMainFragment().apply {
                arguments = bundleOf()
            }
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindWebView()
    }

    private fun bindWebView(){
        binding.webview.loadUrl("https://www.naver.com")
    }
}