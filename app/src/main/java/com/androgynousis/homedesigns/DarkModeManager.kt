package com.androgynousis.homedesigns

import android.content.Context
import android.content.SharedPreferences

class DarkModeManager(private var _context: Context) {

    private var pref: SharedPreferences
    private var editor: SharedPreferences.Editor
    private var PRIVATE_MODE = 0

    val isNightMode: Boolean get() = pref.getBoolean(IS_NIGHT_MODE, true)

    init {
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE)
        editor = pref.edit()
    }

    fun setDarkMode(isFirstTime: Boolean) {
        editor.putBoolean(IS_NIGHT_MODE, isFirstTime)
        editor.commit()
    }

    companion object {
        private val PREF_NAME = "education-dark-mode"
        private val IS_NIGHT_MODE = "IsNightMode"
    }

}