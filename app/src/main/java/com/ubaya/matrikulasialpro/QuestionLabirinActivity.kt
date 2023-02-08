package com.ubaya.matrikulasialpro

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
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
import com.ubaya.matrikulasialpro.databinding.ActivityQuestionLabirinBinding
import com.ubaya.matrikulasialpro.databinding.ActivityQuestionPesanLampuBinding

class QuestionLabirinActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionLabirinBinding

    var namaSoal = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionLabirinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        namaSoal = intent.getStringExtra(ExpertDetailActivity.EXTRA_NAMASOAL).toString()
        binding.textJudulSoal.text = namaSoal

        var pilihanUser = ""

        //Video Youtube
        lifecycle.addObserver(binding.youtubePlayerView)

        val listener = object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                var videoId = "5ckjuF7wAGY"  //video labirin

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
                binding.imageGambarIlustrasi1.setImageResource(question.idGambar1)
                binding.imageGambarIlustrasi2.setImageResource(question.idGambar2)
                binding.textSoal1.text = question.textSoal1
                binding.textSoal2.text = question.textSoal2
                binding.textSoal3.text = question.textSoal3
                binding.buttonA.text = question.pilihanA
                binding.buttonB.text = question.pilihanB
                binding.buttonC.text = question.pilihanC
                binding.buttonD.text = question.pilihanD

                GlobalData.pilihanA = question.pilihanA
                GlobalData.pilihanB = question.pilihanB
                GlobalData.pilihanC = question.pilihanC
                GlobalData.pilihanD = question.pilihanD
                GlobalData.jawabanSoal = question.jawabanText
            }
        }

        binding.buttonA.setOnClickListener {
            binding.buttonA.setBackgroundColor(Color.parseColor("#283777"))
            binding.buttonB.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonC.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonD.setBackgroundColor(Color.parseColor("#7997C9"))

            pilihanUser = GlobalData.pilihanA
            Toast.makeText(this, pilihanUser, Toast.LENGTH_SHORT).show()
        }
        binding.buttonB.setOnClickListener {
            binding.buttonA.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonB.setBackgroundColor(Color.parseColor("#283777"))
            binding.buttonC.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonD.setBackgroundColor(Color.parseColor("#7997C9"))

            pilihanUser = GlobalData.pilihanB
            Toast.makeText(this, pilihanUser, Toast.LENGTH_SHORT).show()
        }
        binding.buttonC.setOnClickListener {
            binding.buttonA.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonB.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonC.setBackgroundColor(Color.parseColor("#283777"))
            binding.buttonD.setBackgroundColor(Color.parseColor("#7997C9"))

            pilihanUser = GlobalData.pilihanC
            Toast.makeText(this, pilihanUser, Toast.LENGTH_SHORT).show()
        }
        binding.buttonD.setOnClickListener {
            binding.buttonA.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonB.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonC.setBackgroundColor(Color.parseColor("#7997C9"))
            binding.buttonD.setBackgroundColor(Color.parseColor("#283777"))

            pilihanUser = GlobalData.pilihanD
            Toast.makeText(this, pilihanUser, Toast.LENGTH_SHORT).show()
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