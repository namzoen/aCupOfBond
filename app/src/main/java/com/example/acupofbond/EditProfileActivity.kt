package com.example.acupofbond

import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_editprofile.*


class EditProfileActivity : AppCompatActivity() {
    var radioGroup: RadioGroup? = null
    lateinit var genderRadio: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editprofile)

        radioGroup = findViewById(R.id.genderGroup)
        genderChoose(this)

        backBtn.setOnClickListener{
            finish()
        }
    }

    private fun genderChoose (v: EditProfileActivity){
        val selectedId = radioGroup!!.checkedRadioButtonId
        genderRadio = findViewById<View>(selectedId) as RadioButton
        if (selectedId == -1) {
            Toast.makeText(this, "Nothing selected", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, genderRadio.text, Toast.LENGTH_SHORT).show()
        }
    }
}