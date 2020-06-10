package com.dengiz.replicainstagram.ui.profile

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.dengiz.replicainstagram.R
import com.dengiz.replicainstagram.enums.BottomItemTypes
import com.dengiz.replicainstagram.util.extStartActivity
import com.dengiz.replicainstagram.util.setupNavigationView
import kotlinx.android.synthetic.main.activity_profile_settings.*


class ProfileSettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_settings)
        imgBack.setOnClickListener {
            this extStartActivity ProfileActivity::class.java
        }
        setupNavigationView(this, bottomNavigationView, BottomItemTypes.ITEM_PROFILE.id)
        fragmentNavigations()
    }

    override fun onBackPressed() {
        constraitProfileSettings.visibility = View.VISIBLE
        super.onBackPressed()
    }

    private fun fragmentNavigations() {
        tvProfileEdit.setOnClickListener {
            constraitProfileSettings.visibility = View.GONE
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.profileSettingsContainer, ProfileEditFragment())
            transaction.addToBackStack("profileEditFragmentAdded")
            transaction.commit()
        }
    }


}