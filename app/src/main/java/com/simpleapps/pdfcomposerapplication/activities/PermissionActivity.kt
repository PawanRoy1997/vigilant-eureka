package com.simpleapps.pdfcomposerapplication.activities

import com.simpleapps.pdfcomposerapplication.databinding.ActivityPermissionBinding
import com.simpleapps.simplelibrary.activities.BaseActivity

class PermissionActivity : BaseActivity<ActivityPermissionBinding>() {
    override fun initViews() {

    }

    override fun setView(): ActivityPermissionBinding {
        return ActivityPermissionBinding.inflate(layoutInflater)
    }
}