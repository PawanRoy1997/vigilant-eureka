package com.simpleapps.pdfcomposerapplication.activities

import android.content.Intent
import android.view.View
import com.simpleapps.pdfcomposerapplication.databinding.ActivityIntroBinding
import com.simpleapps.simplelibrary.activities.BaseActivity

class IntroActivity : BaseActivity<ActivityIntroBinding>() {

    override fun initViews() {
        view.continueButton.setOnClickListener(continueBtnListener())
    }

    private fun continueBtnListener(): View.OnClickListener {
        return View.OnClickListener { startActivity(Intent(this, HomeActivity::class.java)) }
    }

    override fun setView(): ActivityIntroBinding {
        return ActivityIntroBinding.inflate(layoutInflater)
    }
}