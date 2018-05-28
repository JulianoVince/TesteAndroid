package me.julianocampos.testesantander.base

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import me.julianocampos.testesantander.R
import me.julianocampos.testesantander.contact.ContactFragment
import me.julianocampos.testesantander.investment.InvestmentFragment

/**
 * Created by julianocampos.
 */
class PageAdapter(fragmentManager: FragmentManager, private val context: Context):
        FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment? {
        return when(position) {
            0 -> InvestmentFragment()
            else -> ContactFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> context.getString(R.string.investment)
            else -> context.getString(R.string.contact)
        }
    }
}