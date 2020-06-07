package com.dengiz.replicainstagram.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dengiz.replicainstagram.R

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
      //  setupNavigationView(this,bottomNavigationView,BottomItemTypes.ITEM_PROFILE.id)
    }
}