package com.eazyalgo.chatapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TechSupport : AppCompatActivity() {

    private lateinit var btnPhone: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tech_support)

        supportActionBar?.hide()

        btnPhone = findViewById(R.id.btnPhone)

        btnPhone.setOnClickListener{
            val callIntent: Intent = Uri.parse("tel:111222333").let { number ->
                Intent(Intent.ACTION_DIAL, number)
            }
        }
    }
}