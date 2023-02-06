package com.ubaya.matrikulasialpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ubaya.matrikulasialpro.databinding.ActivityStandartDetailBinding

class StandartDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStandartDetailBinding

    var namaSoal = ""

    companion object {
        val EXTRA_NAMASOAL = "EXTRA_NAMASOAL"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStandartDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBelanjaTepung.setOnClickListener {
            namaSoal = "Belanja Tepung"
            val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }
        binding.buttonAlatMusikPart1.setOnClickListener {
            namaSoal = "Alat Musik part 1"
            val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }
        binding.buttonAlatMusikPart2.setOnClickListener {
            namaSoal = "Alat Musik part 2"
            val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }
        binding.buttonPesanLampuPart1.setOnClickListener {
            namaSoal = "Pesan Lampu part 1"
            val intent = Intent(this, QuestionPesanLampuActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }
        binding.buttonPesanLampuPart2.setOnClickListener {
            namaSoal = "Pesan Lampu part 2"
            val intent = Intent(this, QuestionPesanLampuActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }
    }
}