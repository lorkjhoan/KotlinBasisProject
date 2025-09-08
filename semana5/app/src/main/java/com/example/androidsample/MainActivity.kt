package com.example.androidsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencias a las vistas
        val dollarText = findViewById<EditText>(R.id.dollarText)
        val textView = findViewById<TextView>(R.id.txtHello)
        val button = findViewById<Button>(R.id.button)

        // Acción del botón
        button.setOnClickListener {
            if (dollarText.text.isNotEmpty()) {
                val dollarValue = dollarText.text.toString().toFloat()
                val euroValue = dollarValue * 0.85f
                textView.text = euroValue.toString()
            } else {
                textView.text = getString(R.string.no_value_string)
            }
        }
    }
}
