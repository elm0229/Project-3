package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    private lateinit var detectiveButton: android.widget.ImageButton
    private lateinit var plumberButton: android.widget.ImageButton
    private lateinit var trashButton: android.widget.ImageButton
    private lateinit var catImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        detectiveButton = findViewById(R.id.detectiveButton)
        plumberButton = findViewById(R.id.plumberButton)
        trashButton = findViewById(R.id.trashButton)
        catImageView = findViewById(R.id.catImage)

        detectiveButton.setOnClickListener { displayImage(R.drawable.detectivecat) }
        plumberButton.setOnClickListener { displayImage(R.drawable.catplumber) }
        trashButton.setOnClickListener { displayImage(R.drawable.trashcat) }

    }

    private fun displayImage(imageResource: Int){
        catImageView.animate()
            .alpha(0f)
            .setDuration(300)
            .withEndAction {
                catImageView.setImageResource(imageResource)
                catImageView.animate()
                    .alpha(1f)
                    .setDuration(300)
                    .start()
            }
            .start()
    }
}