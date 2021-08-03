package com.health.pickmyfood.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.health.pickmyfood.repository.FoodRepoImpl

class ViewModelFactory() : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FoodViewModel::class.java)) {
            return FoodViewModel(FoodRepoImpl()) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}