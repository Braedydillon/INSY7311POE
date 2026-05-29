package com.example.interfaces

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.button.MaterialButton

class JuniorHomepageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.juniorhomepage)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.juniorMain)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, 0)
            insets
        }

        // Main Action Buttons
        findViewById<MaterialButton>(R.id.btnSubmitTicket).setOnClickListener {
            startActivity(Intent(this, TicketSubmissionActivity::class.java))
        }

        findViewById<MaterialButton>(R.id.btnBookSession).setOnClickListener {
            startActivity(Intent(this, BookingsActivity::class.java))
        }

        // Bottom Navigation
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomNav.selectedItemId = R.id.navJuniorHome
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navJuniorHome -> true
                R.id.navJuniorBookings -> {
                    startActivity(Intent(this, BookingsActivity::class.java))
                    true
                }
                R.id.navJuniorProfile -> {
                    startActivity(Intent(this, SettingsMentorActivity::class.java))
                    true
                }
                else -> false
            }
        }
    }
}