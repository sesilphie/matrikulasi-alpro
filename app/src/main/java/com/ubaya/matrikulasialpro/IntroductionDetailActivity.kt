package com.ubaya.matrikulasialpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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



        binding.buttonKursMataUang.setOnClickListener {
            namaSoal = "Kurs Mata Uang"
            val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }
        binding.buttonKandangBebek.setOnClickListener {
            namaSoal = "Kandang Bebek"
            val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }
        binding.buttonMainanBaruPart1.setOnClickListener {
            namaSoal = "Mainan Baru part 1"
            val intent = Intent(this, QuestionVideoActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }
        binding.buttonHasilUlanganHarian.setOnClickListener {
            namaSoal = "Hasil Ulangan Harian"
            val intent = Intent(this, QuestionUlanganAndPromosiActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }
        binding.buttonMainanBaruPart2.setOnClickListener {
            namaSoal = "Mainan Baru part 2"
            val intent = Intent(this, QuestionMainanBaruPart2Actvity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }
    }
}