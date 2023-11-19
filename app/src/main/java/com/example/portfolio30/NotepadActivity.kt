package com.example.portfolio30
// Activity to display my NotePad project and the button that when clicked will take you to my GitHub link.

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NotepadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notepad)

        val btnOpenLink: Button = findViewById(R.id.btn_notepad)

        btnOpenLink.setOnClickListener {
            val url = "https://github.com/Freznas/NotePad.git"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}