package com.example.acupofbond

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment=ExploreFragment()
        val secondFragment=VideoFragment()
        val thirdFragment=ChatFragment()
        val fourthFragment=ProfileFragment()

        setCurrentFragment(firstFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.exploreTab->setCurrentFragment(firstFragment)
                R.id.videoCallTab->setCurrentFragment(secondFragment)
                R.id.chatTab->setCurrentFragment(thirdFragment)
                R.id.profileTab->setCurrentFragment(fourthFragment)
            }
            true
        }

    }

    private fun setCurrentFragment(fragment:Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }

}
