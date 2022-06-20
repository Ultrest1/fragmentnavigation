package com.example.odev3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev3.databinding.FragmentAnaSayfaBinding
import com.example.odev3.databinding.FragmentSayfaBBinding
import com.example.odev3.databinding.FragmentSayfaXBinding


class sayfaBFragment : Fragment() {

    private lateinit var binding:FragmentSayfaBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSayfaBBinding.inflate(inflater,container,false)


        binding.button4.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_sayfaBFragment_to_sayfaYFragment)
        }

        return binding.root
    }


}