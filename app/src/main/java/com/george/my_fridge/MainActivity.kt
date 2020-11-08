package com.george.my_fridge

/**
 *  @author George Magpie
 *
 */

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    var counter: Int = 0
    val str = "Ты че жрать-то собрался??!!"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val createButton = findViewById<Button>(R.id.create_button)
        val eatButton = findViewById<Button>(R.id.eat_button)

        val eatCounter = findViewById<TextView>(R.id.counter)

        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt("counter")
            if (counter < 0) {
                eatCounter.text = str
            } else eatCounter.text = "${counter}"

        }

        createButton.setOnClickListener() {

            eatCounter.text = "${++counter}"
        }

        eatButton.setOnClickListener() {

            eatCounter.text = "${--counter}"
            if (counter < 0) eatCounter.text = str
        }

    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)
        savedInstanceState.putInt("counter", counter)

    }


}