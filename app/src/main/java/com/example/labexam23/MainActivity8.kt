package com.example.labexam23

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        val btnNavigateHome: ImageButton = findViewById(R.id.nav_home)
        btnNavigateHome.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }

        val btnNavigateSearch: ImageButton = findViewById(R.id.nav_search)
        btnNavigateSearch.setOnClickListener {
            val intent = Intent(this, MainActivity11::class.java)
            startActivity(intent)
        }

        val btnNavigateFaq: ImageButton = findViewById(R.id.nav_faq)
        btnNavigateFaq.setOnClickListener {
            val intent = Intent(this, MainActivity12::class.java)
            startActivity(intent)
        }

        val btnNavigateAccount: ImageButton = findViewById(R.id.nav_account)
        btnNavigateAccount.setOnClickListener {
            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)
        }

        val btnNavigateAdd: ImageButton = findViewById(R.id.imageButton20)
        btnNavigateAdd.setOnClickListener {
            val intent = Intent(this, MainActivity13::class.java)
            startActivity(intent)
        }

        val btnNavigateLostList: Button = findViewById(R.id.lostBtn)
        btnNavigateLostList.setOnClickListener {
            val intent = Intent(this, MainActivity9::class.java)
            startActivity(intent)
        }
    }
}