package com.example.datatransferbetweenscreensapp
/*
-> In this project, we'll be learning the concept of transferring data between screens.
-> We'll be building and app that would take food orders from customer on one Screen(Main Activity) and
   display a message about the order details in the next Screen(Order Activity).
 */
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //Creating key for data:
    companion object{
        const val KEY = "com.example.datatransferbetweenscreensapp.MainActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonplaceOrder = findViewById<Button>(R.id.buttonplaceOrder);
        val order1 = findViewById<EditText>(R.id.order1);
        val order2 = findViewById<EditText>(R.id.order2);
        val order3 = findViewById<EditText>(R.id.order3);
        //Target the button and add setOnClickListener Event:
        buttonplaceOrder.setOnClickListener {
            //Create Message Data:
            val orderPlacedMessage = "Your Order Of:"+
                    "\n1.)"+order1.text.toString()+
                    "\n2.)"+order2.text.toString()+
                    "\n3.)"+order3.text.toString()+
                    "\nHas been Succesfully Placed!";

            //Create intent and move to next screen:
            val intent = Intent(this , OrderActivity::class.java);

            //Pass placedOrderMessage Data to intent:
            //putExtra() takes a key which we defined above and a value which is "orderPlacedMessage"
            intent.putExtra(KEY , orderPlacedMessage);

            //Start the OrderActivity:
            startActivity(intent);
        }

    }
}