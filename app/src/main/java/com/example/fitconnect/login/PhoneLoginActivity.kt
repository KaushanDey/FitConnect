package com.example.fitconnect.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.fitconnect.R
import com.example.fitconnect.databinding.ActivityLoginBinding
import com.example.fitconnect.databinding.ActivityPhoneLoginBinding

class PhoneLoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPhoneLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_phone_login)

    }
}