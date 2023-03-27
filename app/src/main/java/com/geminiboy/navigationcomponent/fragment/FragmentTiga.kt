package com.geminiboy.navigationcomponent.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geminiboy.navigationcomponent.R
import com.geminiboy.navigationcomponent.databinding.FragmentDuaBinding
import com.geminiboy.navigationcomponent.databinding.FragmentTigaBinding

class FragmentTiga : Fragment() {

    lateinit var binding: FragmentTigaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentTigaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val getNama = arguments?.getString("NAMA")
        //binding.tvNama.setText(getNama)
        binding.tvNama.text = getNama

    }

}