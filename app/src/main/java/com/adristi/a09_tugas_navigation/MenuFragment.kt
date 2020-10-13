package com.adristi.a09_tugas_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.fragment_menu.*
import kotlinx.android.synthetic.main.fragment_menu.view.*

class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_menu, container, false)
        // Inflate the layout for this fragment
        //val btnMenuToResult = findViewById(R.id.btnMenuToResult)
        view.btnMenuToResult.setOnClickListener {
            NavHostFragment.findNavController(this).navigate(R.id.action_menuFragment_to_resultFragment)
        }
        return view
    }

}