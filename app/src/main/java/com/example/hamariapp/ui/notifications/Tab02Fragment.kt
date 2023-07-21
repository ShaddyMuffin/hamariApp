package com.example.hamariapp.ui.notifications
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.hamariapp.R

class Tab02Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_tab02, container, false)

        val textView: TextView = rootView.findViewById(R.id.textView002)
        textView.text = "Get some motivation"

        return rootView
    }
}
