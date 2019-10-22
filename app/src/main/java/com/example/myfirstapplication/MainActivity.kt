package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View){
        // val myToast = Toast.makeText(this, message, duration);
        val myToast = Toast.makeText(this, "Hello Toaster!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View){
        //Get the text view to update
       val showCountTextView = findViewById<TextView>(R.id.textView)

       //Get the val of showCountTextView
       val countString = showCountTextView.text.toString()

       //Convert and increment by 1
       var count: Int = Integer.parseInt(countString)
       count++

       //Display the new value
       showCountTextView.text = count.toString()


    }

    fun randomMe(view: View){

        // Create an Intent to start the second activity
        val randomIntent = Intent(this, SecondActivity::class.java)


        //Get the text view value of counter
        val showCountTextView = findViewById<TextView>(R.id.textView)


        //Get the val of showCountTextView
        val countString = showCountTextView.text.toString()

        //get count from countMe
        val count = Integer.parseInt(countString)

        //add count to random intent
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        // Start the new activity.
        startActivity(randomIntent)

    }

}
