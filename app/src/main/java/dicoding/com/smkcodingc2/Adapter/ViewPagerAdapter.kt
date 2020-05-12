package dicoding.com.smkcodingc2.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import dicoding.com.smkcodingc2.Fragment.*

class ViewPagerAdapter(fragmentActivity: FragmentActivity?) :
    FragmentStateAdapter(fragmentActivity!!) {

    private val JUMLAH_MENU = 3

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> { return Favorites() }
            1 -> { return Upcoming() }
            2 -> { return Finished() }
            else -> {
                return Trips()
            }
        }
    }
    override fun getItemCount(): Int {
        return JUMLAH_MENU
    }
}