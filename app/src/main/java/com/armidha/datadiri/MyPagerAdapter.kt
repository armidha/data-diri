package com.armidha.datadiri

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){

    //    MENAMPUNG FRAGMENT
    private val tabs=listOf(
        FirstFragment(),
        SecondFragment(),
        ThirdFragment(),
        FourthFragment()
    )

    override fun getItem(position: Int): Fragment {
        return tabs[position]
    }

    override fun getCount(): Int {
        return tabs.size
    }

    //    JUDUL TIAP TAB
    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "First Tab"
            1 -> "Second Tab"
            2 -> "Third Tab"
            else -> "Fourth Tab"
        }
    }
}
