package com.health.pickmyfood.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.health.pickmyfood.model.FoodItem
import com.health.pickmyfood.repository.FoodRepo

class FoodViewModel(private val foodRepo : FoodRepo) : ViewModel() {

    private val _myPizza :  MutableLiveData<FoodItem> = MutableLiveData()
    val myPizza : LiveData<FoodItem> = _myPizza

    fun pickMyPizza() {
        _myPizza.value = foodRepo.getFoodItem()
    }

}