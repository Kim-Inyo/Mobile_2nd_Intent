package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ToFirst(view: View) {
        val i = Intent(this@MainActivity, FirstActivity::class.java)
        this@MainActivity.startActivity(i);
        /*val tempTost = Toast.makeText(this, "Hello!", Toast.LENGTH_SHORT)
        tempTost.show()*/
    }

    fun ToThird(view: View) {
        val i = Intent(this@MainActivity, ThirdTask::class.java)
        this@MainActivity.startActivity(i);
        /*val tempTost = Toast.makeText(this, "Hello!", Toast.LENGTH_SHORT)
        tempTost.show()*/
    }
}