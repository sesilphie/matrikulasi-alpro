package com.ubaya.matrikulasialpro

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ubaya.matrikulasialpro.databinding.ActivityBeginnerDetailBinding
import com.ubaya.matrikulasialpro.databinding.ActivityIntroductionDetailBinding

class BeginnerDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBeginnerDetailBinding

    var namaSoal = ""
    companion object{
        val EXTRA_NAMASOAL = "EXTRA_NAMASOAL"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBeginnerDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (GlobalData.levelTertinggiUser == 1){
            if (GlobalData.noSoalTertinggiUser == 1){
                binding.buttonTugasPrakarya.isEnabled = true
                binding.buttonEksperimenTikus.isEnabled = false
                binding.buttonBakteri.isEnabled = false
                binding.buttonKantongKelereng.isEnabled = false
                binding.buttonEksperimenTikus.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonBakteri.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonKantongKelereng.setBackgroundColor(Color.parseColor("#D9D9D9"))

            } else if (GlobalData.noSoalTertinggiUser == 2){
                binding.buttonTugasPrakarya.isEnabled = true
                binding.buttonEksperimenTikus.isEnabled = true
                binding.buttonBakteri.isEnabled = false
                binding.buttonKantongKelereng.isEnabled = false
                binding.buttonBakteri.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonKantongKelereng.setBackgroundColor(Color.parseColor("#D9D9D9"))
            } else if (GlobalData.noSoalTertinggiUser == 3){
                binding.buttonTugasPrakarya.isEnabled = true
                binding.buttonEksperimenTikus.isEnabled = true
                binding.buttonBakteri.isEnabled = true
                binding.buttonKantongKelereng.isEnabled = false
                binding.buttonKantongKelereng.setBackgroundColor(Color.parseColor("#D9D9D9"))
            } else if (GlobalData.noSoalTertinggiUser == 4){
                binding.buttonTugasPrakarya.isEnabled = true
                binding.buttonEksperimenTikus.isEnabled = true
                binding.buttonBakteri.isEnabled = true
                binding.buttonKantongKelereng.isEnabled = true
            }
        } else if (GlobalData.levelTertinggiUser > 1){
            binding.buttonTugasPrakarya.isEnabled = true
            binding.buttonEksperimenTikus.isEnabled = true
            binding.buttonBakteri.isEnabled = true
            binding.buttonKantongKelereng.isEnabled = true
        } else{
            binding.buttonTugasPrakarya.isEnabled = false
            binding.buttonEksperimenTikus.isEnabled = false
            binding.buttonBakteri.isEnabled = false
            binding.buttonKantongKelereng.isEnabled = false
            binding.buttonTugasPrakarya.setBackgroundColor(Color.parseColor("#D9D9D9"))
            binding.buttonEksperimenTikus.setBackgroundColor(Color.parseColor("#D9D9D9"))
            binding.buttonBakteri.setBackgroundColor(Color.parseColor("#D9D9D9"))
            binding.buttonKantongKelereng.setBackgroundColor(Color.parseColor("#D9D9D9"))
        }

        binding.buttonTugasPrakarya.setOnClickListener {
            namaSoal = "Tugas Prakarya"
            val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
            finish()
        }

        binding.buttonEksperimenTikus.setOnClickListener {
            namaSoal = "Eksperimen Tikus"
            val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
            finish()
        }

        binding.buttonBakteri.setOnClickListener {
            namaSoal = "Bakteri"
            val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
            finish()
        }

        binding.buttonKantongKelereng.setOnClickListener {
            namaSoal = "Kantong Kelereng"
            val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
            finish()
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}