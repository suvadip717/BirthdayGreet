package com.example.birthdaygreet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayCard : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_card)
        val birthDayGreet=findViewById<TextView>(R.id.birthDayGreet)

        val name=intent.getStringExtra(NAME_EXTRA)
        birthDayGreet.text="Happy Birthday\n $name!"
    }
}