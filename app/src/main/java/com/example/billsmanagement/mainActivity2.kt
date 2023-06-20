package com.example.billsmanagement

import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import  com.google.android.material.textfield.TextInputEditText


class mainActivity2 : AppCompatActivity() {
    lateinit var emailOrUsernameEditText: TextInputEditText
    lateinit var passwordEditText: TextInputEditText

    lateinit var loginButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        // View binding
        val UsernameLayout: TextView = findViewById(R.id.ivauto)
//            UsernameEditText = UsernameLayout.editText!!


        loginButton = findViewById(R.id.ivauto)
        loginButton.setOnClickListener {
            if (validateInput()) {
            }
        }
    }

    private fun validateInput(): Boolean {
        val emailOrUsername = emailOrUsernameEditText.text.toString().trim()
        val password = passwordEditText.text.toString().trim()


        return true
    }
}






