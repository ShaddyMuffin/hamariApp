package com.example.hamariapp.ui.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> Tab1Fragment()
            1 -> Tab2Fragment()
            2 -> Tab3Fragment()
            else -> throw IllegalArgumentException("Invalid position")
        }
    }

    override fun getCount(): Int = 3 // Number of tabs

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Tab 1"
            1 -> "Tab 2"
            2 -> "Tab 3"
            else -> null
        }
    }
}
