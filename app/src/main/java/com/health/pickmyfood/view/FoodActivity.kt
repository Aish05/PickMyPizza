package com.health.pickmyfood.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.health.pickmyfood.viewmodel.FoodViewModel
import com.health.pickmyfood.R
import com.health.pickmyfood.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.activity_food.*

class FoodActivity : AppCompatActivity() {

    private lateinit var viewModel: FoodViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView( R.layout.activity_food)
        setupViewModel()
        setupUI()
    }


    private fun setupUI() {

        btn_pick.setOnClickListener {
            viewModel.pickMyPizza()
        }

        viewModel.myPizza.observe(this, { food ->
            food?.let { foodItem->
                tv_name.text = foodItem.foodName
                tv_price.text = "Price ${foodItem.price}"
                tv_rating.text = "Rating ${foodItem.rating}"
            }
        })
    }

    private fun setupViewModel() {
        viewModel = ViewModelProviders.of(
            this,
            ViewModelFactory()
        ).get(FoodViewModel::class.java)
    }
}