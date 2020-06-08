package com.dengiz.replicainstagram.util

import android.content.Context
import android.content.Intent
import android.view.MenuItem
import com.dengiz.replicainstagram.R
import com.dengiz.replicainstagram.ui.HomeActivity
import com.dengiz.replicainstagram.ui.NewsActivity
import com.dengiz.replicainstagram.ui.SearchActivity
import com.dengiz.replicainstagram.ui.ShareActivity
import com.dengiz.replicainstagram.ui.profile.ProfileActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomnavigation.LabelVisibilityMode
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx


/**     Code with ❤
╔════════════════════════════╗
║  Created by İ.Talha Dengiz ║
╠════════════════════════════╣
║    talhadengiz@gmail.com   ║
╠════════════════════════════╣
║      03/06/2020 - 22:32    ║
╚════════════════════════════╝
 */
class BottomNavigationViewHelper {
    companion object {
        infix fun setupBottomNavigationView(bottomNavigationViewEx: BottomNavigationViewEx) {
            bottomNavigationViewEx.enableAnimation(false)
            bottomNavigationViewEx.labelVisibilityMode =
                LabelVisibilityMode.LABEL_VISIBILITY_LABELED
            bottomNavigationViewEx.isItemHorizontalTranslationEnabled = false
            bottomNavigationViewEx.setTextVisibility(false)
            bottomNavigationViewEx
        }

        fun setupNavigation(context: Context, bottomNavigationViewEx: BottomNavigationViewEx) {
            bottomNavigationViewEx.onNavigationItemSelectedListener =
                object : BottomNavigationView.OnNavigationItemSelectedListener {
                    override fun onNavigationItemSelected(item: MenuItem): Boolean {
                        when (item.itemId) {
                            R.id.ic_home -> {
                                val intent = Intent(
                                    context,
                                    HomeActivity::class.java
                                ).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                                context.startActivity(intent)
                                return true
                            }
                            R.id.ic_news -> {
                                val intent = Intent(
                                    context,
                                    NewsActivity::class.java
                                ).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                                context.startActivity(intent)
                                return true
                            }
                            R.id.ic_profile -> {
                                val intent = Intent(
                                    context,
                                    ProfileActivity::class.java
                                ).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                                context.startActivity(intent)
                                return true
                            }
                            R.id.ic_search -> {
                                val intent = Intent(
                                    context,
                                    SearchActivity::class.java
                                ).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                                context.startActivity(intent)
                                return true
                            }
                            R.id.ic_share -> {
                                val intent = Intent(
                                    context,
                                    ShareActivity::class.java
                                ).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                                context.startActivity(intent)
                                return true
                            }
                        }
                        return false
                    }

                }
        }

    }

}

fun setupNavigationView(
    context: Context,
    bottomNavigationViewEx: BottomNavigationViewEx,
    item: Int
) {
    BottomNavigationViewHelper setupBottomNavigationView bottomNavigationViewEx
    BottomNavigationViewHelper.setupNavigation(context, bottomNavigationViewEx)
    val menu = bottomNavigationViewEx.menu
    val menuItem = menu.getItem(item)
    menuItem.isChecked = true
}