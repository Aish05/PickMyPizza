package com.health.pickmyfood.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.health.pickmyfood.viewmodel.FoodViewModel
import com.health.pickmyfood.R
import com.health.pickmyfood.viewmodel.ViewModelFactory
import com.health.pickmyfood.databinding.ActivityFoodBinding

class FoodActivity : AppCompatActivity() {

    private lateinit var viewModel: FoodViewModel
    private lateinit var viewDataBinding: ActivityFoodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_food)
        setupViewModel()
        setupUI()
    }


    private fun setupUI() {

        viewDataBinding.btnPick.setOnClickListener {
            viewModel.pickMyPizza()
        }

        viewModel.myPizza.observe(this, { food ->
            food?.let {
                viewDataBinding.tvName.text = it.foodName
                viewDataBinding.tvPrice.text = "Price ${it.price}"
                viewDataBinding.tvRating.text = "Rating ${it.rating}"
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