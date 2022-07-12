package com.example.practical2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.rollButton)
        button.setOnClickListener{ rollDice()}
    }

    private fun rollDice() {
        val randomNumb = (1..6).random()
        val numberText: TextView = findViewById(R.id.numberText)
        val diceImg: ImageView = findViewById(R.id.diceImg)
        numberText.text = randomNumb.toString()
        val imgSrc = when (randomNumb){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        diceImg.setImageResource(imgSrc)

        Toast.makeText(this, randomNumb.toString(), Toast.LENGTH_SHORT).show()
    }
}