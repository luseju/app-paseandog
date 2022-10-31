package com.example.app_paseandog;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity
import com.example.app_paseandog.databinding.ActivityLoginBinding

class login : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_login)
    }
}
