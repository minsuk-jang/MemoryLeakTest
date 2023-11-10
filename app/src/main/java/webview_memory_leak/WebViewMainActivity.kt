package webview_memory_leak

import android.os.Bundle
import com.example.base.BaseActivity
import com.example.memoryleaktest.R
import com.example.memoryleaktest.databinding.ActivityWebviewMainBinding

class WebViewMainActivity :
    BaseActivity<ActivityWebviewMainBinding>(R.layout.activity_webview_main) {
    private var adapter: WebViewMainAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindAdapter()
        bindViewPager()
    }

    private fun bindAdapter() {
        adapter = WebViewMainAdapter(
            activity = this,
            count = 40
        ) {
            WebViewMainFragment.newInstance()
        }
    }


    private fun bindViewPager() {
        with(binding.viewPager2) {
            adapter = this@WebViewMainActivity.adapter
        }
    }
}