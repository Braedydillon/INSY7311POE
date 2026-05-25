package com.example.interfaces

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class JuniorHomepageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.juniorhomepage)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.juniorMain)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Main Action Buttons
        findViewById<Button>(R.id.btnSubmitTicket).setOnClickListener {
            startActivity(Intent(this, TicketSubmissionActivity::class.java))
        }

        findViewById<Button>(R.id.btnBookSession).setOnClickListener {
            startActivity(Intent(this, BookingsActivity::class.java))
        }

        // Bottom Navigation
        findViewById<LinearLayout>(R.id.navJuniorHome).setOnClickListener {
            // Already here
        }

        findViewById<LinearLayout>(R.id.navJuniorBookings).setOnClickListener {
            startActivity(Intent(this, BookingsActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.navJuniorProfile).setOnClickListener {
            startActivity(Intent(this, SettingsMentorActivity::class.java))
        }
    }
}