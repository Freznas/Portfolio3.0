package com.example.portfolio30
// Activity to display my Blender project and the button that when clicked will take you to a
// showcase site for the project.
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BlenderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blender)

        val btnOpenLink: Button = findViewById(R.id.btn_blender)

        btnOpenLink.setOnClickListener {
            val url = "https://v3d.net/deh"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}