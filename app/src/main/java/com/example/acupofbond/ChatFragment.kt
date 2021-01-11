package com.example.acupofbond

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_chat.view.*

class ChatFragment: Fragment(R.layout.fragment_chat) {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_chat, container, false)
        val chatSatu = Intent (activity, ChatroomActivity::class.java)

        view.profile_1.setOnClickListener{
            activity?.startActivity(chatSatu)
        }

        return view
    }

}