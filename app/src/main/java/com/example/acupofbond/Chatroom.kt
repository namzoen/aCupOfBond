package com.example.acupofbond

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import kotlinx.android.synthetic.main.chatroom.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Chatroom:AppCompatActivity() {
    private val messageAdapter = GroupAdapter<GroupieViewHolder>()

    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    recyclerView.adapter = messageAdapter
    populateData()

        button.setOnClickListener {
            val message = Message(text = editText.text.toString(), sendBy = "me")
           // val sendMessageItem = SendMessageItem(message)

            //messageAdapter.add(sendMessageItem)
            editText.text.clear()

            receiveAutoResponse()
        }
    }

    private fun populateData() {
        val data = listOf<Message>()
        data.forEach {
//            if (it.sendBy == "me") {
//                messageAdapter.add(SendMessageItem(it))
//            } else {
//                messageAdapter.add(ReceiveMessageItem(it))
//            }
        }
    }

    private fun receiveAutoResponse() {
        GlobalScope.launch(Dispatchers.Main) {
            delay(1000)
            val receive = Message(text = "Salut l'amis j'espere que vous allez bien, je suis tres bien j'ai manger to day", sendBy = "me")
            //val receiveItem = ReceiveMessageItem(receive)

            //messageAdapter.add(receiveItem)
        }
    }
}

//class SendMessageItem(private val message: Message) : BindableItem<ItemMessageSendBinding>() {
//    override fun getLayout(): Int {
//        return R.layout.my_bubble_shape
//    }
//
//    override fun bind(viewBinding: ItemMessageSendBinding, position: Int) {
//        viewBinding.message = message
//    }
//}
//
//class ReceiveMessageItem(private val message: Message) : BindableItem<ItemMessageReceiveBinding>() {
//    override fun getLayout(): Int {
//        return R.layout.friend_bubble_shape
//    }
//
//    override fun bind(viewBinding: ItemMessageReceiveBinding, position: Int) {
//        viewBinding.message = message
//    }
//}