package com.example.interfaces

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SeniorHomepageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.seniorhomepage)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.seniorMain)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // System Status Buttons
        findViewById<Button>(R.id.btnAvailableTickets).setOnClickListener {
            startActivity(Intent(this, MentorDashActivity::class.java))
        }

        findViewById<Button>(R.id.btnSessionsBooked).setOnClickListener {
            startActivity(Intent(this, BookingsActivity::class.java))
        }

        findViewById<Button>(R.id.btnResolvedTickets).setOnClickListener {
            // Re-using MentorDash or similar for now as a placeholder
            startActivity(Intent(this, MentorDashActivity::class.java))
        }

        // Main Action Buttons
        findViewById<Button>(R.id.btnTimetable).setOnClickListener {
            startActivity(Intent(this, SettingsMentorActivity::class.java))
        }

        findViewById<Button>(R.id.btnActiveChats).setOnClickListener {
            startActivity(Intent(this, ActiveChatActivity::class.java))
        }

        // Bottom Navigation
        findViewById<LinearLayout>(R.id.navHome).setOnClickListener {
            // Already here
        }

        findViewById<LinearLayout>(R.id.navActiveChats).setOnClickListener {
            startActivity(Intent(this, ActiveChatActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.navBookings).setOnClickListener {
            startActivity(Intent(this, BookingsActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.navProfile).setOnClickListener {
            startActivity(Intent(this, SettingsMentorActivity::class.java))
        }
    }
}