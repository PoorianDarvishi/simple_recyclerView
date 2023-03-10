package com.example.recyclerview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _listCityLiveData = MutableLiveData<ArrayList<String>>()
    val listCityLiveData: LiveData<ArrayList<String>> = _listCityLiveData

    fun setListCity(listCity: ArrayList<String>) {
        _listCityLiveData.postValue(listCity)
    }

}