package com.example.acupofbond

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.chatroom.*

class ChatroomActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chatroom)

        backBtn.setOnClickListener{
            finish()
        }
    }

}