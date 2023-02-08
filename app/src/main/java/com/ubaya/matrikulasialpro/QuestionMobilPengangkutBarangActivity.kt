package com.ubaya.matrikulasialpro

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.ubaya.matrikulasialpro.databinding.ActivityQuestionMobilPengangkutBarangBinding
import com.ubaya.matrikulasialpro.databinding.ActivityQuestionPesanLampuBinding

class QuestionMobilPengangkutBarangActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionMobilPengangkutBarangBinding

    var namaSoal = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionMobilPengangkutBarangBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageButtonA.setBackgroundColor(Color.TRANSPARENT)
        binding.imageButtonB.setBackgroundColor(Color.TRANSPARENT)
        binding.imageButtonC.setBackgroundColor(Color.TRANSPARENT)
        binding.imageButtonD.setBackgroundColor(Color.TRANSPARENT)

        namaSoal = intent.getStringExtra(ExpertDetailActivity.EXTRA_NAMASOAL).toString()
        binding.textJudulSoal.text = namaSoal

        var pilihanUser = ""

        binding.textSoal1.text = GlobalData.questionMobilPengangkut.textSoal1
        binding.textSoal2.text = GlobalData.questionMobilPengangkut.textSoal2
        binding.imageGambar.setImageResource(GlobalData.questionMobilPengangkut.idGambar)
        binding.imageButtonA.setImageResource(GlobalData.questionMobilPengangkut.pilihanGambarA)
        binding.imageButtonB.setImageResource(GlobalData.questionMobilPengangkut.pilihanGambarB)
        binding.imageButtonC.setImageResource(GlobalData.questionMobilPengangkut.pilihanGambarC)
        binding.imageButtonD.setImageResource(GlobalData.questionMobilPengangkut.pilihanGambarD)

        GlobalData.pilihanA = GlobalData.questionMobilPengangkut.pilihanGambarA.toString()
        GlobalData.pilihanB = GlobalData.questionMobilPengangkut.pilihanGambarB.toString()
        GlobalData.pilihanC = GlobalData.questionMobilPengangkut.pilihanGambarC.toString()
        GlobalData.pilihanD = GlobalData.questionMobilPengangkut.pilihanGambarD.toString()
        GlobalData.jawabanSoal = GlobalData.questionMobilPengangkut.jawabanGambar.toString()

        binding.imageButtonA.setOnClickListener {
            pilihanUser = GlobalData.pilihanA

            binding.imageButtonA.setBackgroundColor(Color.parseColor("#283777"))
            binding.imageButtonB.setBackgroundColor(Color.TRANSPARENT)
            binding.imageButtonC.setBackgroundColor(Color.TRANSPARENT)
            binding.imageButtonD.setBackgroundColor(Color.TRANSPARENT)
        }
        binding.imageButtonB.setOnClickListener {
            pilihanUser = GlobalData.pilihanB

            binding.imageButtonA.setBackgroundColor(Color.TRANSPARENT)
            binding.imageButtonB.setBackgroundColor(Color.parseColor("#283777"))
            binding.imageButtonC.setBackgroundColor(Color.TRANSPARENT)
            binding.imageButtonD.setBackgroundColor(Color.TRANSPARENT)
        }
        binding.imageButtonC.setOnClickListener {
            pilihanUser = GlobalData.pilihanC

            binding.imageButtonA.setBackgroundColor(Color.TRANSPARENT)
            binding.imageButtonB.setBackgroundColor(Color.TRANSPARENT)
            binding.imageButtonC.setBackgroundColor(Color.parseColor("#283777"))
            binding.imageButtonD.setBackgroundColor(Color.TRANSPARENT)
        }
        binding.imageButtonD.setOnClickListener {
            pilihanUser = GlobalData.pilihanD

            binding.imageButtonA.setBackgroundColor(Color.TRANSPARENT)
            binding.imageButtonB.setBackgroundColor(Color.TRANSPARENT)
            binding.imageButtonC.setBackgroundColor(Color.TRANSPARENT)
            binding.imageButtonD.setBackgroundColor(Color.parseColor("#283777"))
        }

        binding.buttonCekHasil.setOnClickListener {
            if (GlobalData.jawabanSoal == pilihanUser){
                Toast.makeText(this, "KAMU BENAR", Toast.LENGTH_SHORT).show()
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
}