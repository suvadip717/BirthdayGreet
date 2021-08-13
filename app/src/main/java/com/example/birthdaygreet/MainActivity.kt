package com.example.birthdaygreet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {
        val enterName=findViewById<EditText>(R.id.enterName)
        val name = enterName.editableText.toString()
//        Toast.makeText(this,"Enter Name is $name", Toast.LENGTH_LONG).show()
        val intent=Intent(this,BirthdayCard::class.java)
        intent.putExtra(BirthdayCard.NAME_EXTRA,name)
        startActivity(intent)
    }
}