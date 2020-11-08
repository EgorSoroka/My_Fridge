package com.george.my_fridge

/**
 *  @author George Magpie
 *
 */

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import com.george.my_fridge.GroceryList as GroceryList1


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counter = findViewById<TextView>(R.id.counter)
        val textProducts = findViewById<TextView>(R.id.textProducts)
        val createName = findViewById<TextView>(R.id.create_product_name)

        val createButton = findViewById<Button>(R.id.create_button)
        val openGrocery = findViewById<Button>(R.id.open_grovery)

        }
        fun openGrocery(view: View){
            val intent = Intent(this, GroceryList1::class.java)
            startActivity(intent)
        }

    }

