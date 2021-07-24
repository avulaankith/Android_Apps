package com.example.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private lateinit var diceImage: ImageView // late init says its not a null value and initialises it beforehand

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button) //since find view by id takes a lot of energy we declare it outside of function
        rollButton.text = getString(R.string.lets_roll)
//        rollButton.setOnClickListener {
//            Toast.makeText(this, "Button is Clicked!", Toast.LENGTH_SHORT).show()
//        }
        diceImage = findViewById(R.id.dice_image)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text="0"
//        val diceImage: ImageView = findViewById(R.id.dice_image)
        //        resultText.text=randomInt.toString()
        val drawableImage = when (Random.nextInt(1,6)){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        diceImage.setImageResource(drawableImage)
    }
}

