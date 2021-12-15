package com.example.clickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // get reference to button
        val btnClickMe = findViewById(R.id.button) as Button
        val myTextView = findViewById(R.id.textView) as TextView
        var counter = 0
        // set on-click listener
        btnClickMe.setOnClickListener {
            counter = counter + 1
            myTextView.text = counter.toString()
            Toast.makeText(this@MainActivity, "clicked", Toast.LENGTH_SHORT).show()
        }
        myTextView.setOnClickListener{
            counter = 0
            myTextView.text = counter.toString()
            Toast.makeText(this@MainActivity, "restored", Toast.LENGTH_SHORT).show()
        }
    }
}