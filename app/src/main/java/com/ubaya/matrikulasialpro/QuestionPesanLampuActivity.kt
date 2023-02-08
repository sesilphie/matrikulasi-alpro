package com.ubaya.matrikulasialpro

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.icu.text.ConstrainedFieldPosition
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.DefaultPlayerUiController
import com.ubaya.matrikulasialpro.databinding.ActivityQuestionPesanLampuBinding
import com.ubaya.matrikulasialpro.databinding.ActivityQuestionVideoBinding

class QuestionPesanLampuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionPesanLampuBinding

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