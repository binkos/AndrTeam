package com.hackaton.andrteam.alcoholdiary.view.main

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.hackaton.andrteam.alcoholdiary.R

class MainActivty : AppCompatActivity() {

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this, MainViewModelFactory())
            .get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initObservers()
        viewModel.getUser()
    }

    private fun initObservers() {
        viewModel
            .userLiveData
            .observe(this) {
                Toast.makeText(this, it.toString(), Toast.LENGTH_LONG).show()
            }
    }
}