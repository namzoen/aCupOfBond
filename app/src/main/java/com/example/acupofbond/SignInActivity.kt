package com.example.acupofbond

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        clickListeners()
    }

    private fun clickListeners() {
        linkSignUp.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }

        inTrouble.setOnClickListener {
            startActivity(Intent(this, AccountRecoveryActivity::class.java))
        }
    }
}