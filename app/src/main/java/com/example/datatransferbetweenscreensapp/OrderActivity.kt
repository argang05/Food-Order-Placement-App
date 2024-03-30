package com.example.datatransferbetweenscreensapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val orderPlacementTV = findViewById<TextView>(R.id.orderPlacementTV);
        val goBackButton = findViewById<Button>(R.id.goBackButton);

        //Receive/GET The Order Message Data from intent using KEY:
        val orderPlacementMessage = intent.getStringExtra(MainActivity.KEY);

        //Set the Order Message Data in the textView:
        orderPlacementTV.text = orderPlacementMessage.toString();

        goBackButton.setOnClickListener {
            //On Clicking GoBack Button the user should be Navigated to the Home/Order Placing Screen
            val intent = Intent(this, MainActivity::class.java);
            startActivity(intent)
        }
    }
}