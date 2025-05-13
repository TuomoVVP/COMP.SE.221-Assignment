package com.example.assignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        // For prototype, just show text indicating this is the Profile screen
        val textView = view.findViewById<TextView>(R.id.textView)
        textView.text = "Profile\n\nThis screen would show user profile and settings."

        return view
    }
}