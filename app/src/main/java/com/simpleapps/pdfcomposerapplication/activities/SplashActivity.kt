package com.simpleapps.pdfcomposerapplication.activities

import com.simpleapps.customlibrary.baseClasses.BareActivity
import com.simpleapps.pdfcomposerapplication.databinding.ActivitySplashBinding

class SplashActivity : BareActivity<ActivitySplashBinding>() {
    override fun initView() {
    }

    override fun createLayout(): ActivitySplashBinding {
        return ActivitySplashBinding.inflate(layoutInflater)
    }
}