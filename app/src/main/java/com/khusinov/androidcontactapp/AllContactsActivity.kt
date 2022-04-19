package com.khusinov.androidcontactapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import com.khusinov.androidcontactapp.model.Contact
import com.khusinov.androidcontactapp.utills.MySharedPreferences
import kotlinx.android.synthetic.main.activity_add_contact.*
import kotlinx.android.synthetic.main.activity_all_contacts.*

class AllContactsActivity : AppCompatActivity() {
    var gson : Gson? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_contacts)

        gson = Gson()

        var str = MySharedPreferences.contact
        var contact = gson!!.fromJson(str , Contact::class.java)

        val name1 = contact.name.toString()
        val number1 = contact.number.toString()

        Log.d("myTag" , name1)
        Log.d("myTag", number1)


        nametv.text = name1
        numbertv.text = number1
    }
}