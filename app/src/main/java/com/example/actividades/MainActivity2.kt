package com.example.actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button1 = findViewById(R.id.btnPag2)
        button2 = findViewById(R.id.btnPag3)
        button3 = findViewById(R.id.btnLogOut)
        button4 = findViewById(R.id.btnPag4)

        button3.setOnClickListener {
            logOut()

        }
        button1.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
    }
    private fun logOut() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}