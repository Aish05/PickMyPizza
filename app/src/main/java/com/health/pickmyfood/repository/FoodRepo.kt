package com.health.pickmyfood.repository

import com.health.pickmyfood.model.FoodItem

/**
 * Data Layer to handle all operation related To Food
 *
 */
interface FoodRepo {

    /**
     * To get single food item from FoodList
     *
     * @return
     */
    fun getFoodItem() : FoodItem
}