package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class FirstActivity : AppCompatActivity() {
    private lateinit var textView: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        textView = findViewById(R.id.Limit)
    }

    fun ToHome(view: View) {
        val i = Intent(this@FirstActivity, MainActivity::class.java)
        this@FirstActivity.startActivity(i);
    }

    fun Increase(view: View) {
        var cur = textView.text.toString().toInt()
        cur += 1
        textView.setText(cur.toString())
    }

    fun Decrease(view: View) {
        var cur = textView.text.toString().toInt()
        cur -= 1
        textView.setText(cur.toString())
    }

    fun Generate(view: View) {
        val i = Intent(this@FirstActivity, SecondActivity::class.java)
        var limit = findViewById<EditText>(R.id.Limit).text.toString()
        i.putExtra("Limit", limit)
        this@FirstActivity.startActivity(i);
        /*val tempTost = Toast.makeText(this, "Hello!", Toast.LENGTH_SHORT)
        tempTost.show()*/
    }
}