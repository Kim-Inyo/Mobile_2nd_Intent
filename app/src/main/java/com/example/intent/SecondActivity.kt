package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.lang.Math.abs

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var Limit:Int = intent.getStringExtra("Limit").toString().toInt()
        var Generated = findViewById<TextView>(R.id.Generated)
        var value = (0..abs(Limit)).random()
        if (Limit < 0)
            value *= -1
        Generated.setText(value.toString())
    }

    fun ToHome(view: View) {
        val i2 = Intent(this@SecondActivity, MainActivity::class.java)
        this@SecondActivity.startActivity(i2)
    }

    fun BackToMainActivity(view: View) {
        val i2 = Intent(this@SecondActivity, FirstActivity::class.java)
        this@SecondActivity.startActivity(i2)
    }
}