package com.hackaton.andrteam.alcoholdiary.data.storage

import android.content.Context
import android.content.SharedPreferences
import com.hackaton.andrteam.alcoholdiary.data.network.entity.User

private const val PREFERENCES_STORAGE_NAME = "PREFERENCES_STORAGE_NAME"

class StorageManager(
    context: Context,
    private val prefs: SharedPreferences =
        context.getSharedPreferences(PREFERENCES_STORAGE_NAME, Context.MODE_PRIVATE)
) {
    fun saveInfoAboutUser(user: User) {
        prefs
            .edit()
            .putString("USER_KEY", user.toString())
            .apply()
    }
}