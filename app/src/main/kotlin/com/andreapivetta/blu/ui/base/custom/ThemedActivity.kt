package com.andreapivetta.blu.ui.base.custom

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.andreapivetta.blu.R
import com.andreapivetta.blu.common.pref.AppSettingsImpl

/**
 * Created by andrea on 15/05/16.
 */
open class ThemedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        when (AppSettingsImpl.getTheme()) {
            "B" -> setTheme(R.style.BlueAppTheme)
            "P" -> setTheme(R.style.PinkAppTheme)
            "G" -> setTheme(R.style.GreenAppTheme)
            "D" -> setTheme(R.style.DarkTheme)
            else -> throw UnsupportedOperationException("No such theme")
        }
        super.onCreate(savedInstanceState)
    }
}