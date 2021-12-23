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
        val mytextView1 = findViewById(R.id.textView1) as TextView
        var counter = 0
        var store = 0

        // set on-click listener
        btnClickMe.setOnClickListener {
            counter = counter + 1
            store = counter
            myTextView.text = "You Clicked : " + counter.toString()
        }
        myTextView.setOnClickListener{
            mytextView1.text = "Save :" + store
            counter = 0
            myTextView.text = "You Clicked : " + counter.toString()
            Toast.makeText(this@MainActivity, "restored", Toast.LENGTH_SHORT).show()
        }
        mytextView1.setOnClickListener{
            counter = store
            myTextView.text = "You Clicked : " + counter.toString()
        }

    }
}