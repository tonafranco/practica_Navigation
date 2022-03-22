package com.movilesi.practica_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.movilesi.practica_navigation.databinding.FragmentInsedeHomeBinding

class InsedeHome : Fragment() {

    private lateinit var binding: FragmentInsedeHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentInsedeHomeBinding.inflate(layoutInflater)

        val argumentoRecibido = arguments?.getString("argumentoPasado")
        binding.textView2.setText(argumentoRecibido)
        return binding.root
    }

}