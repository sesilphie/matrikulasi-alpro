package com.ubaya.matrikulasialpro

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import com.ubaya.matrikulasialpro.databinding.ActivityIntroductionDetailBinding
import com.ubaya.matrikulasialpro.databinding.ActivityMainBinding
import com.ubaya.matrikulasialpro.databinding.ActivityQuestionMultiChoiceBinding
import android.widget.LinearLayout
import android.util.TypedValue
import android.widget.Toast

class QuestionMultiChoiceActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionMultiChoiceBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionMultiChoiceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val namaSoal = intent.getStringExtra(IntroductionDetailActivity.EXTRA_NAMASOAL)
        var pilihanUser = ""
        binding.textJudul.text = namaSoal
        for (question in GlobalData.QuestionModel){
            if (namaSoal == question.namaSoal){
                if (namaSoal == "Belanja Tepung"){
                    //mengubah ukuran gambar dalam dp
                    val dimensionInPixel = 270
                    val dimensionInDp = TypedValue.applyDimension(
                        TypedValue.COMPLEX_UNIT_DIP,
                        dimensionInPixel.toFloat(),
                        resources.displayMetrics
                    )
                        .toInt()
                    binding.imageViewSoal.getLayoutParams().height = dimensionInDp
                    binding.imageViewSoal.getLayoutParams().width = dimensionInDp
                    binding.imageViewSoal.requestLayout()
                }
                binding.imageViewSoal.setImageResource(question.idGambarIlustrasi)
                binding.textSoal.text = question.pertanyaan
                binding.buttonA.text = question.pilihanA
                binding.buttonB.text = question.pilihanB
                binding.buttonC.text = question.pilihanC
                binding.buttonD.text = question.pilihanD

                GlobalData.pilihanA = question.pilihanA
                GlobalData.pilihanB = question.pilihanB
                GlobalData.pilihanC = question.pilihanC
                GlobalData.pilihanD = question.pilihanD
                GlobalData.jawabanSoal = question.jawaban
            }
        }
        binding.buttonA.setOnClickListener {
            binding.buttonA.setBackgroundColor(Color.parseColor("#283777"))
            binding.buttonB.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonC.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonD.setBackgroundColor(Color.parseColor("#7997C9"))

            pilihanUser = GlobalData.pilihanA
//            Toast.makeText(this, pilihanUser, Toast.LENGTH_SHORT).show()
        }
        binding.buttonB.setOnClickListener {
            binding.buttonA.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonB.setBackgroundColor(Color.parseColor("#283777"))
            binding.buttonC.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonD.setBackgroundColor(Color.parseColor("#7997C9"))

            pilihanUser = GlobalData.pilihanB
//            Toast.makeText(this, pilihanUser, Toast.LENGTH_SHORT).show()
        }
        binding.buttonC.setOnClickListener {
            binding.buttonA.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonB.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonC.setBackgroundColor(Color.parseColor("#283777"))
            binding.buttonD.setBackgroundColor(Color.parseColor("#7997C9"))

            pilihanUser = GlobalData.pilihanC
//            Toast.makeText(this, pilihanUser, Toast.LENGTH_SHORT).show()
        }
        binding.buttonD.setOnClickListener {
            binding.buttonA.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonB.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonC.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonD.setBackgroundColor(Color.parseColor("#283777"))

            pilihanUser = GlobalData.pilihanD
//            Toast.makeText(this, pilihanUser, Toast.LENGTH_SHORT).show()
        }

        binding.buttonCekHasil.setOnClickListener {
            if (GlobalData.jawabanSoal == pilihanUser){
                Toast.makeText(this, "KAMU BENAR", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "KAMU SALAH", Toast.LENGTH_SHORT).show()
            }
        }

    }
}