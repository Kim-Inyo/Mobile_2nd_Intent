package com.example.intent

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.TextAppearanceSpan
import android.view.View
import android.widget.EditText
import android.widget.TextView

class ThirdTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_task)
    }

    fun AddTitle(view: View) {
        var title = findViewById<EditText>(R.id.Title).text.toString()
        var note = findViewById<EditText>(R.id.Note).text.toString()
        var titlenote = findViewById<TextView>(R.id.Title_Note)
        var text = title + "(" + note + ")\n"
        titlenote.append(text)
    }

    fun ToHome(view: View) {
        val i = Intent(this@ThirdTask, MainActivity::class.java)
        this@ThirdTask.startActivity(i);
        /*val tempTost = Toast.makeText(this, "Hello!", Toast.LENGTH_SHORT)
        tempTost.show()*/
    }
}