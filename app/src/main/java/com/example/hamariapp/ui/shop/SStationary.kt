package com.example.hamariapp.ui.shop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.hamariapp.R

class SStationary : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_sstationary, container, false)

        val textView: TextView = rootView.findViewById(R.id.textView01)
        textView.text = "This is for selling of stationary"

        return rootView
    }
}