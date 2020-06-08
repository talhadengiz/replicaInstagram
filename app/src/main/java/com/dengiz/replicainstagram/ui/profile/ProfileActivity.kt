package com.dengiz.replicainstagram.ui.profile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dengiz.replicainstagram.R
import com.dengiz.replicainstagram.enums.BottomItemTypes
import com.dengiz.replicainstagram.util.extStartActivity
import com.dengiz.replicainstagram.util.setupNavigationView
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        imgViewProfileSettings.setOnClickListener {
            this extStartActivity ProfileSettingsActivity::class.java
        }
        setupNavigationView(this, bottomNavigationView, BottomItemTypes.ITEM_PROFILE.id)
    }


}