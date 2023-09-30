package com.example.actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var usuario: EditText
    private lateinit var password: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usuario = findViewById(R.id.txtUser)
        password = findViewById(R.id.txtPassword)
        button = findViewById(R.id.btnLogin)

        button.setOnClickListener {
            validarUser()
        }
    }
    private fun validarUser() {
        val user = usuario.text.toString()
        val clave = password.text.toString()
        if (user == "kakashi" && clave == "copion") {
            Toast.makeText(this, "Credenciales son correctas", Toast.LENGTH_SHORT).show()
            logSuccess()
        } else {
            Toast.makeText(this, "Credenciales son INcorrectas", Toast.LENGTH_SHORT).show()
        }
    }
    private fun logSuccess() {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
    override fun onBackPressed() {
        moveTaskToBack(false)
    }
}