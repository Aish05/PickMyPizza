package com.health.pickmyfood.model

/**
 * To hold single food info
 *
 * @property foodName
 * @property rating
 * @property price
 */
data class FoodItem(
    val foodName: String = "",
    val rating: Int = 0,
    val price: Int = 0
)
