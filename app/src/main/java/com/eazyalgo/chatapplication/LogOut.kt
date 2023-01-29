package com.eazyalgo.chatapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class LogOut : AppCompatActivity() {

    private  lateinit var btnLogOut: Button
    private  lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_out)

        supportActionBar?.hide()

        btnLogOut = findViewById(R.id.btnLogOut)
        mAuth = FirebaseAuth.getInstance()

        btnLogOut.setOnClickListener{
            mAuth.signOut()
            val intent = Intent(this@LogOut, Login::class.java)
            finish()
            startActivity(intent)
        }
    }


}