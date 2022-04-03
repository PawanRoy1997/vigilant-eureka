package com.simpleapps.pdfcomposerapplication.activities

import android.content.Intent
import android.view.View
import com.simpleapps.customlibrary.baseClasses.BaseActivity
import com.simpleapps.pdfcomposerapplication.databinding.ActivityIntroBinding

class IntroActivity : BaseActivity<ActivityIntroBinding>() {

    override fun initView() {
        binding.continueButton.setOnClickListener(continueBtnListener())
    }

    private fun continueBtnListener(): View.OnClickListener {
        return View.OnClickListener { startActivity(Intent(this, HomeActivity::class.java)) }
    }

    override fun createLayout(): ActivityIntroBinding {
        return ActivityIntroBinding.inflate(layoutInflater)
    }

    override fun handleAds() {
//        TODO: Implement and Handle Banner Ads Here
    }
}