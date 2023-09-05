package com.example.myfirstcalculator

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.spinnerWhatyouwant.onItemSelectedListener = this



        binding.buttonEquals.setOnClickListener {
            val firstNumber = binding.editTextFirstNumber.text.toString().toDoubleOrNull() ?: 0.0
            val secondNumber = binding.editTextSecondNumber.text.toString().toDoubleOrNull() ?: 0.0
            val operation = binding.spinnerWhatyouwant.selectedItem.toString()


            val result = when (operation) {
                "+" -> firstNumber + secondNumber
                "-" -> firstNumber - secondNumber
                "*" -> firstNumber * secondNumber
                "/" -> if (secondNumber != 0.0) firstNumber / secondNumber else Double.NaN
                else -> 0.0
            }

            binding.textView2.text = result.toString()
        }
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val operation = parent?.getItemAtPosition(position).toString()

        Toast.makeText(this, "$operation has been chosen", Toast.LENGTH_LONG).show()

    }

    override fun onNothingSelected(parent: AdapterView<*>) {

    }
}
