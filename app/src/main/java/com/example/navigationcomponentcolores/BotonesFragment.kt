package com.example.navigationcomponentcolores

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.navigationcomponentcolores.databinding.FragmentBotonesBinding


class BotonesFragment : Fragment() {

    private var _binding: FragmentBotonesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_botones, container, false)
        _binding = FragmentBotonesBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Navengando
        binding.btnRojo.setOnClickListener {
            val action = BotonesFragmentDirections.actionBotonesFragmentToColorFragment(Color.RED)
            view.findNavController().navigate(action)
        }
        binding.btnAzul.setOnClickListener {
            val action = BotonesFragmentDirections.actionBotonesFragmentToColorFragment(Color.BLUE)
            view.findNavController().navigate(action)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }





}