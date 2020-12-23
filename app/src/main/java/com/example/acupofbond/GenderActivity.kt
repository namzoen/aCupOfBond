package com.example.acupofbond

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_gender.*

class GenderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gender)

        nextBtn.setOnClickListener {
            startActivity(Intent(this, BirthdayActivity::class.java))
        }

        backBtn.setOnClickListener {
            finish()
        }
    }
}