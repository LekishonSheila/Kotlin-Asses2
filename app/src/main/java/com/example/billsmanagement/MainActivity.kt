package com.example.billsmanagement

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
     lateinit var usernameEditText: TextInputEditText
     lateinit var phoneEditText: TextInputEditText
     lateinit var emailEditText: TextInputEditText
     lateinit var passwordEditText: TextInputEditText
     lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameLayout: TextView = findViewById(R.id.ivName)
//        usernameEditText = usernameLayout.editText!!
        val phoneLayout: TextView = findViewById(R.id.ivphoneNumber)
//        phoneEditText = phoneLayout.te!!
        val emailLayout: TextView = findViewById(R.id.ivemail)
//        emailEditText = emailLayout.editText!!
        val passwordLayout: TextView = findViewById(R.id.ivpassword)
//        passwordEditText = passwordLayout.editableText!!

        nextButton = findViewById(R.id.button2)
        nextButton.setOnClickListener {
            if (validateInput()) {
                navigateToAuthentication()
            }
        }
    }

    private fun validateInput(): Boolean {
        val username = usernameEditText.text.toString().trim()
        val phone = phoneEditText.text.toString().trim()
        val email = emailEditText.text.toString().trim()
        val password = passwordEditText.text.toString().trim()


        return true
    }

    private fun navigateToAuthentication() {
        val intent = Intent(this, mainActivity2::class.java)
        startActivity(intent)
    }
}


