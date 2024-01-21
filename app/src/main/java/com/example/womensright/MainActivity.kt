package com.example.womensright

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayShowTitleEnabled(true)


        val domesticTextView: TextView = findViewById(R.id.domestic_violence_textView)
        val crimeTextView: TextView = findViewById(R.id.crime_text_view)
        val workplaceTextView: TextView = findViewById(R.id.workplace_text_view)

        domesticTextView.setOnClickListener {
            val i : Intent = Intent(this, DomesticViolence::class.java)
            startActivity(i)
        }
        crimeTextView.setOnClickListener {
            val j : Intent = Intent(this, CrimeAgainstWomen::class.java)
            startActivity(j)
        }
        workplaceTextView.setOnClickListener {
            val k : Intent = Intent(this, WorkplaceMistreatment::class.java)
            startActivity(k)
        }

    }

}