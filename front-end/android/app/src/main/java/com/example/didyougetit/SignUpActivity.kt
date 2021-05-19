package com.example.didyougetit

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    private lateinit var signUpId: EditText
    private lateinit var signUpPw: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sighup)

        signUpId = findViewById(R.id.edittext_signup_id)
        signUpPw = findViewById(R.id.edittext_signup_pw)

        val signUpButton = findViewById<Button>(R.id.button_signup)
        signUpButton.setOnClickListener {
            TODO("Sign up process")
        }
    }
}