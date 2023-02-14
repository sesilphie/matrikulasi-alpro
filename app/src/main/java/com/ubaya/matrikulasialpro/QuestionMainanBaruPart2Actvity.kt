package com.ubaya.matrikulasialpro

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Window
import android.widget.*
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.DefaultPlayerUiController
import com.ubaya.matrikulasialpro.databinding.ActivityQuestionLabirinBinding
import com.ubaya.matrikulasialpro.databinding.ActivityQuestionMainanBaruPart2ActvityBinding
import org.json.JSONObject

class QuestionMainanBaruPart2Actvity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionMainanBaruPart2ActvityBinding
    companion object{
        val EXTRA_NAMASOAL = "EXTRA_NAMASOAL"
    }
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
            if(GlobalData.levelTertinggiUser == 0){
                if (GlobalData.noSoalTertinggiUser == 5){
                    GlobalData.noSoalTertinggiUser = 1
                    GlobalData.levelTertinggiUser = 1
                }
            }
            val queue = Volley.newRequestQueue(this)
            val url = "http://192.168.1.176/tugas_akhir/updateLevelSoalUser_matrikulasialpro.php"
            val stringRequest = object : StringRequest(
                Request.Method.POST, url,
                Response.Listener {
                    Log.d("checkparams", it)
                    val obj = JSONObject(it)
                    if (obj.getString("result") == "OK"){
                        Toast.makeText(this, "UPDATE SOAL LEVEL BERHASIL", Toast.LENGTH_SHORT).show()
                        dialog.dismiss()
                        val intent = Intent(this, MainActivity::class.java)
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
        val intent = Intent(this, IntroductionDetailActivity::class.java)
        startActivity(intent)
        finish()
    }
}