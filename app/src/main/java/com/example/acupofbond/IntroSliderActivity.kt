package com.example.acupofbond

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_intro_slider.*

class IntroSliderActivity : AppCompatActivity() {

    private val fragmentList = ArrayList<Fragment>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // making the status bar transparent
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP ) {
            window.decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }

        setContentView(R.layout.activity_intro_slider)
        val manager = PreferencesManager(this)

        if (!manager.isFirstRun()) {
            startActivity(Intent(this, SignInActivity::class.java))
        }
        val adapter = IntroSliderAdapter(this)
        vpIntroSlider.adapter = adapter

        fragmentList.addAll(listOf(
            Intro1Fragment(), Intro2Fragment(), Intro3Fragment()
        ))
        adapter.setFragmentList(fragmentList)

        indicatorLayout.setIndicatorCount(adapter.itemCount)
        indicatorLayout.selectCurrentPosition(0)

        registerListeners()
    }

    private fun registerListeners() {
        tvNext.setOnClickListener {
            val position = vpIntroSlider.currentItem

            if (position < fragmentList.lastIndex) {
                vpIntroSlider.currentItem = position + 1
            } else {
                startActivity(Intent(this, SignInActivity::class.java))
                finish()
            }
        }
    }
}