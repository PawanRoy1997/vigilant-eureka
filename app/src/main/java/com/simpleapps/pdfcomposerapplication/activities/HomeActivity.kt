package com.simpleapps.pdfcomposerapplication.activities

import androidx.recyclerview.widget.GridLayoutManager
import com.simpleapps.pdfcomposerapplication.databinding.ActivityHomeBinding
import com.simpleapps.simplelibrary.activities.BaseActivity

class HomeActivity : BaseActivity<ActivityHomeBinding>() {
    override fun initViews() {
        view.filesRecyclerView.layoutManager = GridLayoutManager(this, 3)
    }

    override fun setView(): ActivityHomeBinding {
        return ActivityHomeBinding.inflate(layoutInflater)
    }
}