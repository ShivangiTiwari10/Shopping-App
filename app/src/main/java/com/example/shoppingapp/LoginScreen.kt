package com.example.shoppingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shoppingapp.databinding.ActivityLoginScreenBinding

class LoginScreen : AppCompatActivity() {

    private lateinit var binding: ActivityLoginScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()

    }
}