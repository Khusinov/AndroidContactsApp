package com.khusinov.androidcontactapp.utills

import android.content.Context
import android.content.SharedPreferences
import com.khusinov.androidcontactapp.model.Contact

object MySharedPreferences {
    private const val NAME = "ContactApp"
    private const val MODE = Context.MODE_PRIVATE
    private lateinit var preferences: SharedPreferences

    fun init(context: Context) {
        preferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operation(editor)
        editor.apply()
    }

    var contact: String?

        get() = preferences.getString("key1", "bug")

        set(value) = preferences.edit {
            if (value != null) {
                it.putString("key1", value)
            }
        }


}