package com.example.acupofbond

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday.*

class BirthdayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday)

        nextBtn.setOnClickListener {
            startActivity(Intent(this, PersonaJamActivity::class.java))
        }

        backBtn.setOnClickListener {
            finish()
        }
    }
}