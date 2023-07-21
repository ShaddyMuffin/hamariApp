package com.example.hamariapp.ui.home
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.hamariapp.R

class Tab1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_tab1, container, false)

        val textView: TextView = rootView.findViewById(R.id.textView1)
        textView.text = "This is Tab 1"

        return rootView
    }
}
