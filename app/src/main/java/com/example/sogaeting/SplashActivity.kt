package com.example.sogaeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import com.example.sogaeting.auth.IntroActivity
import com.google.firebase.auth.FirebaseAuth
import javax.xml.datatype.DatatypeConstants.DURATION

class SplashActivity : AppCompatActivity() {

    private val TAG = "SplashActivity"

    private val auth = FirebaseAuth.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //val uid = auth.currentUser?.uid.toSTring()

        val uid = FirebaseAuthUtiles.getUid()

        Log.d(TAG, auth.currentUser?.uid.toString())

        if (uid =="null") {

            Handler().postDelayed({
                val intent = Intent(this, IntroActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                startActivity(intent)
                finish()

            }, 3000)

        } else {

            Handler().postDelayed({
                val intent = Intent(this, IntroActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                startActivity(intent)
                finish()

            }, 3000)


        }


    }
}