package com.example.hamariapp.ui.shop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.hamariapp.R

class BOfWaste : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_bofwaste, container, false)

        val textView: TextView = rootView.findViewById(R.id.textView03)
        textView.text = "This is for buying of used sheets"

        return rootView
    }
}