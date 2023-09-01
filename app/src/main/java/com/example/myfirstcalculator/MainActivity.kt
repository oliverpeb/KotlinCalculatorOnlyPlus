package com.example.myfirstcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myfirstcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // important

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)


    binding.buttonEquals.setOnClickListener {

        val firstNumber = binding.editTextFirstNumber.text.toString().toDouble()
        val secondNumber = binding.editTextSecondNumber.text.toString().toDouble()

        val result = firstNumber + secondNumber
        binding.textView2.text = result.toString()




    }





    }
}