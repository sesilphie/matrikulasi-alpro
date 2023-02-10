package com.ubaya.matrikulasialpro

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.*
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.DefaultPlayerUiController
import com.ubaya.matrikulasialpro.databinding.ActivityQuestionLabirinBinding
import com.ubaya.matrikulasialpro.databinding.ActivityQuestionMainanBaruPart2ActvityBinding

class QuestionMainanBaruPart2Actvity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionMainanBaruPart2ActvityBinding

    var namaSoal = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionMainanBaruPart2ActvityBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imageButton1.setBackgroundColor(Color.TRANSPARENT)
        binding.imageButton2.setBackgroundColor(Color.TRANSPARENT)
        binding.imageButton3.setBackgroundColor(Color.TRANSPARENT)
        binding.imageButton4.setBackgroundColor(Color.TRANSPARENT)
        binding.imageButton5.setBackgroundColor(Color.TRANSPARENT)
        binding.imageButton6.setBackgroundColor(Color.TRANSPARENT)
        binding.imageButton7.setBackgroundColor(Color.TRANSPARENT)
        binding.imageButton8.setBackgroundColor(Color.TRANSPARENT)
        binding.imageButton9.setBackgroundColor(Color.TRANSPARENT)

        namaSoal = intent.getStringExtra(IntroductionDetailActivity.EXTRA_NAMASOAL).toString()
        binding.textJudulSoal.text = namaSoal

        var pilihanUser = ""

        //Video Youtube
        lifecycle.addObserver(binding.youtubePlayerView)

        val listener = object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                var videoId = "nKrSTWMfDm4"  //video Mainan Baru part 2

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

        binding.textSoal.text = GlobalData.questionMainanBaruPart2.textSoal
        GlobalData.jawabanSoal = GlobalData.questionMainanBaruPart2.jawabanSoal

        binding.imageButton1.setImageResource(R.drawable.intro_mainanbaru_1)
        binding.imageButton2.setImageResource(R.drawable.intro_mainanbaru_2_putih)
        binding.imageButton2.setTag(R.drawable.intro_mainanbaru_2_putih)

        binding.imageButton3.setImageResource(R.drawable.intro_mainanbaru_3)
        binding.imageButton4.setImageResource(R.drawable.intro_mainanbaru_4)
        binding.imageButton5.setImageResource(R.drawable.intro_mainanbaru_5_putih)
        binding.imageButton5.setTag(R.drawable.intro_mainanbaru_5_putih
        )
        binding.imageButton6.setImageResource(R.drawable.intro_mainanbaru_6)
        binding.imageButton7.setImageResource(R.drawable.intro_mainanbaru_7_putih)
        binding.imageButton7.setTag(R.drawable.intro_mainanbaru_7_putih)

        binding.imageButton8.setImageResource(R.drawable.intro_mainanbaru_8_putih)
        binding.imageButton8.setTag(R.drawable.intro_mainanbaru_8_putih)

        binding.imageButton9.setImageResource(R.drawable.intro_mainanbaru_9)

        fun ChangeColor(imageButton: ImageButton, noButton: String){
            if (noButton == "2"){
                if(imageButton.getTag() == R.drawable.intro_mainanbaru_2_putih){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_2_biru)
                    imageButton.setTag(R.drawable.intro_mainanbaru_2_biru)
                }
                else if(imageButton.getTag() == R.drawable.intro_mainanbaru_2_biru){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_2_hijau)
                    imageButton.setTag(R.drawable.intro_mainanbaru_2_hijau)
                }
                else if(imageButton.getTag() == R.drawable.intro_mainanbaru_2_hijau){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_2_kuning)
                    imageButton.setTag(R.drawable.intro_mainanbaru_2_kuning)
                }
                else if(imageButton.getTag() == R.drawable.intro_mainanbaru_2_kuning){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_2_merah)
                    imageButton.setTag(R.drawable.intro_mainanbaru_2_merah)
                }
                else if(imageButton.getTag() == R.drawable.intro_mainanbaru_2_merah){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_2_orange)
                    imageButton.setTag(R.drawable.intro_mainanbaru_2_orange)
                }
                else if(imageButton.getTag() == R.drawable.intro_mainanbaru_2_orange){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_2_biru)
                    imageButton.setTag(R.drawable.intro_mainanbaru_2_biru)
                }
            } else if (noButton == "5"){
                if(imageButton.getTag() == R.drawable.intro_mainanbaru_5_putih){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_5_biru)
                    imageButton.setTag(R.drawable.intro_mainanbaru_5_biru)
                }
                else if(imageButton.getTag() == R.drawable.intro_mainanbaru_5_biru){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_5_hijau)
                    imageButton.setTag(R.drawable.intro_mainanbaru_5_hijau)
                }
                else if(imageButton.getTag() == R.drawable.intro_mainanbaru_5_hijau){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_5_kuning)
                    imageButton.setTag(R.drawable.intro_mainanbaru_5_kuning)
                }
                else if(imageButton.getTag() == R.drawable.intro_mainanbaru_5_kuning){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_5_merah)
                    imageButton.setTag(R.drawable.intro_mainanbaru_5_merah)
                }
                else if(imageButton.getTag() == R.drawable.intro_mainanbaru_5_merah){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_5_orange)
                    imageButton.setTag(R.drawable.intro_mainanbaru_5_orange)
                }
                else if(imageButton.getTag() == R.drawable.intro_mainanbaru_5_orange){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_5_biru)
                    imageButton.setTag(R.drawable.intro_mainanbaru_5_biru)
                }
            } else if (noButton == "7"){
                if(imageButton.getTag() == R.drawable.intro_mainanbaru_7_putih){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_7_biru)
                    imageButton.setTag(R.drawable.intro_mainanbaru_7_biru)
                }
                else if(imageButton.getTag() == R.drawable.intro_mainanbaru_7_biru){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_7_hijau)
                    imageButton.setTag(R.drawable.intro_mainanbaru_7_hijau)
                }
                else if(imageButton.getTag() == R.drawable.intro_mainanbaru_7_hijau){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_7_kuning)
                    imageButton.setTag(R.drawable.intro_mainanbaru_7_kuning)
                }
                else if(imageButton.getTag() == R.drawable.intro_mainanbaru_7_kuning){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_7_merah)
                    imageButton.setTag(R.drawable.intro_mainanbaru_7_merah)
                }
                else if(imageButton.getTag() == R.drawable.intro_mainanbaru_7_merah){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_7_orange)
                    imageButton.setTag(R.drawable.intro_mainanbaru_7_orange)
                }
                else if(imageButton.getTag() == R.drawable.intro_mainanbaru_7_orange){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_7_biru)
                    imageButton.setTag(R.drawable.intro_mainanbaru_7_biru)
                }
            } else if (noButton == "8"){
                if(imageButton.getTag() == R.drawable.intro_mainanbaru_8_putih){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_8_biru)
                    imageButton.setTag(R.drawable.intro_mainanbaru_8_biru)
                }
                else if(imageButton.getTag() == R.drawable.intro_mainanbaru_8_biru){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_8_hijau)
                    imageButton.setTag(R.drawable.intro_mainanbaru_8_hijau)
                }
                else if(imageButton.getTag() == R.drawable.intro_mainanbaru_8_hijau){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_8_kuning)
                    imageButton.setTag(R.drawable.intro_mainanbaru_8_kuning)
                }
                else if(imageButton.getTag() == R.drawable.intro_mainanbaru_8_kuning){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_8_merah)
                    imageButton.setTag(R.drawable.intro_mainanbaru_8_merah)
                }
                else if(imageButton.getTag() == R.drawable.intro_mainanbaru_8_merah){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_8_orange)
                    imageButton.setTag(R.drawable.intro_mainanbaru_8_orange)
                }
                else if(imageButton.getTag() == R.drawable.intro_mainanbaru_8_orange){
                    imageButton.setImageResource(R.drawable.intro_mainanbaru_8_biru)
                    imageButton.setTag(R.drawable.intro_mainanbaru_8_biru)
                }
            }

        }

        binding.imageButton2.setOnClickListener {
            ChangeColor(binding.imageButton2, "2")
        }
        binding.imageButton5.setOnClickListener {
            ChangeColor(binding.imageButton5, "5")
        }
        binding.imageButton7.setOnClickListener {
            ChangeColor(binding.imageButton7, "7")
        }
        binding.imageButton8.setOnClickListener {
            ChangeColor(binding.imageButton8, "8")
        }

        binding.buttonCekHasil.setOnClickListener {
            pilihanUser = binding.imageButton2.getTag().toString() + binding.imageButton5.getTag().toString() +
                    binding.imageButton7.getTag().toString() + binding.imageButton8.getTag().toString()

            if (pilihanUser == GlobalData.jawabanSoal){
                ShowDialogBenar()
                //Toast.makeText(this, "KAMU BENAR", Toast.LENGTH_SHORT).show()
            } else{
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