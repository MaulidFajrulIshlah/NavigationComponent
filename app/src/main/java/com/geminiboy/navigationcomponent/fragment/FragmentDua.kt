package com.geminiboy.navigationcomponent.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.geminiboy.navigationcomponent.R
import com.geminiboy.navigationcomponent.databinding.FragmentDuaBinding
import com.geminiboy.navigationcomponent.databinding.FragmentSatuBinding


class FragmentDua : Fragment() {


    lateinit var binding: FragmentDuaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentDuaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnKeFragment3.setOnClickListener {
            val name = binding.etNama.text.toString()
            val lastName = "nur"
            val bund = Bundle()
            bund.putString("NAMA",name)

            findNavController().navigate(R.id.action_fragmentDua_to_fragmentTigau, bund)
        }
    }


}