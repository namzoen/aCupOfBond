package com.example.acupofbond

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_profile.view.*

class ProfileFragment:Fragment(R.layout.fragment_profile) {
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater!!.inflate(R.layout.fragment_profile, container, false)
        val settings = Intent (activity, SettingsActivity::class.java)
        val addPhotos = Intent(activity, AddPhotosActivity::class.java)
        val profileEdit = Intent (activity, EditProfileActivity::class.java)


        view.profileSettings.setOnClickListener{
            activity?.startActivity(settings)
        }

        view.profileAdd.setOnClickListener{
            activity?.startActivity(addPhotos)
        }

        view.profileEdit.setOnClickListener{
            activity?.startActivity(profileEdit)
        }
        return view
    }
}
