package com.example.homework4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class AnasayfaFragment : Fragment() {
    private var _binding: AnasayfaFragment? = null
    private val binding get() = _binding!!




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = AnasayfaFragment.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnGitA.setOnClickListener {
            findNavController().navigate(R.id.action_anasayfaFragment_to_sayfaAFragment)
        }

        binding.btnGitX.setOnClickListener {
            findNavController().navigate(R.id.action_anasayfaFragment_to_sayfaXFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}