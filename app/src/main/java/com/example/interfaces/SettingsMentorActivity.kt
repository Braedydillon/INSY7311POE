package com.example.interfaces

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SettingsMentorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.settingsmentor)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.settingsMain)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Bottom Navigation
        findViewById<LinearLayout>(R.id.navHome).setOnClickListener {
            // Check if we should go to Senior or Junior home, or just finishing if we came from there
            finish()
        }

        findViewById<LinearLayout>(R.id.navActiveChats).setOnClickListener {
            startActivity(Intent(this, ActiveChatActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.navBookings).setOnClickListener {
            startActivity(Intent(this, BookingsActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.navProfile).setOnClickListener {

        }
    }
}