package com.dengiz.replicainstagram.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dengiz.replicainstagram.R
import com.dengiz.replicainstagram.enums.BottomItemTypes
import com.dengiz.replicainstagram.util.setupNavigationView
import kotlinx.android.synthetic.main.activity_home.*

class ShareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setupNavigationView(this, bottomNavigationView, BottomItemTypes.ITEM_SHARE.id)
    }

}