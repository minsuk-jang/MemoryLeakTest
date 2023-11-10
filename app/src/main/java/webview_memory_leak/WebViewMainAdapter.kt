package webview_memory_leak

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class WebViewMainAdapter(
    private val activity: FragmentActivity,
    private val count: Int,
    private val block: (Int) -> Fragment
) : FragmentStateAdapter(
    activity
) {
    override fun getItemCount(): Int = count

    override fun createFragment(position: Int): Fragment {
        return block(position)
    }
}