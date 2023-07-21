package com.example.hamariapp.ui.shop

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> SStationary()
            1 -> BSOldbooks()
            2 -> BOfWaste()
            else -> throw IllegalArgumentException("Invalid position")
        }
    }

    override fun getCount(): Int = 3 // Number of tabs

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Stationary"
            1 -> "Old books"
            2 -> "Sell used"
            else -> null
        }
    }
}