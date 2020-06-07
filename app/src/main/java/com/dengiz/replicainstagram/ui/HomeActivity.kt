package com.dengiz.replicainstagram.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dengiz.replicainstagram.R
import com.dengiz.replicainstagram.enums.BottomItemTypes
import com.dengiz.replicainstagram.util.HomePagerAdapter
import com.dengiz.replicainstagram.util.setupNavigationView
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setupNavigationView(this, bottomNavigationView, BottomItemTypes.ITEM_HOME.id)
        setupHomeViewPager()
    }

    private fun setupHomeViewPager() {
        val homePagerAdapter = HomePagerAdapter(supportFragmentManager)
        homePagerAdapter.addFragment(CameraFragment())
        homePagerAdapter.addFragment(HomeFragment())
        homePagerAdapter.addFragment(MessageFragment())

        viewPagerHome.adapter = homePagerAdapter
        viewPagerHome.currentItem = 1 //Ilk baslatilacak olan fragment
    }


}