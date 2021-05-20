package com.example.didyougetit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var loginId: EditText
    private lateinit var loginPw: EditText

    private val SIGN_UP_REQUEST_CODE = 101

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginId = findViewById(R.id.edittext_login_id)
        loginPw = findViewById(R.id.edittext_login_pw)

        val loginButton = findViewById<Button>(R.id.button_login)
        loginButton.setOnClickListener {
            val id = loginId.text.toString()
            val pw = loginPw.text.toString()

            TODO("check from database")

            loginId.setText("")
            loginPw.setText("")

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("id", id)
            intent.putExtra("pw", pw)
            startActivity(intent)
        }

        val signUpButton = findViewById<Button>(R.id.button_signup)
        signUpButton.setOnClickListener {
            startActivityForResult(Intent(this, SignUpActivity::class.java), SIGN_UP_REQUEST_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == SIGN_UP_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                Toast.makeText(this, "Success sign up", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Failed sign up", Toast.LENGTH_LONG).show()
            }
        }
    }
}