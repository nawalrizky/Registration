package com.example.registration

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.registration.MainActivity.Companion.EXTRA_EMAIL
import com.example.registration.MainActivity.Companion.EXTRA_NAME
import com.example.registration.MainActivity.Companion.EXTRA_PHONE
import com.example.registration.databinding.ActivityHomePageBinding

class HomePage : AppCompatActivity() {
    private lateinit var binding: ActivityHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(EXTRA_NAME)
        val email = intent.getStringExtra(EXTRA_EMAIL)
        val phone = intent.getStringExtra(EXTRA_PHONE)

        with(binding) {
            txtUsername.text = "$username"
            txtEmail.text = "$email"
            txtPhone.text = "$phone"

            btnLogout.setOnClickListener {
                val intentToMainActivity = Intent(this@HomePage,
                    MainActivity::class.java)
                startActivity(intentToMainActivity)
                finish()
            }
    }
} }