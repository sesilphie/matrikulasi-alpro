package com.ubaya.matrikulasialpro

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.view.Window
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import com.ubaya.matrikulasialpro.databinding.ActivityQuestionKatakAndRobotBinding
import com.ubaya.matrikulasialpro.databinding.ActivityQuestionLabirinBinding

class QuestionKatakAndRobotActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionKatakAndRobotBinding

    var namaSoal = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionKatakAndRobotBinding.inflate(layoutInflater)
        setContentView(binding.root)

        namaSoal = intent.getStringExtra(ExpertDetailActivity.EXTRA_NAMASOAL).toString()
        binding.textJudulSoal.text = namaSoal

        var pilihanUser = ""

        for (question in GlobalData.QuestionKatakAndRobot) {
            if (namaSoal == question.namaSoal) {
                if(namaSoal == "Robby Si Robot"){
                    binding.textSoal1.text = " "
                    binding.imageGambar3.visibility = View.GONE
                    binding.textSoal4.text = " "
                    //mengubah ukuran gambar dalam dp
                    val dimensionInPixel = 220
                    val dimensionInDp = TypedValue.applyDimension(
                        TypedValue.COMPLEX_UNIT_DIP,
                        dimensionInPixel.toFloat(),
                        resources.displayMetrics
                    )
                        .toInt()
                    binding.imageGambar1.getLayoutParams().height = dimensionInDp
                    binding.imageGambar1.getLayoutParams().width = dimensionInDp
                    binding.imageGambar1.requestLayout()

                    binding.imageGambar2.getLayoutParams().height = dimensionInDp
                    binding.imageGambar2.getLayoutParams().width = dimensionInDp
                    binding.imageGambar2.requestLayout()

                    val textSize = 1f
                    binding.textSoal1.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize)
                    binding.textSoal4.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize)
//                    //ubah posisi contraint imageGambar1
//                    val paramGambar1 = binding.imageGambar1.layoutParams as ConstraintLayout.LayoutParams
//                    paramGambar1.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID
//                    paramGambar1.topToTop = ConstraintLayout.LayoutParams.PARENT_ID
//                    paramGambar1.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID
//                    binding.imageGambar1.requestLayout()
//
//                    val paramButtonA = binding.buttonA.layoutParams as ConstraintLayout.LayoutParams
//                    paramButtonA.topToBottom = binding.textSoal3.id
//                    paramButtonA.startToStart = binding.textSoal3.id
//                    paramButtonA.endToStart = binding.guideline2.id
//                    binding.buttonA.requestLayout()
//
//                    val paramButtonB = binding.buttonB.layoutParams as ConstraintLayout.LayoutParams
//                    paramButtonB.topToBottom = binding.textSoal3.id
//                    paramButtonB.endToEnd = binding.textSoal3.id
//                    paramButtonB.startToStart = binding.guideline2.id
//                    binding.buttonB.requestLayout()

                    binding.imageGambar1.setImageResource(question.idGambar1)
                    binding.imageGambar2.setImageResource(question.idGambar2)
                    binding.textSoal2.text = question.textSoal2
                    binding.textSoal3.text = question.textSoal3

                } else if (namaSoal == "Katak"){
                    binding.imageGambar1.setImageResource(question.idGambar1)
                    binding.imageGambar2.setImageResource(question.idGambar2)
                    binding.imageGambar3.setImageResource(question.idGambar3)
                    binding.textSoal1.text = question.textSoal1
                    binding.textSoal2.text = question.textSoal2
                    binding.textSoal3.text = question.textSoal3
                    binding.textSoal4.text = question.textSoal4
                }


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
                ShowDialogBenar()
                //Toast.makeText(this, "KAMU BENAR", Toast.LENGTH_SHORT).show()
            }else{
                ShowDialogSalah()
                //Toast.makeText(this, "KAMU SALAH", Toast.LENGTH_SHORT).show()
            }
        }
    }
    @SuppressLint("SetTextI18n")
    fun ShowDialogBenar(){
        val dialog = Dialog(this)
        dialog.requestWindowFeature( Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dialog_benar_layout)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val buttonBerikutnya= dialog.findViewById(R.id.buttonBerikutnya) as Button
        val buttonPrev = dialog.findViewById(R.id.buttonPrev) as ImageButton
        val buttonNext = dialog.findViewById(R.id.buttonNext) as ImageButton
        val textPenjelasan = dialog.findViewById(R.id.textPenjelasanSoal) as TextView
        val textHalaman = dialog.findViewById(R.id.textHalaman) as TextView
        val imageGambar = dialog.findViewById(R.id.imageGambarJawaban) as ImageView

        buttonNext.setBackgroundColor(Color.TRANSPARENT)
        buttonPrev.setBackgroundColor(Color.TRANSPARENT)

        for (answerKey in GlobalData.answerKey){
            if(namaSoal == answerKey.namaSoal) {
                GlobalData.textJawaban1 = answerKey.textJawaban1
                GlobalData.textJawaban2 = answerKey.textJawaban2
                GlobalData.textJawaban3 = answerKey.textJawaban3
                GlobalData.idGambarBenar1 = answerKey.idGambar1
                GlobalData.idGambarBenar2 = answerKey.idGambar2
                GlobalData.idGambarBenar3 = answerKey.idGambar3
                GlobalData.jumlahHalaman = answerKey.jumlahHalaman
            }
        }

        if (GlobalData.jumlahHalaman <= 1){
            buttonNext.visibility = View.INVISIBLE
        }

        buttonPrev.visibility = View.INVISIBLE
        textPenjelasan.text = GlobalData.textJawaban1
        textHalaman.text = GlobalData.currentHalaman.toString() + "/" + GlobalData.jumlahHalaman.toString()
        imageGambar.setImageResource(GlobalData.idGambarBenar1)

        buttonPrev.setOnClickListener {
            if (GlobalData.currentHalaman == 1){
                buttonPrev.visibility = View.INVISIBLE
                buttonNext.visibility = View.VISIBLE
                textPenjelasan.text = GlobalData.textJawaban1
                textHalaman.text = GlobalData.currentHalaman.toString() + "/" + GlobalData.jumlahHalaman.toString()
                imageGambar.setImageResource(GlobalData.idGambarBenar1)
            } else if (GlobalData.currentHalaman == 2){
                buttonNext.visibility = View.VISIBLE
                buttonPrev.visibility = View.VISIBLE
                textPenjelasan.text = GlobalData.textJawaban2
                textHalaman.text = GlobalData.currentHalaman.toString() + "/" + GlobalData.jumlahHalaman.toString()
                imageGambar.setImageResource(GlobalData.idGambarBenar2)
                GlobalData.currentHalaman -= 1
            }
        }
        buttonNext.setOnClickListener {
            if (GlobalData.currentHalaman == 1){
                GlobalData.currentHalaman += 1
                textHalaman.text = GlobalData.currentHalaman.toString() + "/" + GlobalData.jumlahHalaman.toString()
                if (GlobalData.currentHalaman == GlobalData.jumlahHalaman){
                    buttonNext.visibility = View.INVISIBLE
                    GlobalData.currentHalaman -= 1
                }
                buttonPrev.visibility = View.VISIBLE
                textPenjelasan.text = GlobalData.textJawaban2
                imageGambar.setImageResource(GlobalData.idGambarBenar2)
            } else if (GlobalData.currentHalaman == 2){
                GlobalData.currentHalaman += 1
                textHalaman.text = GlobalData.currentHalaman.toString() + "/" + GlobalData.jumlahHalaman.toString()
                if (GlobalData.currentHalaman == GlobalData.jumlahHalaman){
                    buttonNext.visibility = View.INVISIBLE
                    GlobalData.currentHalaman -= 1
                }
                buttonPrev.visibility = View.VISIBLE
                textPenjelasan.text = GlobalData.textJawaban3
                imageGambar.setImageResource(GlobalData.idGambarBenar3)
            }
        }

        buttonBerikutnya.setOnClickListener {
            GlobalData.ClearJawaban()
            dialog.dismiss()
        }
        dialog.show()
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
}