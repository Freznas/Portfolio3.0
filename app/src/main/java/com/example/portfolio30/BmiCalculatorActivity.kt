package com.example.portfolio30
// Activity to display my BMI Calculator project and the button that when clicked will take you to my GitHub link.
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BmiCalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)

        val btnOpenLink: Button = findViewById(R.id.btn_bmi)

        btnOpenLink.setOnClickListener {
            val url = "https://github.com/Freznas/BMI_Calculator.git"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}