package com.example.recyclerview

import android.graphics.drawable.GradientDrawable.Orientation
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.FragmentMainBinding

class MainFragment: Fragment(R.layout.fragment_main) {
    lateinit var binding : FragmentMainBinding
    val mainViewModel : MainViewModel by viewModels()
    lateinit var adapter: Adapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        mainViewModel.setListCity(ListCity.listCity)
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        mainViewModel.listCityLiveData.observe(viewLifecycleOwner
        ) { t ->
            adapter =
                Adapter(t!!)
        }
    }
}