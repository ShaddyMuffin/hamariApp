package com.example.hamariapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.example.hamariapp.R
import com.example.hamariapp.databinding.FragmentHomeBinding
import com.google.android.material.tabs.TabLayout

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)

        // Initialize the ViewPager and TabLayout
        val viewPager: ViewPager = rootView.findViewById(R.id.viewPager)
        val tabLayout: TabLayout = rootView.findViewById(R.id.tabLayout)

        // Create the adapter for the ViewPager (you need to implement it)
        val adapter = MyPagerAdapter(childFragmentManager)

        // Set the adapter for the ViewPager
        viewPager.adapter = adapter

        // Connect the TabLayout with the ViewPager
        tabLayout.setupWithViewPager(viewPager)

        return rootView
    }
}