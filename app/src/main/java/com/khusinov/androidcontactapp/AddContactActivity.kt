package com.khusinov.androidcontactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.gson.Gson
import com.khusinov.androidcontactapp.model.Contact
import com.khusinov.androidcontactapp.utills.MySharedPreferences
import kotlinx.android.synthetic.main.activity_add_contact.*

class AddContactActivity : AppCompatActivity() {
    lateinit var gson: Gson
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_contact)
        MySharedPreferences.init(this)

        gson = Gson()


        saveBtn.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                val name = name.text.toString()
                val number = number.text.toString()

                var contact = Contact(name , number)

                var str = gson.toJson(contact)
                MySharedPreferences.contact = str
                finish()
            }
        })
    }
}