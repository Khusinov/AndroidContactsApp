package com.khusinov.androidcontactapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        allContacts.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                val intent = Intent(this@MainActivity, AllContactsActivity::class.java)
                startActivity(intent)
            }
        }
        )

        addContact.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                val intent = Intent(this@MainActivity, AddContactActivity::class.java)
                startActivity(intent)
            }
        }
        )
    }
}