package com.simpleapps.pdfcomposerapplication.activities

import android.annotation.SuppressLint
import com.simpleapps.pdfcomposerapplication.databinding.ActivitySplashBinding
import com.simpleapps.simplelibrary.activities.BaseActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseActivity<ActivitySplashBinding>() {
    override fun initViews() {
    }

    override fun setView(): ActivitySplashBinding {
        return ActivitySplashBinding.inflate(layoutInflater)
    }
}