package com.example.acupofbond

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.chip.ChipGroup
import kotlinx.android.synthetic.main.activity_editprofile.*


class EditProfileActivity : AppCompatActivity() {
    var chipGroup: ChipGroup? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editprofile)

        chipGroup = findViewById(R.id.genderGroup)


        backBtn.setOnClickListener{
            finish()
        }
    }
}