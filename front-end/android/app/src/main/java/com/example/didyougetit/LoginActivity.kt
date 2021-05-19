package com.example.didyougetit

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var loginId: EditText
    private lateinit var loginPw: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginId = findViewById(R.id.edittext_login_id)
        loginPw = findViewById(R.id.edittext_login_pw)

        val loginButton = findViewById<Button>(R.id.button_login)
        loginButton.setOnClickListener {
            TODO("Login process")
        }

        val signupButton = findViewById<Button>(R.id.button_signup)
        signupButton.setOnClickListener {
            TODO("Sign up process")
        }
    }
}