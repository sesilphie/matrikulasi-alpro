package com.ubaya.matrikulasialpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ubaya.matrikulasialpro.databinding.ActivityMainBinding
import com.ubaya.matrikulasialpro.databinding.ActivityRegisterBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.CardViewIntro.setOnClickListener {
            val intent = Intent(this, IntroductionDetailActivity::class.java)
            startActivity(intent)
        }

        binding.CardViewBenginner.setOnClickListener {
            val intent = Intent(this, BeginnerDetailActivity::class.java)
            startActivity(intent)
        }

        binding.CardViewStandart.setOnClickListener {
            val intent = Intent(this, StandartDetailActivity::class.java)
            startActivity(intent)
        }

        binding.CardViewExpert.setOnClickListener {
            val intent = Intent(this, ExpertDetailActivity::class.java)
            startActivity(intent)
        }
    }
}