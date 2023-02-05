package com.example.sogaeting.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.sogaeting.R
import com.google.android.material.textfield.TextInputEditText

class JoinActivity : AppCompatActivity() {

    private val TAG = "JoinActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        val joinBtn : Button = findViewById<Button>(R.id.joinBtn)
        joinBtn.setOnClickListener {

            val intent = Intent(this, JoinActivity::class.java)
            startActivity(intent)

            val email = findViewById<TextInputEditText>(R.id.emailArea)
            val pwd = findViewById<TextInputEditText>(R.id.pwdArea)


            Log.d(TAG, email.text.toString())
            Log.d(TAG,pwd.text.toString())
        }
    }
}