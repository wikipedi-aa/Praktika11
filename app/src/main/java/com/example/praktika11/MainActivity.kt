package com.example.praktika11

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var isImageOne = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


    }
    fun bt1 (view: View){
        val button1 : Button = findViewById(R.id.button)
        val imageView2 : ImageView = findViewById(R.id.imageView2)
        imageView2.setImageResource(R.drawable.lexa4)
    }

    fun onClickImage (view: View){
        isImageOne = !isImageOne
        val imageButton1 : ImageButton = findViewById(R.id.imageButton)
        if (isImageOne) {
            imageButton1.setImageResource(R.drawable.kizaru1)
        }
        else {
            imageButton1.setImageResource(R.drawable.kizaru2)
        }
    }
}