package com.petrescue.modules.animals.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.petrescue.databinding.FragmentAnimalsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnimalsFragment : Fragment() {

    private val viewModel: AnimalsFragmentViewModel by viewModels()

    private val binding get() = _binding!!
    private var _binding: FragmentAnimalsBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentAnimalsBinding.inflate(inflater, container, false)
        return binding.root
    }


}