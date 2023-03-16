package com.example.fitconnect.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.fitconnect.R
import com.example.fitconnect.databinding.ActivityOtpactivityBinding

class OTPActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOtpactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_otpactivity)
    }
}