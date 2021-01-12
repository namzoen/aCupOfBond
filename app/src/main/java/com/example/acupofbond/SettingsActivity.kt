package com.example.acupofbond

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_setting.*

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        backBtn.setOnClickListener{
            finish()
        }

        signOut.setOnClickListener{
            startActivity(Intent(this, IntroSliderActivity::class.java))
            finish()
        }
    }
}