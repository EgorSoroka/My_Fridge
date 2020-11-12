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
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textQuantity.text = "!!!"
        }

        fun openGrocery(view: View){
            val intent = Intent(this, GroceryList1::class.java)
            startActivity(intent)
        }

    }
