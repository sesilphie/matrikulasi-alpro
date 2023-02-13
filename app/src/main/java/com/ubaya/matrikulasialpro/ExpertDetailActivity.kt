package com.ubaya.matrikulasialpro

import android.content.Intent
import android.graphics.Color
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

        if (GlobalData.levelTertinggiUser == 3){
            if (GlobalData.noSoalTertinggiUser == 1){
                binding.buttonPromosiMinuman.isEnabled = true
                binding.buttonCaturPart1.isEnabled = false
                binding.buttonCaturPart2.isEnabled = false
                binding.buttonKatak.isEnabled = false
                binding.buttonCaturPart3.isEnabled = false
                binding.buttonRobbySiRobot.isEnabled = false
                binding.buttonLabirin.isEnabled = false
                binding.buttonMobilPengangkutBarang.isEnabled = false

                binding.buttonCaturPart1.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonCaturPart2.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonKatak.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonCaturPart3.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonRobbySiRobot.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonLabirin.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonMobilPengangkutBarang.setBackgroundColor(Color.parseColor("#D9D9D9"))

            } else if (GlobalData.noSoalTertinggiUser == 2){
                binding.buttonPromosiMinuman.isEnabled = true
                binding.buttonCaturPart1.isEnabled = true
                binding.buttonCaturPart2.isEnabled = false
                binding.buttonKatak.isEnabled = false
                binding.buttonCaturPart3.isEnabled = false
                binding.buttonRobbySiRobot.isEnabled = false
                binding.buttonLabirin.isEnabled = false
                binding.buttonMobilPengangkutBarang.isEnabled = false

                binding.buttonCaturPart2.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonKatak.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonCaturPart3.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonRobbySiRobot.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonLabirin.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonMobilPengangkutBarang.setBackgroundColor(Color.parseColor("#D9D9D9"))

            } else if (GlobalData.noSoalTertinggiUser == 3){
                binding.buttonPromosiMinuman.isEnabled = true
                binding.buttonCaturPart1.isEnabled = true
                binding.buttonCaturPart2.isEnabled = true
                binding.buttonKatak.isEnabled = false
                binding.buttonCaturPart3.isEnabled = false
                binding.buttonRobbySiRobot.isEnabled = false
                binding.buttonLabirin.isEnabled = false
                binding.buttonMobilPengangkutBarang.isEnabled = false

                binding.buttonKatak.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonCaturPart3.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonRobbySiRobot.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonLabirin.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonMobilPengangkutBarang.setBackgroundColor(Color.parseColor("#D9D9D9"))

            } else if (GlobalData.noSoalTertinggiUser == 4){
                binding.buttonPromosiMinuman.isEnabled = true
                binding.buttonCaturPart1.isEnabled = true
                binding.buttonCaturPart2.isEnabled = true
                binding.buttonKatak.isEnabled = true
                binding.buttonCaturPart3.isEnabled = false
                binding.buttonRobbySiRobot.isEnabled = false
                binding.buttonLabirin.isEnabled = false
                binding.buttonMobilPengangkutBarang.isEnabled = false

                binding.buttonCaturPart3.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonRobbySiRobot.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonLabirin.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonMobilPengangkutBarang.setBackgroundColor(Color.parseColor("#D9D9D9"))

            } else if (GlobalData.noSoalTertinggiUser == 5){
                binding.buttonPromosiMinuman.isEnabled = true
                binding.buttonCaturPart1.isEnabled = true
                binding.buttonCaturPart2.isEnabled = true
                binding.buttonKatak.isEnabled = true
                binding.buttonCaturPart3.isEnabled = true
                binding.buttonRobbySiRobot.isEnabled = false
                binding.buttonLabirin.isEnabled = false
                binding.buttonMobilPengangkutBarang.isEnabled = false

                binding.buttonRobbySiRobot.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonLabirin.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonMobilPengangkutBarang.setBackgroundColor(Color.parseColor("#D9D9D9"))

            } else if (GlobalData.noSoalTertinggiUser == 6){
                binding.buttonPromosiMinuman.isEnabled = true
                binding.buttonCaturPart1.isEnabled = true
                binding.buttonCaturPart2.isEnabled = true
                binding.buttonKatak.isEnabled = true
                binding.buttonCaturPart3.isEnabled = true
                binding.buttonRobbySiRobot.isEnabled = true
                binding.buttonLabirin.isEnabled = false
                binding.buttonMobilPengangkutBarang.isEnabled = false

                binding.buttonLabirin.setBackgroundColor(Color.parseColor("#D9D9D9"))
                binding.buttonMobilPengangkutBarang.setBackgroundColor(Color.parseColor("#D9D9D9"))

            } else if (GlobalData.noSoalTertinggiUser == 7){
                binding.buttonPromosiMinuman.isEnabled = true
                binding.buttonCaturPart1.isEnabled = true
                binding.buttonCaturPart2.isEnabled = true
                binding.buttonKatak.isEnabled = true
                binding.buttonCaturPart3.isEnabled = true
                binding.buttonRobbySiRobot.isEnabled = true
                binding.buttonLabirin.isEnabled = true
                binding.buttonMobilPengangkutBarang.isEnabled = false

                binding.buttonMobilPengangkutBarang.setBackgroundColor(Color.parseColor("#D9D9D9"))

            } else if (GlobalData.noSoalTertinggiUser == 8){
                binding.buttonPromosiMinuman.isEnabled = true
                binding.buttonCaturPart1.isEnabled = true
                binding.buttonCaturPart2.isEnabled = true
                binding.buttonKatak.isEnabled = true
                binding.buttonCaturPart3.isEnabled = true
                binding.buttonRobbySiRobot.isEnabled = true
                binding.buttonLabirin.isEnabled = true
                binding.buttonMobilPengangkutBarang.isEnabled = true
            }
        } else{
            binding.buttonPromosiMinuman.isEnabled = false
            binding.buttonCaturPart1.isEnabled = false
            binding.buttonCaturPart2.isEnabled = false
            binding.buttonKatak.isEnabled = false
            binding.buttonCaturPart3.isEnabled = false
            binding.buttonRobbySiRobot.isEnabled = false
            binding.buttonLabirin.isEnabled = false
            binding.buttonMobilPengangkutBarang.isEnabled = false

            binding.buttonPromosiMinuman.setBackgroundColor(Color.parseColor("#D9D9D9"))
            binding.buttonCaturPart1.setBackgroundColor(Color.parseColor("#D9D9D9"))
            binding.buttonCaturPart2.setBackgroundColor(Color.parseColor("#D9D9D9"))
            binding.buttonKatak.setBackgroundColor(Color.parseColor("#D9D9D9"))
            binding.buttonCaturPart3.setBackgroundColor(Color.parseColor("#D9D9D9"))
            binding.buttonRobbySiRobot.setBackgroundColor(Color.parseColor("#D9D9D9"))
            binding.buttonLabirin.setBackgroundColor(Color.parseColor("#D9D9D9"))
            binding.buttonMobilPengangkutBarang.setBackgroundColor(Color.parseColor("#D9D9D9"))
        }

        binding.buttonLabirin.setOnClickListener {
            namaSoal = "Labirin"
            val intent = Intent(this, QuestionLabirinActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
            finish()
        }
        binding.buttonKatak.setOnClickListener {
            namaSoal = "Katak"
            val intent = Intent(this, QuestionKatakAndRobotActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
            finish()
        }
        binding.buttonRobbySiRobot.setOnClickListener {
            namaSoal = "Robby Si Robot"
            val intent = Intent(this, QuestionKatakAndRobotActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
            finish()
        }
        binding.buttonCaturPart1.setOnClickListener {
            namaSoal = "Turnamen Catur part 1"
            val intent = Intent(this, QuestionVideoActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
            finish()
        }

        binding.buttonCaturPart2.setOnClickListener {
            namaSoal = "Turnamen Catur part 2"
            val intent = Intent(this, QuestionVideoActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
            finish()
        }

        binding.buttonCaturPart3.setOnClickListener {
            namaSoal = "Turnamen Catur part 3"
            val intent = Intent(this, QuestionVideoActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
            finish()
        }

        binding.buttonMobilPengangkutBarang.setOnClickListener {
            namaSoal = "Mobil Pengangkut Barang"
            val intent = Intent(this, QuestionMobilPengangkutBarangActivity::class.java)
            intent.putExtra(EXTRA_NAMASOAL, namaSoal)
            startActivity(intent)
            finish()
        }
        binding.buttonPromosiMinuman.setOnClickListener {
            namaSoal = "Promosi Minuman"
            val intent = Intent(this, QuestionUlanganAndPromosiActivity::class.java)
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