package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.Random

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    // rest of class definition
    fun showRandomNumber(){

        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        //Generate a random number
        val random = Random()
        var randomInt = 0
        // Add one because the bound is exclusive
        if (count > 0){
            // Add one because the bound is exclusive
            randomInt = random.nextInt(count+1)
        }

        // Display the random number.
        findViewById<TextView>(R.id.textview_random).text = Integer.toString(randomInt)

        // Substitute the max value into the string resource
        // for the heading, and update the heading
        findViewById<TextView>(R.id.textview_label).text = getString(R.string.random_heading, count)

    }
}
