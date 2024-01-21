package com.example.womensright

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DomesticViolence : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_domestic_violence)

        val helplineNumber :TextView = findViewById(R.id.helpline_number)
        helplineNumber.setOnClickListener {
            val phoneNumber = "8793088814"
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:$phoneNumber")
            startActivity(dialIntent)
        }

        val helplineWebsite :TextView = findViewById(R.id.helpline_website)
        helplineWebsite.setOnClickListener {
            val url = "http://ncw.nic.in/ncw-cells/complaint-investigation-cell"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}