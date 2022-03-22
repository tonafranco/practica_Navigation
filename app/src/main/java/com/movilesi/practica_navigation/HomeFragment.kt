package com.movilesi.practica_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.movilesi.practica_navigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding = FragmentHomeBinding.inflate(layoutInflater)

        val navController = findNavController()
        binding.buttonHomeToInside.setOnClickListener {
            //navController.navigate(R.id.action_homeFragment_to_insedeHome)
            val testArgument = "desde el home"
            val directions = HomeFragmentDirections.actionHomeFragmentToInsedeHome(testArgument)
            navController.navigate(directions)
        }

        return binding.root
    }

}