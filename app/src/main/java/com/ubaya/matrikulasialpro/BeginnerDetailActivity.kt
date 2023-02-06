package com.ubaya.matrikulasialpro

import android.content.Intent
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

        binding.buttonTugasPrakarya.setOnClickListener {
            namaSoal = "Tugas Prakarya"
            val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }

        binding.buttonEksperimenTikus.setOnClickListener {
            namaSoal = "Eksperimen Tikus"
            val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }

        binding.buttonBakteri.setOnClickListener {
            namaSoal = "Bakteri"
            val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }

        binding.buttonKantongKelereng.setOnClickListener {
            namaSoal = "Kantong Kelereng"
            val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }
    }
}