package com.george.my_fridge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val createButton = findViewById<Button>(R.id.create_button)
        val eatButton = findViewById<Button>(R.id.eat_button)

        val eatCounter = findViewById<TextView>(R.id.counter)

        createButton.setOnClickListener(){
            eatCounter.text = "${++counter}"
        }

        eatButton.setOnClickListener(){
            eatCounter.text = "${--counter}"
            if (counter < 0) eatCounter.text = "Ты че жрать-то собрался??!!"
        }


    }
}