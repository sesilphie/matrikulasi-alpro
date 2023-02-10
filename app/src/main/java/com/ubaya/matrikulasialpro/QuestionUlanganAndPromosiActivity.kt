package com.ubaya.matrikulasialpro

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ubaya.matrikulasialpro.databinding.ActivityQuestionMobilPengangkutBarangBinding
import com.ubaya.matrikulasialpro.databinding.ActivityQuestionUlanganAndPromosiBinding
import android.R
import android.annotation.SuppressLint
import android.app.Dialog

import android.graphics.drawable.Drawable
import android.graphics.drawable.ColorDrawable
import android.view.View
import android.view.Window
import android.widget.*


class QuestionUlanganAndPromosiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionUlanganAndPromosiBinding

    var namaSoal = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionUlanganAndPromosiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageButton1.setBackgroundColor(Color.TRANSPARENT)
        binding.imageButton2.setBackgroundColor(Color.TRANSPARENT)
        binding.imageButton3.setBackgroundColor(Color.TRANSPARENT)
        binding.imageButton4.setBackgroundColor(Color.TRANSPARENT)
        binding.imageButton5.setBackgroundColor(Color.TRANSPARENT)

        namaSoal = intent.getStringExtra(ExpertDetailActivity.EXTRA_NAMASOAL).toString()
        binding.textJudulSoal.text = namaSoal


        for (question in GlobalData.questionUlanganAndPromosi){
            if(namaSoal == question.namaSoal){
                if(namaSoal == "Hasil Ulangan Harian"){
                    binding.textAwal.text = "Tertinggi"
                    binding.textAkhir.text = "Terendah"
                } else if (namaSoal == "Promosi Minuman"){
                    binding.textAwal.text = "Senin"
                    binding.textAkhir.text = "Jumat"
                }

                binding.textSoal.text = question.textSoal
                binding.imageGambar.setImageResource(question.idGambar)
                binding.imageButton1.setImageResource(question.pilihanGambarA)
                binding.imageButton1.setTag(question.pilihanGambarA)
                binding.imageButton2.setImageResource(question.pilihanGambarB)
                binding.imageButton2.setTag(question.pilihanGambarB)
                binding.imageButton3.setImageResource(question.pilihanGambarC)
                binding.imageButton3.setTag(question.pilihanGambarC)
                binding.imageButton4.setImageResource(question.pilihanGambarD)
                binding.imageButton4.setTag(question.pilihanGambarD)
                binding.imageButton5.setImageResource(question.pilihanGambarE)
                binding.imageButton5.setTag(question.pilihanGambarE)

                GlobalData.jawabanSoal = question.jawabanSoal.toString()
            }
        }


        var idGambar1User = 0
        var idGambar2User = 0
        var pilihan1UserClicked = false

        binding.imageButton1.setOnClickListener {
            if (pilihan1UserClicked == true){
                binding.imageButton1.setImageResource(idGambar1User)

                idGambar2User = binding.imageButton1.getTag() as Int

                if(idGambar1User == binding.imageButton2.getTag()){
                    binding.imageButton2.setImageResource(idGambar2User)
                    binding.imageButton2.setTag(idGambar2User)
                } else if (idGambar1User == binding.imageButton3.getTag()){
                    binding.imageButton3.setImageResource(idGambar2User)
                    binding.imageButton3.setTag(idGambar2User)
                } else if (idGambar1User == binding.imageButton4.getTag()){
                    binding.imageButton4.setImageResource(idGambar2User)
                    binding.imageButton4.setTag(idGambar2User)
                } else if (idGambar1User == binding.imageButton5.getTag()){
                    binding.imageButton5.setImageResource(idGambar2User)
                    binding.imageButton5.setTag(idGambar2User)
                }
                binding.imageButton1.setTag(idGambar1User)

                idGambar1User = 0
                idGambar2User = 0
                pilihan1UserClicked = false

                binding.imageButton1.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton2.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton3.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton4.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton5.setBackgroundColor(Color.TRANSPARENT)
            } else{
                idGambar1User = binding.imageButton1.getTag() as Int //ambil gambar id
                pilihan1UserClicked = true


                binding.imageButton1.setBackgroundColor(Color.parseColor("#283777"))
                binding.imageButton2.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton3.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton4.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton5.setBackgroundColor(Color.TRANSPARENT)
            }
        }
        binding.imageButton2.setOnClickListener {
            if (pilihan1UserClicked == true){
                binding.imageButton2.setImageResource(idGambar1User)
                idGambar2User = binding.imageButton2.getTag() as Int

                if(idGambar1User == binding.imageButton1.getTag()){
                    binding.imageButton1.setImageResource(idGambar2User)
                    binding.imageButton1.setTag(idGambar2User)
                } else if (idGambar1User == binding.imageButton3.getTag()){
                    binding.imageButton3.setImageResource(idGambar2User)
                    binding.imageButton3.setTag(idGambar2User)
                } else if (idGambar1User == binding.imageButton4.getTag()){
                    binding.imageButton4.setImageResource(idGambar2User)
                    binding.imageButton4.setTag(idGambar2User)
                } else if (idGambar1User == binding.imageButton5.getTag()){
                    binding.imageButton5.setImageResource(idGambar2User)
                    binding.imageButton5.setTag(idGambar2User)
                }
                binding.imageButton2.setTag(idGambar1User)

                idGambar1User = 0
                idGambar2User = 0
                pilihan1UserClicked = false

                binding.imageButton1.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton2.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton3.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton4.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton5.setBackgroundColor(Color.TRANSPARENT)
            } else{
                idGambar1User = binding.imageButton2.getTag() as Int //ambil gambar id
                pilihan1UserClicked = true


                binding.imageButton1.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton2.setBackgroundColor(Color.parseColor("#283777"))
                binding.imageButton3.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton4.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton5.setBackgroundColor(Color.TRANSPARENT)
            }
        }
        binding.imageButton3.setOnClickListener {
            if (pilihan1UserClicked == true){
                binding.imageButton3.setImageResource(idGambar1User)
                idGambar2User = binding.imageButton3.getTag() as Int

                if(idGambar1User == binding.imageButton1.getTag()){
                    binding.imageButton1.setImageResource(idGambar2User)
                    binding.imageButton1.setTag(idGambar2User)
                } else if (idGambar1User == binding.imageButton2.getTag()){
                    binding.imageButton2.setImageResource(idGambar2User)
                    binding.imageButton2.setTag(idGambar2User)
                } else if (idGambar1User == binding.imageButton4.getTag()){
                    binding.imageButton4.setImageResource(idGambar2User)
                    binding.imageButton4.setTag(idGambar2User)
                } else if (idGambar1User == binding.imageButton5.getTag()){
                    binding.imageButton5.setImageResource(idGambar2User)
                    binding.imageButton5.setTag(idGambar2User)
                }
                binding.imageButton3.setTag(idGambar1User)

                idGambar1User = 0
                idGambar2User = 0
                pilihan1UserClicked = false

                binding.imageButton1.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton2.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton3.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton4.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton5.setBackgroundColor(Color.TRANSPARENT)
            } else{
                idGambar1User = binding.imageButton3.getTag() as Int //ambil gambar id
                pilihan1UserClicked = true

                binding.imageButton1.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton2.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton3.setBackgroundColor(Color.parseColor("#283777"))
                binding.imageButton4.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton5.setBackgroundColor(Color.TRANSPARENT)
            }
        }
        binding.imageButton4.setOnClickListener {
            if (pilihan1UserClicked == true){
                binding.imageButton4.setImageResource(idGambar1User)
                idGambar2User = binding.imageButton4.getTag() as Int

                if(idGambar1User == binding.imageButton1.getTag()){
                    binding.imageButton1.setImageResource(idGambar2User)
                    binding.imageButton1.setTag(idGambar2User)
                } else if (idGambar1User == binding.imageButton2.getTag()){
                    binding.imageButton2.setImageResource(idGambar2User)
                    binding.imageButton2.setTag(idGambar2User)
                } else if (idGambar1User == binding.imageButton3.getTag()){
                    binding.imageButton3.setImageResource(idGambar2User)
                    binding.imageButton3.setTag(idGambar2User)
                } else if (idGambar1User == binding.imageButton5.getTag()){
                    binding.imageButton5.setImageResource(idGambar2User)
                    binding.imageButton5.setTag(idGambar2User)
                }
                binding.imageButton4.setTag(idGambar1User)

                idGambar1User = 0
                idGambar2User = 0
                pilihan1UserClicked = false

                binding.imageButton1.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton2.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton3.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton4.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton5.setBackgroundColor(Color.TRANSPARENT)
            } else{
                idGambar1User = binding.imageButton4.getTag() as Int //ambil gambar id
                pilihan1UserClicked = true

                binding.imageButton1.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton2.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton3.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton4.setBackgroundColor(Color.parseColor("#283777"))
                binding.imageButton5.setBackgroundColor(Color.TRANSPARENT)
            }
        }
        binding.imageButton5.setOnClickListener {
            if (pilihan1UserClicked == true){
                binding.imageButton5.setImageResource(idGambar1User)
                idGambar2User = binding.imageButton5.getTag() as Int

                if(idGambar1User == binding.imageButton1.getTag()){
                    binding.imageButton1.setImageResource(idGambar2User)
                    binding.imageButton1.setTag(idGambar2User)
                } else if (idGambar1User == binding.imageButton2.getTag()){
                    binding.imageButton2.setImageResource(idGambar2User)
                    binding.imageButton2.setTag(idGambar2User)
                } else if (idGambar1User == binding.imageButton3.getTag()){
                    binding.imageButton3.setImageResource(idGambar2User)
                    binding.imageButton3.setTag(idGambar2User)
                } else if (idGambar1User == binding.imageButton4.getTag()){
                    binding.imageButton4.setImageResource(idGambar2User)
                    binding.imageButton4.setTag(idGambar2User)
                }
                binding.imageButton5.setTag(idGambar1User)

                idGambar1User = 0
                idGambar2User = 0
                pilihan1UserClicked = false

                binding.imageButton1.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton2.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton3.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton4.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton5.setBackgroundColor(Color.TRANSPARENT)
            } else{
                idGambar1User = binding.imageButton5.getTag() as Int //ambil gambar id
                pilihan1UserClicked = true

                binding.imageButton1.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton2.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton3.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton4.setBackgroundColor(Color.TRANSPARENT)
                binding.imageButton5.setBackgroundColor(Color.parseColor("#283777"))
            }
        }
        binding.buttonCekHasil.setOnClickListener {
            var pilihanUser = binding.imageButton1.getTag().toString() + binding.imageButton2.getTag().toString() + binding.imageButton3.getTag().toString() +
                    binding.imageButton4.getTag().toString() + binding.imageButton5.getTag().toString()
            if (GlobalData.jawabanSoal == pilihanUser){
                ShowDialogBenar()
                //Toast.makeText(this, "KAMU BENAR", Toast.LENGTH_SHORT).show()
            } else{
                ShowDialogSalah()
                //Toast.makeText(this, "KAMU SALAH", Toast.LENGTH_SHORT).show()
            }
        }
    }
    fun ShowDialogSalah(){
        val dialog = Dialog(this)
        dialog.requestWindowFeature( Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(com.ubaya.matrikulasialpro.R.layout.dialog_salah_layout)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val buttonCobaLagi = dialog.findViewById(com.ubaya.matrikulasialpro.R.id.buttonCobaLagi) as Button
        val textSolusiSoal = dialog.findViewById(com.ubaya.matrikulasialpro.R.id.textSolusiSoal) as TextView

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
        dialog.setContentView(com.ubaya.matrikulasialpro.R.layout.dialog_benar_layout)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val buttonBerikutnya= dialog.findViewById(com.ubaya.matrikulasialpro.R.id.buttonBerikutnya) as Button
        val buttonPrev = dialog.findViewById(com.ubaya.matrikulasialpro.R.id.buttonPrev) as ImageButton
        val buttonNext = dialog.findViewById(com.ubaya.matrikulasialpro.R.id.buttonNext) as ImageButton
        val textPenjelasan = dialog.findViewById(com.ubaya.matrikulasialpro.R.id.textPenjelasanSoal) as TextView
        val textHalaman = dialog.findViewById(com.ubaya.matrikulasialpro.R.id.textHalaman) as TextView
        val imageGambar = dialog.findViewById(com.ubaya.matrikulasialpro.R.id.imageGambarJawaban) as ImageView


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
            GlobalData.currentHalaman = 1
            GlobalData.jumlahHalaman = 0
            GlobalData.idGambarBenar1 = 0
            GlobalData.idGambarBenar2 = 0
            GlobalData.idGambarBenar3 = 0
            GlobalData.textJawaban1 = ""
            GlobalData.textJawaban2 = ""
            GlobalData.textJawaban3 = ""
            dialog.dismiss()
        }
        dialog.show()
    }
}