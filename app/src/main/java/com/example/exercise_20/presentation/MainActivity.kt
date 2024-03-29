package com.example.exercise_20.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercise_20.R
import com.example.exercise_20.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}