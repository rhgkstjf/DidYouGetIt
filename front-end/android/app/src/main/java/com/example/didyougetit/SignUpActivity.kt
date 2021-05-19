package com.example.didyougetit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
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
            if (checkInformation()) {
                signUp()
            }
        }
    }

    private fun checkInformation(): Boolean {
        val id = signUpId.text.toString()
        val pw = signUpPw.text.toString()
        var result = false

        TODO("check from database")

        if (result) {
            return true
        } else {
            return false
        }
    }

    private fun signUp() {
        val intent = Intent()
        val id = signUpId.text.toString()
        val pw = signUpPw.text.toString()
        intent.putExtra("id", id)
        intent.putExtra("pw", pw)
        setResult(RESULT_OK, intent)
        finish()
    }
}