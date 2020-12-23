package com.example.acupofbond

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_name.*

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        nextBtn.setOnClickListener {
            startActivity(Intent(this, GenderActivity::class.java))
        }

        backBtn.setOnClickListener {
            finish()
        }
    }
}