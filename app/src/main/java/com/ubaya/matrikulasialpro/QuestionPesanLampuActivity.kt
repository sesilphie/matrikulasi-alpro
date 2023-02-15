package com.ubaya.matrikulasialpro

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.icu.text.ConstrainedFieldPosition
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Window
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.DefaultPlayerUiController
import com.ubaya.matrikulasialpro.databinding.ActivityQuestionPesanLampuBinding
import com.ubaya.matrikulasialpro.databinding.ActivityQuestionVideoBinding
import org.json.JSONObject

class QuestionPesanLampuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionPesanLampuBinding
    companion object{
        val EXTRA_NAMASOAL = "EXTRA_NAMASOAL"
    }
    var namaSoal = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionPesanLampuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageButtonA.setBackgroundColor(Color.TRANSPARENT)
        binding.imageButtonB.setBackgroundColor(Color.TRANSPARENT)
        binding.imageButtonC.setBackgroundColor(Color.TRANSPARENT)

        namaSoal = intent.getStringExtra(IntroductionDetailActivity.EXTRA_NAMASOAL).toString()
        binding.textJudulVideo.text = namaSoal

        var pilihanUser = ""

        //Video Youtube
        lifecycle.addObserver(binding.youtubePlayerView)

        val listener = object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                var videoId = "uUNuDQ1JytY" // default
                if (namaSoal == "Pesan Lampu part 1") {
                    videoId = "bOVz8K0K8bo"
                } else if (namaSoal == "Pesan Lampu part 2") {
                    videoId = "XSBvLeTP-8c"
                }

                val defaultUI = DefaultPlayerUiController(binding.youtubePlayerView, youTubePlayer)
                defaultUI.showFullscreenButton(false)
                binding.youtubePlayerView.setCustomPlayerUi(defaultUI.rootView)
                youTubePlayer.loadVideo(videoId, 0f)
            }
        }

        val options: IFramePlayerOptions = IFramePlayerOptions.Builder()
            .controls(0)
            .build()

        binding.youtubePlayerView.initialize(listener, options)

        for (question in GlobalData.questionPesanLampuandLabirin) {
            if (namaSoal == question.namaSoal) {
                if(namaSoal == "Pesan Lampu part 1"){
                    binding.imageViewPertanyaan.setImageResource(question.idGambar2)
                } else if (namaSoal == "Pesan Lampu part 2"){
                    binding.imageViewPertanyaan.visibility = View.GONE
                    //ubah posisi contraint textSoal3
                    val params = binding.textSoal3.layoutParams as ConstraintLayout.LayoutParams
                    params.leftToLeft = binding.textSoal2.id
                    params.topToBottom = binding.textSoal2.id
                    params.rightToRight = binding.textSoal2.id
                    binding.textSoal3.requestLayout()
                }
                binding.imageGambarIlustrasi.setImageResource(question.idGambar1)
                binding.textSoal1.text = question.textSoal1
                binding.textSoal2.text = question.textSoal2
                binding.textSoal3.text = question.textSoal3
                binding.imageButtonA.setImageResource(question.gambarA)
                binding.imageButtonB.setImageResource(question.gambarB)
                binding.imageButtonC.setImageResource(question.gambarC)

                GlobalData.pilihanA = question.gambarA.toString()
                GlobalData.pilihanB = question.gambarB.toString()
                GlobalData.pilihanC = question.gambarC.toString()
                GlobalData.jawabanSoal = question.jawabanGambar.toString()
            }
        }

        binding.imageButtonA.setOnClickListener {
            binding.imageButtonA.setBackgroundColor(Color.parseColor("#283777"))
            binding.imageButtonB.setBackgroundColor(Color.TRANSPARENT)
            binding.imageButtonC.setBackgroundColor(Color.TRANSPARENT)

            pilihanUser = GlobalData.pilihanA
        }
        binding.imageButtonB.setOnClickListener {
            binding.imageButtonA.setBackgroundColor(Color.TRANSPARENT)
            binding.imageButtonB.setBackgroundColor(Color.parseColor("#283777"))
            binding.imageButtonC.setBackgroundColor(Color.TRANSPARENT)

            pilihanUser = GlobalData.pilihanB
        }
        binding.imageButtonC.setOnClickListener {
            binding.imageButtonA.setBackgroundColor(Color.TRANSPARENT)
            binding.imageButtonB.setBackgroundColor(Color.TRANSPARENT)
            binding.imageButtonC.setBackgroundColor(Color.parseColor("#283777"))

            pilihanUser = GlobalData.pilihanC
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
            var intent = Intent(this, QuestionPesanLampuActivity::class.java)
            if (namaSoal == "Pesan Lampu part 1"){
                if(GlobalData.levelTertinggiUser == 2){
                    if (GlobalData.noSoalTertinggiUser < 5){
                        GlobalData.noSoalTertinggiUser = 5
                    }
                }
                intent = Intent(this, QuestionPesanLampuActivity::class.java)
                intent.putExtra(EXTRA_NAMASOAL, "Pesan Lampu part 2")
            } else if (namaSoal == "Pesan Lampu part 2"){
                if(GlobalData.levelTertinggiUser == 2){
                    GlobalData.levelTertinggiUser = 3
                    GlobalData.noSoalTertinggiUser = 1
                }
                intent = Intent(this, MainActivity::class.java)
            }
            val queue = Volley.newRequestQueue(this)
            val url = "http://192.168.1.176/tugas_akhir/updateLevelSoalUser_matrikulasialpro.php"
            val stringRequest = object : StringRequest(
                Request.Method.POST, url,
                Response.Listener {
                    Log.d("checkparams", it)
                    val obj = JSONObject(it)
                    if (obj.getString("result") == "OK"){
//                        Toast.makeText(this, "UPDATE SOAL LEVEL BERHASIL", Toast.LENGTH_SHORT).show()
                        dialog.dismiss()
                        startActivity(intent)
                        finish()
                    } else {
                        Toast.makeText(this, "UPDATE SOAL LEVEL GAGAL", Toast.LENGTH_SHORT).show()
                    }
                },
                Response.ErrorListener {
                    Log.d("paramserror", it.message.toString())
                }
            ){
                override fun getParams(): MutableMap<String, String> {
                    return hashMapOf("username" to GlobalData.user.username, "levels_tertinggi" to GlobalData.levelTertinggiUser.toString(),
                        "no_soal_tertinggi" to GlobalData.noSoalTertinggiUser.toString())
                }
            }
            queue.add(stringRequest)
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

    override fun onBackPressed() {
        val intent = Intent(this, StandartDetailActivity::class.java)
        startActivity(intent)
        finish()
    }
}