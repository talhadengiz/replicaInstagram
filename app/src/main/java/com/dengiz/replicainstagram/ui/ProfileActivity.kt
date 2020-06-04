package com.dengiz.replicainstagram.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dengiz.replicainstagram.R
import com.dengiz.replicainstagram.enums.BottomItemTypes
import com.dengiz.replicainstagram.util.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_home.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setupNavigationView()
    }

    private fun setupNavigationView() {
        BottomNavigationViewHelper setupBottomNavigationView bottomNavigationView
        BottomNavigationViewHelper.setupNavigation(this, bottomNavigationView)
        val menu = bottomNavigationView.menu
        val menuItem = menu.getItem(BottomItemTypes.ITEM_PROFILE.id)
        menuItem.isChecked = true
    }
}