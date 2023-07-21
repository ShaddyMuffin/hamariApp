package com.example.hamariapp.ui.profile

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.hamariapp.SOSedit
import com.example.hamariapp.SettingsActivity
import com.example.hamariapp.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {
    private var _binding: FragmentProfileBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val profileViewModel =
            ViewModelProvider(this).get(ProfileViewModel::class.java)

        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textProfile
//        profileViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        val sete: Button = binding.settingsButton
        sete.setOnClickListener(){
            val io = Intent(requireContext(), SettingsActivity::class.java)
            startActivity(io)
        }

        val sosewd: Button = binding.sosInfoButton
        sosewd.setOnClickListener(){
            Log.i("Myuser","Success")
            val iop = Intent(requireContext(), SOSedit::class.java)
            startActivity(iop)

        }

        val helpw: Button = binding.helpCentreButton
        helpw.setOnClickListener(){
            Toast.makeText(requireContext(), "Help is on the way!", Toast.LENGTH_SHORT).show()
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}