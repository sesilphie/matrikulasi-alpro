package com.ubaya.matrikulasialpro

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ubaya.matrikulasialpro.databinding.ActivityMainBinding
import com.ubaya.matrikulasialpro.databinding.ActivityRegisterBinding
import kotlin.math.roundToInt
import kotlin.time.Duration.Companion.microseconds

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var progress_lvl0 = 0f
        var progress_lvl1 = 0f
        var progress_lvl2 = 0f
        var progress_lvl3 = 0f

        //progress user
        if(GlobalData.levelTertinggiUser == 0){
            if(GlobalData.noSoalTertinggiUser == 1){
                progress_lvl0 = 0f
            } else if(GlobalData.noSoalTertinggiUser == 2){
                progress_lvl0 = (1 / 5f) * 100
            } else if(GlobalData.noSoalTertinggiUser == 3){
                progress_lvl0 = (2 / 5f) * 100
            } else if(GlobalData.noSoalTertinggiUser == 4){
                progress_lvl0 = (3 / 5f) * 100
            } else if(GlobalData.noSoalTertinggiUser == 5){
                progress_lvl0 = (4 / 5f) * 100
            }
            binding.textProgressBarIntro.text = progress_lvl0.roundToInt().toString() + "%"
            binding.ProgressBarLvlIntro.progress = progress_lvl0.roundToInt()
        } else if (GlobalData.levelTertinggiUser == 1){
            progress_lvl0 = 100f
            binding.textProgressBarIntro.text = progress_lvl0.roundToInt().toString() + "%"
            binding.ProgressBarLvlIntro.progress = progress_lvl0.roundToInt()

            if (GlobalData.noSoalTertinggiUser == 1){
                progress_lvl1 = 0f
            } else if (GlobalData.noSoalTertinggiUser == 2){
                progress_lvl1 = (1 / 4f) * 100
            } else if (GlobalData.noSoalTertinggiUser == 3){
                progress_lvl1 = (2 / 4f) * 100
            } else if (GlobalData.noSoalTertinggiUser == 4){
                progress_lvl1 = (3 / 4f) * 100
            }
            binding.textProgressBarLvlBeginner.text = progress_lvl1.roundToInt().toString() + "%"
            binding.ProgressBarLvlBeginner.progress = progress_lvl1.roundToInt()
        } else if (GlobalData.levelTertinggiUser == 2){
            progress_lvl0 = 100f
            binding.textProgressBarIntro.text = progress_lvl0.roundToInt().toString() + "%"
            binding.ProgressBarLvlIntro.progress = progress_lvl0.roundToInt()

            progress_lvl1 = 100f
            binding.textProgressBarLvlBeginner.text = progress_lvl1.roundToInt().toString() + "%"
            binding.ProgressBarLvlBeginner.progress = progress_lvl1.roundToInt()

            if (GlobalData.noSoalTertinggiUser == 1){
                progress_lvl2 = 0f
            } else if (GlobalData.noSoalTertinggiUser == 2){
                progress_lvl2 = (1 / 5f) * 100
            } else if (GlobalData.noSoalTertinggiUser == 3){
                progress_lvl2 = (2 / 5f) * 100
            } else if (GlobalData.noSoalTertinggiUser == 4){
                progress_lvl2 = (3 / 5f) * 100
            } else if (GlobalData.noSoalTertinggiUser == 5){
                progress_lvl2 = (4 / 5f) * 100
            }
            binding.textProgressBarLvlStandart.text = progress_lvl2.roundToInt().toString() + "%"
            binding.ProgressBarLvlStandart.progress = progress_lvl2.roundToInt()
        } else if (GlobalData.levelTertinggiUser == 3){
            progress_lvl0 = 100f
            binding.textProgressBarIntro.text = progress_lvl0.roundToInt().toString() + "%"
            binding.ProgressBarLvlIntro.progress = progress_lvl0.roundToInt()

            progress_lvl1 = 100f
            binding.textProgressBarLvlBeginner.text = progress_lvl1.roundToInt().toString() + "%"
            binding.ProgressBarLvlBeginner.progress = progress_lvl1.roundToInt()

            progress_lvl2 = 100f
            binding.textProgressBarLvlStandart.text = progress_lvl2.roundToInt().toString() + "%"
            binding.ProgressBarLvlStandart.progress = progress_lvl2.roundToInt()

            if (GlobalData.noSoalTertinggiUser == 1){
                progress_lvl3 = 0f
            } else if (GlobalData.noSoalTertinggiUser == 2){
                progress_lvl3 = (1 / 8f) * 100
            } else if (GlobalData.noSoalTertinggiUser == 3){
                progress_lvl3 = (2 / 8f) * 100
            } else if (GlobalData.noSoalTertinggiUser == 4){
                progress_lvl3 = (3 / 8f) * 100
            } else if (GlobalData.noSoalTertinggiUser == 5){
                progress_lvl3 = (4 / 8f) * 100
            } else if (GlobalData.noSoalTertinggiUser == 6){
                progress_lvl3 = (5 / 8f) * 100
            } else if (GlobalData.noSoalTertinggiUser == 7){
                progress_lvl3 = (6 / 8f) * 100
            } else if (GlobalData.noSoalTertinggiUser == 8){
                progress_lvl3 = (7 / 8f) * 100
            } else if (GlobalData.noSoalTertinggiUser == 9){
                progress_lvl3 = 100f
            }
            binding.textProgressBarLvlExpert.text = progress_lvl3.roundToInt().toString() + "%"
            binding.ProgressBarLvlExpert.progress = progress_lvl3.roundToInt()
        }

        if(GlobalData.levelTertinggiUser == 0){
            binding.CardViewIntro.isEnabled = true
            binding.CardViewBenginner.isEnabled = false
            binding.CardViewStandart.isEnabled = false
            binding.CardViewExpert.isEnabled = false

            binding.CardViewBenginner.setCardBackgroundColor(Color.parseColor("#D9D9D9"))
            binding.CardViewStandart.setCardBackgroundColor(Color.parseColor("#D9D9D9"))
            binding.CardViewExpert.setCardBackgroundColor(Color.parseColor("#D9D9D9"))
        } else if(GlobalData.levelTertinggiUser == 1){
            binding.CardViewIntro.isEnabled = true
            binding.CardViewBenginner.isEnabled = true
            binding.CardViewStandart.isEnabled = false
            binding.CardViewExpert.isEnabled = false

            binding.CardViewStandart.setCardBackgroundColor(Color.parseColor("#D9D9D9"))
            binding.CardViewExpert.setCardBackgroundColor(Color.parseColor("#D9D9D9"))
        } else if(GlobalData.levelTertinggiUser == 2){
            binding.CardViewIntro.isEnabled = true
            binding.CardViewBenginner.isEnabled = true
            binding.CardViewStandart.isEnabled = true
            binding.CardViewExpert.isEnabled = false

            binding.CardViewExpert.setCardBackgroundColor(Color.parseColor("#D9D9D9"))
        } else if(GlobalData.levelTertinggiUser == 3){
            binding.CardViewIntro.isEnabled = true
            binding.CardViewBenginner.isEnabled = true
            binding.CardViewStandart.isEnabled = true
            binding.CardViewExpert.isEnabled = true
        }

        binding.CardViewIntro.setOnClickListener {
            val intent = Intent(this, IntroductionDetailActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.CardViewBenginner.setOnClickListener {
            val intent = Intent(this, BeginnerDetailActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.CardViewStandart.setOnClickListener {
            val intent = Intent(this, StandartDetailActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.CardViewExpert.setOnClickListener {
            val intent = Intent(this, ExpertDetailActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}