package com.e444er.fcm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging
import kotlin.coroutines.resume

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FirebaseMessaging.getInstance().token
            .addOnCompleteListener { task ->
               val token = task.result

               Log.d("Token","tokennn:$token")
            }
    }
}