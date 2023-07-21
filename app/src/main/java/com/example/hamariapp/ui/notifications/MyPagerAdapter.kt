package com.example.hamariapp.ui.notifications

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> Tab01Fragment()
            1 -> Tab02Fragment()
            else -> throw IllegalArgumentException("Invalid position")
        }
    }

    override fun getCount(): Int = 2 // Number of tabs

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "JAR"
            1 -> "Motivation"
            else -> null
        }
    }
}