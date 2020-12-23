package com.example.acupofbond

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_personajam.*

class PersonaJamActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personajam)

        nextBtn.setOnClickListener {
            // startActivity(Intent(this, HomeActivity::class.java))
        }
        backBtn.setOnClickListener {
            finish()
        }
    }
}