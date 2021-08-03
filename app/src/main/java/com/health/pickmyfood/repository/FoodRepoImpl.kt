package com.health.pickmyfood.repository

import com.health.pickmyfood.model.FoodItem


class FoodRepoImpl : FoodRepo {

    //Dummy Pizza List
    private val foodList = arrayListOf(
        FoodItem("Neapolitan Pizza", 4, 400),
        FoodItem("Chicago Pizza", 3, 450),
        FoodItem("New York-Style Pizza", 4, 330),
        FoodItem("Sicilian Pizza", 5, 600),
        FoodItem("Greek Pizza", 5, 150),
        FoodItem("Greek California", 3, 200)
    )

    override fun getFoodItem(): FoodItem {
        val foodItemIndex = (0 until foodList.size).random()
        return foodList[foodItemIndex]
    }
}