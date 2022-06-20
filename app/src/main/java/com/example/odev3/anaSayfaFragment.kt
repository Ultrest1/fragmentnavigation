package com.example.odev3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev3.databinding.FragmentAnaSayfaBinding


class anaSayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnaSayfaBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAnaSayfaBinding.inflate(inflater,container,false)


        binding.button.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaAyaGecis)

        }

        binding.button2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anaSayfaFragment_to_sayfaXFragment)

        }



        return binding.root
    }


}