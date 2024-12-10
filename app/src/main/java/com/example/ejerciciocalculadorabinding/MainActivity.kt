package com.example.ejerciciocalculadorabinding

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ejerciciocalculadorabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.suma.setOnClickListener {

            val num1 = binding.numUno.text.toString().toInt()
            val num2 = binding.numDos.text.toString().toInt()
            val resultado = num1 + num2
            binding.resultado.text = resultado.toString()
        }

        binding.resta.setOnClickListener {

            val num1 = binding.numUno.text.toString().toInt()
            val num2 = binding.numDos.text.toString().toInt()
            val resultado = num1 - num2
            binding.resultado.text = resultado.toString()
        }

        binding.division.setOnClickListener {

            val num1 = binding.numUno.text.toString().toDouble()
            val num2 = binding.numDos.text.toString().toDouble()

            var resultado = ""

            if (num2 == 0.0) {
                resultado = "No se puede dividir por 0"
            } else {
                resultado = (num1 / num2).toString()
            }

            binding.resultado.text = resultado.toString()
        }

        binding.multiplicacion.setOnClickListener {

            val num1 = binding.numUno.text.toString().toInt()
            val num2 = binding.numDos.text.toString().toInt()
            val resultado = num1 * num2
            binding.resultado.text = resultado.toString()
        }






    }
}