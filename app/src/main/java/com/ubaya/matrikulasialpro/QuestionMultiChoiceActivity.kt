package com.ubaya.matrikulasialpro

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
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
    companion object{
        val EXTRA_NAMASOAL = "EXTRA_NAMASOAL"
    }
    var namaSoal = ""
    @SuppressLint("SetTextI18n")
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
        }
        binding.buttonB.setOnClickListener {
            binding.buttonA.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonB.setBackgroundColor(Color.parseColor("#283777"))
            binding.buttonC.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonD.setBackgroundColor(Color.parseColor("#7997C9"))

            pilihanUser = GlobalData.pilihanB
        }
        binding.buttonC.setOnClickListener {
            binding.buttonA.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonB.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonC.setBackgroundColor(Color.parseColor("#283777"))
            binding.buttonD.setBackgroundColor(Color.parseColor("#7997C9"))

            pilihanUser = GlobalData.pilihanC
        }
        binding.buttonD.setOnClickListener {
            binding.buttonA.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonB.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonC.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonD.setBackgroundColor(Color.parseColor("#283777"))

            pilihanUser = GlobalData.pilihanD
        }

        binding.buttonCekHasil.setOnClickListener {
            if (GlobalData.jawabanSoal == pilihanUser){
                ShowDialogBenar()
            }else{
                ShowDialogSalah()
            }
        }

        binding.buttonHint.setOnClickListener{
            val dialog = Dialog(this)
            dialog.requestWindowFeature( Window.FEATURE_NO_TITLE)
            dialog.setCancelable(false)
            dialog.setContentView(R.layout.dialog_hint_layout)
            dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

            val buttonMengerti= dialog.findViewById(R.id.buttonMengertiHint) as Button
            val buttonPrev = dialog.findViewById(R.id.buttonPrevHint) as ImageButton
            val buttonNext = dialog.findViewById(R.id.buttonNextHint) as ImageButton
            val textPenjelasan = dialog.findViewById(R.id.textPenjelasanHint) as TextView
            val textHalaman = dialog.findViewById(R.id.textHalamanHint) as TextView
            val imageGambar = dialog.findViewById(R.id.imageGambarHint) as ImageView

            buttonNext.setBackgroundColor(Color.TRANSPARENT)
            buttonPrev.setBackgroundColor(Color.TRANSPARENT)

            for (hint in GlobalData.hintQuestion){
                if(namaSoal == hint.namaSoal) {
                    GlobalData.textHint1 = hint.textHint1
                    GlobalData.textHint2 = hint.textHint2
                    GlobalData.textHint3 = hint.textHint3
                    GlobalData.textHint4 = hint.textHint4
                    GlobalData.textHint5 = hint.textHint5
                    GlobalData.textHint6 = hint.textHint6
                    GlobalData.textHint7 = hint.textHint7

                    GlobalData.idGambarHint1 = hint.idGambar1
                    GlobalData.idGambarHint2 = hint.idGambar2
                    GlobalData.idGambarHint3 = hint.idGambar3
                    GlobalData.idGambarHint4 = hint.idGambar4
                    GlobalData.idGambarHint5 = hint.idGambar5
                    GlobalData.idGambarHint6 = hint.idGambar6
                    GlobalData.idGambarHint7 = hint.idGambar7
                    GlobalData.jumlahHalamanHint = hint.jumlahHalaman
                }
            }

            if (GlobalData.jumlahHalamanHint <= 1){
                buttonNext.visibility = View.INVISIBLE
            }

            buttonPrev.visibility = View.INVISIBLE
            textPenjelasan.text = GlobalData.textHint1
            textHalaman.text = GlobalData.currentHalamanHint.toString() + "/" + GlobalData.jumlahHalamanHint.toString()
            imageGambar.setImageResource(GlobalData.idGambarHint1)

            buttonPrev.setOnClickListener {
                textHalaman.text = GlobalData.currentHalamanHint.toString() + "/" + GlobalData.jumlahHalamanHint.toString()
                if (GlobalData.currentHalamanHint == 1){
                    buttonPrev.visibility = View.INVISIBLE
                    textPenjelasan.text = GlobalData.textHint1
                    imageGambar.setImageResource(GlobalData.idGambarHint1)
                } else if(GlobalData.currentHalamanHint == 2){
                    textPenjelasan.text = GlobalData.textHint2
                    imageGambar.setImageResource(GlobalData.idGambarHint2)
                    buttonPrev.visibility = View.VISIBLE
                    GlobalData.currentHalamanHint -= 1
                } else if(GlobalData.currentHalamanHint == 3){
                    textPenjelasan.text = GlobalData.textHint3
                    imageGambar.setImageResource(GlobalData.idGambarHint3)
                    buttonPrev.visibility = View.VISIBLE
                    GlobalData.currentHalamanHint -= 1
                } else if(GlobalData.currentHalamanHint == 4){
                    textPenjelasan.text = GlobalData.textHint4
                    imageGambar.setImageResource(GlobalData.idGambarHint4)
                    buttonPrev.visibility = View.VISIBLE
                    GlobalData.currentHalamanHint -= 1
                } else if(GlobalData.currentHalamanHint == 5){
                    textPenjelasan.text = GlobalData.textHint5
                    imageGambar.setImageResource(GlobalData.idGambarHint5)
                    buttonPrev.visibility = View.VISIBLE
                    GlobalData.currentHalamanHint -= 1
                } else if(GlobalData.currentHalamanHint == 6){
                    textPenjelasan.text = GlobalData.textHint6
                    imageGambar.setImageResource(GlobalData.idGambarHint6)
                    buttonPrev.visibility = View.VISIBLE
                    GlobalData.currentHalamanHint -= 1
                }
                buttonNext.visibility = View.VISIBLE
            }
            buttonNext.setOnClickListener {

                GlobalData.currentHalamanHint += 1
                textHalaman.text = GlobalData.currentHalamanHint.toString() + "/" + GlobalData.jumlahHalamanHint.toString()
                if (GlobalData.currentHalamanHint == 2){
                    textPenjelasan.text = GlobalData.textHint2
                    imageGambar.setImageResource(GlobalData.idGambarHint2)
                } else if (GlobalData.currentHalamanHint == 3){
                    textPenjelasan.text = GlobalData.textHint3
                    imageGambar.setImageResource(GlobalData.idGambarHint3)
                } else if (GlobalData.currentHalamanHint == 4){
                    textPenjelasan.text = GlobalData.textHint4
                    imageGambar.setImageResource(GlobalData.idGambarHint4)
                } else if (GlobalData.currentHalamanHint == 5){
                    textPenjelasan.text = GlobalData.textHint5
                    imageGambar.setImageResource(GlobalData.idGambarHint5)
                } else if (GlobalData.currentHalamanHint == 6){
                    textPenjelasan.text = GlobalData.textHint6
                    imageGambar.setImageResource(GlobalData.idGambarHint6)
                } else if (GlobalData.currentHalamanHint == 7){
                    textPenjelasan.text = GlobalData.textHint7
                    imageGambar.setImageResource(GlobalData.idGambarHint7)
                }

                if (GlobalData.currentHalamanHint == GlobalData.jumlahHalamanHint){
                    buttonNext.visibility = View.INVISIBLE
                    GlobalData.currentHalamanHint -= 1
                }
                buttonPrev.visibility = View.VISIBLE
            }

            buttonMengerti.setOnClickListener {
                GlobalData.ClearHint()
                dialog.dismiss()
            }
            dialog.show()
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
        val buttonPrev = dialog.findViewById(R.id.buttonPrev) as ImageButton
        val buttonNext = dialog.findViewById(R.id.buttonNext) as ImageButton
        val textPenjelasan = dialog.findViewById(R.id.textPenjelasanSoal) as TextView
        val textHalaman = dialog.findViewById(R.id.textHalaman) as TextView
        val imageGambar = dialog.findViewById(R.id.imageGambarJawaban) as ImageView

        buttonNext.setBackgroundColor(Color.TRANSPARENT)
        buttonPrev.setBackgroundColor(Color.TRANSPARENT)

        for (answerKey in GlobalData.answerKey){
            if(namaSoal == answerKey.namaSoal) {
                GlobalData.textJawaban1 = answerKey.textHint1
                GlobalData.textJawaban2 = answerKey.textHint2
                GlobalData.textJawaban3 = answerKey.textHint3
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
            if (namaSoal == "Kurs Mata Uang"){
                if(GlobalData.levelTertinggiUser == 0){
                    if (GlobalData.noSoalTertinggiUser < 2){
                        GlobalData.noSoalTertinggiUser = 2
                    }
                }
                val intent = Intent(this, QuestionUlanganAndPromosiActivity::class.java)
                intent.putExtra(EXTRA_NAMASOAL, "Hasil Ulangan Harian")
                startActivity(intent)
            } else if (namaSoal == "Kandang Bebek"){
                if(GlobalData.levelTertinggiUser == 0){
                    if (GlobalData.noSoalTertinggiUser < 4){
                        GlobalData.noSoalTertinggiUser = 4
                    }
                }
                val intent = Intent(this, QuestionVideoActivity::class.java)
                intent.putExtra(EXTRA_NAMASOAL, "Mainan Baru part 1")
                startActivity(intent)
            } else if (namaSoal == "Tugas Prakarya"){
                if(GlobalData.levelTertinggiUser == 1){
                    if (GlobalData.noSoalTertinggiUser < 2){
                        GlobalData.noSoalTertinggiUser = 2
                    }
                }
                val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
                intent.putExtra(EXTRA_NAMASOAL, "Eksperimen Tikus")
                startActivity(intent)
            } else if (namaSoal == "Eksperimen Tikus"){
                if(GlobalData.levelTertinggiUser == 1){
                    if (GlobalData.noSoalTertinggiUser < 3){
                        GlobalData.noSoalTertinggiUser = 3
                    }
                }
                val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
                intent.putExtra(EXTRA_NAMASOAL, "Bakteri")
                startActivity(intent)
            } else if (namaSoal == "Bakteri"){
                if(GlobalData.levelTertinggiUser == 1){
                    if (GlobalData.noSoalTertinggiUser < 4){
                        GlobalData.noSoalTertinggiUser = 4
                    }
                }
                val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
                intent.putExtra(EXTRA_NAMASOAL, "Kantong Kelereng")
                startActivity(intent)
            } else if (namaSoal == "Kantong Kelereng"){
                if(GlobalData.levelTertinggiUser == 1){
                    GlobalData.levelTertinggiUser = 2
                    GlobalData.noSoalTertinggiUser = 1
                }
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else if (namaSoal == "Belanja Tepung"){
                if(GlobalData.levelTertinggiUser == 2){
                    if (GlobalData.noSoalTertinggiUser < 2){
                        GlobalData.noSoalTertinggiUser = 2
                    }
                }
                val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
                intent.putExtra(EXTRA_NAMASOAL, "Alat Musik part 1")
                startActivity(intent)
            } else if (namaSoal == "Alat Musik part 1"){
                if(GlobalData.levelTertinggiUser == 2){
                    if (GlobalData.noSoalTertinggiUser < 3){
                        GlobalData.noSoalTertinggiUser = 3
                    }
                }
                val intent = Intent(this, QuestionMultiChoiceActivity::class.java)
                intent.putExtra(EXTRA_NAMASOAL, "Alat Musik part 2")
                startActivity(intent)
            } else if (namaSoal == "Alat Musik part 2"){
                if(GlobalData.levelTertinggiUser == 2){
                    if (GlobalData.noSoalTertinggiUser < 4){
                        GlobalData.noSoalTertinggiUser = 4
                    }
                }
                val intent = Intent(this, QuestionPesanLampuActivity::class.java)
                intent.putExtra(EXTRA_NAMASOAL, "Pesan Lampu part 1")
                startActivity(intent)
            }
            finish()
        }
        dialog.show()
    }

    override fun onBackPressed() {
        if(namaSoal == "Kurs Mata Uang" || namaSoal == "Kandang Bebek"){
            val intent = Intent(this, IntroductionDetailActivity::class.java)
            startActivity(intent)
        } else if (namaSoal == "Tugas Prakarya" || namaSoal == "Eksperimen Tikus" ||
            namaSoal == "Bakteri" || namaSoal == "Kantong Kelereng"){
            val intent = Intent(this, BeginnerDetailActivity::class.java)
            startActivity(intent)
        } else if (namaSoal == "Belanja Tepung" || namaSoal == "Alat Musik part 1" || namaSoal == "Alat Musik part 2"){
            val intent = Intent(this, StandartDetailActivity::class.java)
            startActivity(intent)
        }
        finish()
    }
}