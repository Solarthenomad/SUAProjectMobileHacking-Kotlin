package com.example.sogaeting.utils


import com.google.firebase.auth.FirebaseAuth


class FirebaseAuthUtils {

    companion object {
        private lateinit var auth : FirebaseAuthUtils

        fun getUid() : String {
            auth = FirebaseAuth.getInstance()

            return auth.currentUser?.uid.toString()

        }
    }


}