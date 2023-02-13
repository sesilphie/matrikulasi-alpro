package com.ubaya.matrikulasialpro

import android.content.Intent
import android.graphics.Color
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

        if(GlobalData.levelTertinggiUser == 2){
            if (GlobalData.noSoalTertinggiUser == 1){
                binding.buttonBelanjaTepung.isEnabled = true
                binding.buttonAlatMusikPart1.isEnabled = false
                binding.buttonAlatMusikPart2.isEnabled = false
                binding.buttonPesanLampuPart1.isEnabled = false
                binding.buttonPesanLampuPart2.isEnabled = false

                binding.buttonAlatMusikPart1.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonAlatMusikPart2.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonPesanLampuPart1.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonPesanLampuPart2.setBackgroundColor(Color.parseColor("#D9D9D9"))
            } else if (GlobalData.noSoalTertinggiUser == 2){
                binding.buttonBelanjaTepung.isEnabled = true
                binding.buttonAlatMusikPart1.isEnabled = true
                binding.buttonAlatMusikPart2.isEnabled = false
                binding.buttonPesanLampuPart1.isEnabled = false
                binding.buttonPesanLampuPart2.isEnabled = false

                binding.buttonAlatMusikPart2.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonPesanLampuPart1.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonPesanLampuPart2.setBackgroundColor(Color.parseColor("#D9D9D9"))
            } else if (GlobalData.noSoalTertinggiUser == 3){
                binding.buttonBelanjaTepung.isEnabled = true
                binding.buttonAlatMusikPart1.isEnabled = true
                binding.buttonAlatMusikPart2.isEnabled = true
                binding.buttonPesanLampuPart1.isEnabled = false
                binding.buttonPesanLampuPart2.isEnabled = false

                binding.buttonPesanLampuPart1.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonPesanLampuPart2.setBackgroundColor(Color.parseColor("#D9D9D9"))
            } else if (GlobalData.noSoalTertinggiUser == 4){
                binding.buttonBelanjaTepung.isEnabled = true
                binding.buttonAlatMusikPart1.isEnabled = true
                binding.buttonAlatMusikPart2.isEnabled = true
                binding.buttonPesanLampuPart1.isEnabled = true
                binding.buttonPesanLampuPart2.isEnabled = false

                binding.buttonPesanLampuPart2.setBackgroundColor(Color.parseColor("#D9D9D9"))
            } else if (GlobalData.noSoalTertinggiUser == 5){
                binding.buttonBelanjaTepung.isEnabled = true
                binding.buttonAlatMusikPart1.isEnabled = true
                binding.buttonAlatMusikPart2.isEnabled = true
                binding.buttonPesanLampuPart1.isEnabled = true
                binding.buttonPesanLampuPart2.isEnabled = true

            }
        } else if (GlobalData.levelTertinggiUser > 2){
            binding.buttonBelanjaTepung.isEnabled = true
            binding.buttonAlatMusikPart1.isEnabled = true
            binding.buttonAlatMusikPart2.isEnabled = true
            binding.buttonPesanLampuPart1.isEnabled = true
            binding.buttonPesanLampuPart2.isEnabled = true
        } else{
            binding.buttonBelanjaTepung.isEnabled = false
            binding.buttonAlatMusikPart1.isEnabled = false
            binding.buttonAlatMusikPart2.isEnabled = false
            binding.buttonPesanLampuPart1.isEnabled = false
            binding.buttonPesanLampuPart2.isEnabled = false
            binding.buttonBelanjaTepung.setBackgroundColor(Color.parseColor("#D9D9D9"))
            binding.buttonAlatMusikPart1.setBackgroundColor(Color.parseColor("#D9D9D9"))
            binding.buttonAlatMusikPart2.setBackgroundColor(Color.parseColor("#D9D9D9"))
            binding.buttonPesanLampuPart1.setBackgroundColor(Color.parseColor("#D9D9D9"))
            binding.buttonPesanLampuPart2.setBackgroundColor(Color.parseColor("#D9D9D9"))
        }

        binding.buttonBelanjaTepung.setOnClickListener {
            namaSoal = "Belanja Tepung"
            val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
            finish()
        }
        binding.buttonAlatMusikPart1.setOnClickListener {
            namaSoal = "Alat Musik part 1"
            val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
            finish()
        }
        binding.buttonAlatMusikPart2.setOnClickListener {
            namaSoal = "Alat Musik part 2"
            val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
            finish()
        }
        binding.buttonPesanLampuPart1.setOnClickListener {
            namaSoal = "Pesan Lampu part 1"
            val intent = Intent(this, QuestionPesanLampuActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
            finish()
        }
        binding.buttonPesanLampuPart2.setOnClickListener {
            namaSoal = "Pesan Lampu part 2"
            val intent = Intent(this, QuestionPesanLampuActivity::class.java)
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