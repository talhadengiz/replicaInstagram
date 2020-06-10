package com.dengiz.replicainstagram.ui.profile

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.dengiz.replicainstagram.R
import com.dengiz.replicainstagram.enums.BottomItemTypes
import com.dengiz.replicainstagram.util.UniversalImageLoader
import com.dengiz.replicainstagram.util.extStartActivity
import com.dengiz.replicainstagram.util.setupNavigationView
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    lateinit var circleProfilePhoto: CircleImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        imgViewProfileSettings.setOnClickListener {
            this extStartActivity ProfileSettingsActivity::class.java
        }
        circleProfilePhoto = imgProfilePhoto
        loadProfilePhoto()
        btnEditProfile.setOnClickListener {
            containerActivityProfile.visibility = View.GONE
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frameEditProfile, ProfileEditFragment())
            transaction.addToBackStack("profileEditFragmentAdded")
            transaction.commit()
        }
        setupNavigationView(this, bottomNavigationView, BottomItemTypes.ITEM_PROFILE.id)
    }

    override fun onBackPressed() {
        containerActivityProfile.visibility = View.VISIBLE
        super.onBackPressed()
    }

    private fun loadProfilePhoto() {
        val imgUrl =
            "www.pngitem.com/pimgs/m/146-1468479_my-profile-icon-blank-profile-picture-circle-hd.png"
        UniversalImageLoader.setImage(imgUrl, circleProfilePhoto, progBarProfilePhoto, "https://")
    }


}