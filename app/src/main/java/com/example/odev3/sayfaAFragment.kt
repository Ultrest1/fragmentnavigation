package com.example.odev3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev3.databinding.FragmentAnaSayfaBinding
import com.example.odev3.databinding.FragmentSayfaABinding

class sayfaAFragment : Fragment() {

    private lateinit var binding:FragmentSayfaABinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentSayfaABinding.inflate(inflater,container,false)

       binding.button3.setOnClickListener {
           Navigation.findNavController(it).navigate(R.id.action_sayfaAFragment_to_sayfaBFragment)
       }

        return binding.root
    }


}