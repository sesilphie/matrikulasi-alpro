package com.ubaya.matrikulasialpro

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ubaya.matrikulasialpro.databinding.ActivityQuestionMultiChoiceBinding
import android.util.TypedValue
import android.view.View
import android.view.Window
import android.widget.*

class QuestionMultiChoiceActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionMultiChoiceBinding

    var namaSoal = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionMultiChoiceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        namaSoal = intent.getStringExtra(IntroductionDetailActivity.EXTRA_NAMASOAL).toString()
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
                //Toast.makeText(this, "KAMU BENAR", Toast.LENGTH_SHORT).show()
                ShowDialogBenar()
            }else{
                ShowDialogSalah()
                //Toast.makeText(this, "KAMU SALAH", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun ShowDialogSalah(){
        val dialog = Dialog(this)
        dialog.requestWindowFeature( Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dialog_salah_layout)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val buttonCobaLagi = dialog.findViewById(R.id.buttonCobaLagi) as Button
        val textSolusiSoal = dialog.findViewById(R.id.textSolusiSoal) as TextView

        for (wrongAnswer in GlobalData.wrongAnswer){
            if (namaSoal == wrongAnswer.namaSoal){
                textSolusiSoal.text = wrongAnswer.textSolusi
            }
        }
        buttonCobaLagi.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }

    @SuppressLint("SetTextI18n")
    fun ShowDialogBenar(){
        val dialog = Dialog(this)
        dialog.requestWindowFeature( Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dialog_benar_layout)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val buttonBerikutnya= dialog.findViewById(R.id.buttonBerikutnya) as Button
        val buttonPrev = dialog.findViewById(R.id.buttonPrev) as Button
        val buttonNext = dialog.findViewById(R.id.buttonNext) as Button
        val textPenjelasan = dialog.findViewById(R.id.textPenjelasanSoal) as TextView
        val textHalaman = dialog.findViewById(R.id.textHalaman) as TextView
        val imageGambar = dialog.findViewById(R.id.imageGambarJawaban) as ImageView

        val kunciJawaban = GlobalData.answerKey

        buttonPrev.visibility = View.INVISIBLE
        textPenjelasan.text = kunciJawaban.textJawaban1
        textHalaman.text = GlobalData.currentHalaman.toString() + "/" + kunciJawaban.jumlahHalaman.toString()
        imageGambar.setImageResource(kunciJawaban.idGambar1)

        buttonPrev.setOnClickListener {
            if (GlobalData.currentHalaman == 1){
                buttonPrev.visibility = View.INVISIBLE
                buttonNext.visibility = View.VISIBLE
                textPenjelasan.text = kunciJawaban.textJawaban1
                textHalaman.text = GlobalData.currentHalaman.toString() + "/" + kunciJawaban.jumlahHalaman.toString()
                imageGambar.setImageResource(kunciJawaban.idGambar1)
            }
        }
        buttonNext.setOnClickListener {
            if (GlobalData.currentHalaman >= 1){
                GlobalData.currentHalaman += 1
                textHalaman.text = GlobalData.currentHalaman.toString() + "/" + kunciJawaban.jumlahHalaman.toString()
                if (GlobalData.currentHalaman == kunciJawaban.jumlahHalaman){
                    buttonNext.visibility = View.INVISIBLE
                    GlobalData.currentHalaman -= 1
                }
                buttonPrev.visibility = View.VISIBLE
                textPenjelasan.text = kunciJawaban.textJawaban2
                imageGambar.setImageResource(kunciJawaban.idGambar2)
            }
        }

        buttonBerikutnya.setOnClickListener {
            GlobalData.currentHalaman = 1
            dialog.dismiss()
        }
        dialog.show()
    }
}