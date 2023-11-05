package com.devdroid.ca3_final_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val quantityTextView = findViewById<TextView>(R.id.quantityTextView2)
        val plusButton = findViewById<Button>(R.id.plusButton2)
        val minusButton = findViewById<Button>(R.id.minusButton1)

        val login =findViewById<Button>(R.id.h)
        login.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}