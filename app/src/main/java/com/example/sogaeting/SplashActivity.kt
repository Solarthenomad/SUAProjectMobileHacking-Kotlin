package com.example.sogaeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.sogaeting.auth.IntroActivity
import javax.xml.datatype.DatatypeConstants.DURATION

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent = Intent(this, IntroActivity::class.java)
            //3초 있다가 IntroActivity로 옮겨준다는 의미
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            finish()
        },3000)
    }
}