package com.example.diceroller

import android.annotation.SuppressLint
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val rollButton: Button= findViewById<Button>(R.id.roll_button)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text= "Lets Roll"
         diceImage=findViewById(R.id.dice_image)
        rollButton.setOnClickListener{
            //Toast.makeText(this,"Button Clicked",Toast.LENGTH_SHORT).show()

            //


            diceRolled()
        }
        }


    private fun diceRolled()
    {


        val resultS= Random().nextInt(6)+1
        val res= when(resultS)
        {
            1 ->R.drawable.dice_1
            2 ->R.drawable.dice_2
            3 ->R.drawable.dice_3
            4 ->R.drawable.dice_4
            5 ->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        diceImage.setImageResource(res)

    }

    }
