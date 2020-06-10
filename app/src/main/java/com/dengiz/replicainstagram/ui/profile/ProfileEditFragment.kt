package com.dengiz.replicainstagram.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dengiz.replicainstagram.R
import com.dengiz.replicainstagram.util.UniversalImageLoader
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.fragment_profile_edit.view.*

class ProfileEditFragment : Fragment() {
    lateinit var circleProfilePhoto: CircleImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile_edit, container, false)
        circleProfilePhoto = view.imgEditProfilePhoto
        loadProfilePhoto()
        view.imgClose.setOnClickListener {
            activity?.onBackPressed()
        }
        return view
    }

    private fun loadProfilePhoto() {
        val imgUrl =
            "www.pngitem.com/pimgs/m/146-1468479_my-profile-icon-blank-profile-picture-circle-hd.png"
        UniversalImageLoader.setImage(imgUrl, circleProfilePhoto, null, "https://")
    }

}