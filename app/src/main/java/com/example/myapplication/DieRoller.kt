package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.ParseException
import kotlin.random.Random
import kotlin.text.Typography.times

class DieRoller : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_die_roller)
        val b1 = findViewById<Button>(R.id.d2_b);
        val b2 = findViewById<Button>(R.id.d3_b);
        val b3 = findViewById<Button>(R.id.d4_b);
        val b4 = findViewById<Button>(R.id.d6_b);
        val b5 = findViewById<Button>(R.id.d8_b);
        val b6 = findViewById<Button>(R.id.d10_b);
        val b7 = findViewById<Button>(R.id.d12_b);
        val b8 = findViewById<Button>(R.id.d20_b);
        val b9 = findViewById<Button>(R.id.d100_b);
        val amount = findViewById<EditText>(R.id.Amount);
        val cout = findViewById<TextView>(R.id.outText);
        var roll : Int

        b1.setOnClickListener { displayDieRoll(2,cout, amount) }

        b2.setOnClickListener { displayDieRoll(3,cout, amount) }

        b3.setOnClickListener { displayDieRoll(4,cout, amount) }

        b4.setOnClickListener { displayDieRoll(6,cout, amount) }

        b5.setOnClickListener { displayDieRoll(8,cout, amount) }

        b6.setOnClickListener { displayDieRoll(10,cout, amount) }

        b7.setOnClickListener { displayDieRoll(12,cout, amount) }

        b8.setOnClickListener { displayDieRoll(20,cout, amount) }

        b9.setOnClickListener { displayDieRoll(100,cout, amount) }
    }

    fun displayDieRoll(die : Int, cout : TextView, amount : EditText){
        try {
            var multiplier : Int = 1
            if (!amount.text.toString().isEmpty())
                multiplier = Integer.parseInt(amount.text.toString())
            cout.setText(Random.nextInt(1, multiplier * die + 1).toString())
            println("d$die with $multiplier")
        }
        catch (e : ParseException){
            Toast.makeText(this, "Not Parsing correctly",Toast.LENGTH_SHORT).show()
        }
    }
}