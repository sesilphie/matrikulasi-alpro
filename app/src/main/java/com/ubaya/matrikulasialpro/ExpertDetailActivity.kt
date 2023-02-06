package com.ubaya.matrikulasialpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ubaya.matrikulasialpro.databinding.ActivityBeginnerDetailBinding
import com.ubaya.matrikulasialpro.databinding.ActivityExpertDetailBinding

class ExpertDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExpertDetailBinding

    var namaSoal = ""
    companion object{
        val EXTRA_NAMASOAL = "EXTRA_NAMASOAL"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExpertDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLabirin.setOnClickListener {
            namaSoal = "Labirin"
            val intent = Intent(this, QuestionLabirinActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }
        binding.buttonKatak.setOnClickListener {
            namaSoal = "Katak"
            val intent = Intent(this, QuestionKatakAndRobotActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }
        binding.buttonRobbySiRobot.setOnClickListener {
            namaSoal = "Robby Si Robot"
            val intent = Intent(this, QuestionKatakAndRobotActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }
        binding.buttonCaturPart1.setOnClickListener {
            namaSoal = "Turnamen Catur part 1"
            val intent = Intent(this, QuestionVideoActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }

        binding.buttonCaturPart2.setOnClickListener {
            namaSoal = "Turnamen Catur part 2"
            val intent = Intent(this, QuestionVideoActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }

        binding.buttonCaturPart3.setOnClickListener {
            namaSoal = "Turnamen Catur part 3"
            val intent = Intent(this, QuestionVideoActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }

        binding.buttonMobilPengangkutBarang.setOnClickListener {
            namaSoal = "Mobil Pengangkut Barang"
            val intent = Intent(this, QuestionMobilPengangkutBarangActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }
        binding.buttonPromosiMinuman.setOnClickListener {
            namaSoal = "Promosi Minuman"
            val intent = Intent(this, QuestionUlanganAndPromosiActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
        }
    }
}