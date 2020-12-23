package com.example.acupofbond

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_account_recovery.*

class AccountRecoveryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_recovery)

        backBtn.setOnClickListener {
            finish()
        }

        nextBtn.setOnClickListener {
            //TODO
        }
    }
}