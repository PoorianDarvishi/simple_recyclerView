package com.example.recyclerview

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.recyclerview.databinding.FragmentMainBinding

class MainFragment: Fragment(R.layout.fragment_main) {
    lateinit var binding : FragmentMainBinding
    val mainViewModel :
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

    }
}