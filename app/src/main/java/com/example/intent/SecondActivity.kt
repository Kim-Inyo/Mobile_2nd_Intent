package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val Limit:Int = intent.getStringExtra("Limit").toString().toInt()
        val Generated = findViewById<TextView>(R.id.Generated)
        val value = (0..Limit).random().toString()
        Generated.setText(value)
    }

    fun BackToMainActivity(view: View) {
        val i2 = Intent(this@SecondActivity, MainActivity::class.java)
        this@SecondActivity.startActivity(i2)
    }
}