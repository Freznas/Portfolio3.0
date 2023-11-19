package com.example.portfolio30
// Activity to display my BMI Calculator Group project and the button that when clicked will
// take you to our GitHub link.

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        "https://github.com/Freznas/furious_criminals_kalkylator.git"

        val btnOpenLink: Button = findViewById(R.id.btn_calculator)

        btnOpenLink.setOnClickListener {
            val url =  "https://github.com/Freznas/furious_criminals_kalkylator.git"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}