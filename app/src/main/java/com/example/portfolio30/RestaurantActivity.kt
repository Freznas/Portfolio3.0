package com.example.portfolio30
// Activity to display my Restaurant project and the button that when clicked will take you to my GitHub link.

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RestaurantActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant)

        val btnOpenLink: Button = findViewById(R.id.btn_restaurant)

        btnOpenLink.setOnClickListener {
            val url = "https://github.com/Freznas/Restaurant_Menu.git"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}