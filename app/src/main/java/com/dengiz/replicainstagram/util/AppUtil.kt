package com.dengiz.replicainstagram.util

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity


/**     Code with ❤
╔════════════════════════════╗
║  Created by İ.Talha Dengiz ║
╠════════════════════════════╣
║    talhadengiz@gmail.com   ║
╠════════════════════════════╣
║      08/06/2020 - 22:46    ║
╚════════════════════════════╝
 */
infix fun <T> AppCompatActivity.extStartActivity(className: Class<T>) {
    startActivity(Intent(this, className).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION))
}