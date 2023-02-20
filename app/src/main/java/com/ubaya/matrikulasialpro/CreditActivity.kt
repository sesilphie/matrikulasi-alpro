package com.ubaya.matrikulasialpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ubaya.matrikulasialpro.databinding.ActivityCreditBinding

class CreditActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCreditBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreditBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onBackPressed() {
        finish()
    }
}