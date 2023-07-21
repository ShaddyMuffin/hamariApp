package com.example.hamariapp.ui.notifications
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.hamariapp.R

class Tab01Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_tab01, container, false)

        val textView: TextView = rootView.findViewById(R.id.textView001)
        textView.text = "You can open a jar"

        return rootView
    }
}
