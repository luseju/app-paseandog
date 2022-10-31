package com.example.app_paseandog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Apppaseandog)
        Thread.sleep(3000)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}