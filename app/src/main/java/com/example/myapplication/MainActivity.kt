package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val butt = findViewById<Button>(R.id.bSayhello);
        val edtxt = findViewById<EditText>(R.id.input);



        butt.setOnClickListener(){
            var obj = SmsManager.getDefault()
            obj.sendTextMessage("5303095570",
            null, "Kotlin is cool",null,null)
            val intent = Intent(this, DieRoller::class.java).apply {
            }
            startActivity(intent)
        }
    }
}