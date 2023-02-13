package com.ubaya.matrikulasialpro

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.ubaya.matrikulasialpro.databinding.ActivityIntroductionDetailBinding
import com.ubaya.matrikulasialpro.databinding.ActivityMainBinding

class IntroductionDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntroductionDetailBinding

    var namaSoal = ""
    companion object{
        val EXTRA_NAMASOAL = "EXTRA_NAMASOAL"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroductionDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (GlobalData.levelTertinggiUser == 0){
            if (GlobalData.noSoalTertinggiUser == 1){
                binding.buttonKursMataUang.isEnabled = true
                binding.buttonHasilUlanganHarian.isEnabled = false
                binding.buttonKandangBebek.isEnabled = false
                binding.buttonMainanBaruPart1.isEnabled = false
                binding.buttonMainanBaruPart2.isEnabled = false
                binding.buttonHasilUlanganHarian.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonKandangBebek.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonMainanBaruPart1.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonMainanBaruPart2.setBackgroundColor(Color.parseColor("#D9D9D9"))

            } else if (GlobalData.noSoalTertinggiUser == 2){
                binding.buttonKursMataUang.isEnabled = true
                binding.buttonHasilUlanganHarian.isEnabled = true
                binding.buttonKandangBebek.isEnabled = false
                binding.buttonMainanBaruPart1.isEnabled = false
                binding.buttonMainanBaruPart2.isEnabled = false
                binding.buttonKandangBebek.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonMainanBaruPart1.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonMainanBaruPart2.setBackgroundColor(Color.parseColor("#D9D9D9"))
            } else if (GlobalData.noSoalTertinggiUser == 3){
                binding.buttonKursMataUang.isEnabled = true
                binding.buttonHasilUlanganHarian.isEnabled = true
                binding.buttonKandangBebek.isEnabled = true
                binding.buttonMainanBaruPart1.isEnabled = false
                binding.buttonMainanBaruPart2.isEnabled = false
                binding.buttonMainanBaruPart1.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonMainanBaruPart2.setBackgroundColor(Color.parseColor("#D9D9D9"))
            } else if (GlobalData.noSoalTertinggiUser == 4){
                binding.buttonKursMataUang.isEnabled = true
                binding.buttonHasilUlanganHarian.isEnabled = true
                binding.buttonKandangBebek.isEnabled = true
                binding.buttonMainanBaruPart1.isEnabled = true
                binding.buttonMainanBaruPart2.isEnabled = false
                binding.buttonMainanBaruPart2.setBackgroundColor(Color.parseColor("#D9D9D9"))
            } else if (GlobalData.noSoalTertinggiUser == 5){
                binding.buttonKursMataUang.isEnabled = true
                binding.buttonHasilUlanganHarian.isEnabled = true
                binding.buttonKandangBebek.isEnabled = true
                binding.buttonMainanBaruPart1.isEnabled = true
                binding.buttonMainanBaruPart2.isEnabled = true
            }
        } else { //kalau levelnya lebih dari 0 akses soal bisa dibuka
            binding.buttonKursMataUang.isEnabled = true
            binding.buttonHasilUlanganHarian.isEnabled = true
            binding.buttonKandangBebek.isEnabled = true
            binding.buttonMainanBaruPart1.isEnabled = true
            binding.buttonMainanBaruPart2.isEnabled = true
        }


        binding.buttonKursMataUang.setOnClickListener {
            namaSoal = "Kurs Mata Uang"
            val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
            finish()
        }
        binding.buttonKandangBebek.setOnClickListener {
            namaSoal = "Kandang Bebek"
            val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
            finish()
        }
        binding.buttonMainanBaruPart1.setOnClickListener {
            namaSoal = "Mainan Baru part 1"
            val intent = Intent(this, QuestionVideoActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
            finish()
        }
        binding.buttonHasilUlanganHarian.setOnClickListener {
            namaSoal = "Hasil Ulangan Harian"
            val intent = Intent(this, QuestionUlanganAndPromosiActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
            finish()
        }
        binding.buttonMainanBaruPart2.setOnClickListener {
            namaSoal = "Mainan Baru part 2"
            val intent = Intent(this, QuestionMainanBaruPart2Actvity::class.java)
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