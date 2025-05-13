package com.example.assignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        // For prototype, just show text indicating this is the List screen
        val textView = view.findViewById<TextView>(R.id.textView)
        textView.text = "List View\n\nThis screen would show a list of green places nearby."

        return view
    }
}
