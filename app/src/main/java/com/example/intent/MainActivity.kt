package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var textView: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Generate(view: View) {
        val i = Intent(this@MainActivity, SecondActivity::class.java)
        var limit = findViewById<EditText>(R.id.Limit).text.toString()
        i.putExtra("Limit", limit)
        this@MainActivity.startActivity(i);
        /*val tempTost = Toast.makeText(this, "Hello!", Toast.LENGTH_SHORT)
        tempTost.show()*/
    }
}