package com.example.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.registration.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    companion object {
        const val  EXTRA_NAME = "extra_name"
        const val  EXTRA_EMAIL = "extra_email"
        const val  EXTRA_PHONE = "extra_phone"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnRegister.setOnClickListener {
                val intentToHomePage =
                    Intent(this@MainActivity, HomePage::class.java)

                val username = editTxtUsername.text.toString()
                val email = editTxtEmail.text.toString()
                val phone = editTxtPhone.text.toString()
                intentToHomePage.putExtra(EXTRA_NAME, username)
                intentToHomePage.putExtra(EXTRA_EMAIL, email)
                intentToHomePage.putExtra(EXTRA_PHONE, phone)
                startActivity(intentToHomePage)
            }

        }
    }
}