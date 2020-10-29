package com.example.acupofbond

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signUp = findViewById<Button>(R.id.signUp).setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }

        val signIn = findViewById<Button>(R.id.signIn).setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }
    }
}