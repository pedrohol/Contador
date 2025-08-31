package com.example.contador


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button: Button = findViewById(R.id.button)
        val resetButton: Button = findViewById(R.id.reset_button)
        val number: TextView = findViewById(R.id.txt_number)

        var sum = 0

        button.setOnClickListener {
            Toast.makeText(this,"Numero Adicionado", Toast.LENGTH_SHORT).show()
            sum += 1
            val soma = sum.toString()
            number.text = soma

        }

        resetButton.setOnClickListener {
            sum = 0
            number.text = sum.toString()
        }

    }
}