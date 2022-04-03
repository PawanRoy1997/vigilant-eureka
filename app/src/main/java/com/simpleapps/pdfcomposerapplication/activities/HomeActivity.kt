package com.simpleapps.pdfcomposerapplication.activities

import androidx.recyclerview.widget.GridLayoutManager
import com.simpleapps.customlibrary.baseClasses.BaseActivity
import com.simpleapps.pdfcomposerapplication.databinding.ActivityHomeBinding

class HomeActivity : BaseActivity<ActivityHomeBinding>() {
    override fun initView() {
        binding.filesRecyclerView.layoutManager = GridLayoutManager(this, 3)
    }

    override fun createLayout(): ActivityHomeBinding {
        return ActivityHomeBinding.inflate(layoutInflater)
    }

    override fun handleAds() {
//        TODO: Handle Ads Here
    }
}