package com.example.hamariapp.ui.dashboard

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.example.hamariapp.R

class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_dashboard, container, false)

        showDialog()


        return rootView
    }

    private fun showDialog() {
        val builder = AlertDialog.Builder(requireContext())

        builder.setMessage("Do you want to proceed with this action?")
            .setPositiveButton("Yes") { _: DialogInterface, _: Int ->
                // Code to execute when "Yes" button is clicked
                // Add your logic here
            }
            .setNegativeButton("No") { dialog: DialogInterface, _: Int ->
                // Code to execute when "No" button is clicked
                // Add your logic here
                dialog.dismiss()
            }
            .setCancelable(false)

        val alertDialog: AlertDialog = builder.create()
        alertDialog.show()
    }

}
