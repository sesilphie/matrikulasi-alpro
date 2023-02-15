package com.ubaya.matrikulasialpro

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.ubaya.matrikulasialpro.databinding.ActivityLoginBinding
import org.json.JSONObject

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.buttonLogin.setOnClickListener {
            val username = binding.textInputUsername.text.toString()
            val password = binding.textInputPassword.text.toString()

            if (username == ""){
                Toast.makeText(this, "Harap menginputkan username Anda", Toast.LENGTH_SHORT).show()
            } else if (password == ""){
                Toast.makeText(this, "Harap menginputkan password Anda", Toast.LENGTH_SHORT).show()
            } else{
                val queue = Volley.newRequestQueue(this)
                val url = "http://192.168.1.176/tugas_akhir/login_matrikulasiAlpro.php"
                val stringRequest = object : StringRequest(
                    Request.Method.POST, url,
                    Response.Listener {
                        Log.d("checkparams", it)
                        val obj = JSONObject(it)
                        if (obj.getString("result") == "OK"){
                            val data = obj.getJSONObject("data")
                            with(data){
                                GlobalData.user = User(getString("username"), getString("name"), getString("email"),
                                    getString("password"), getInt("levels_tertinggi"), getInt("no_soal_tertinggi"))
                            }
                            Toast.makeText(this, "LOGIN BERHASIL", Toast.LENGTH_SHORT).show()

                            GlobalData.levelTertinggiUser = GlobalData.user.levels_tertinggi
                            GlobalData.noSoalTertinggiUser = GlobalData.user.no_soal_tertinggi
                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                            finish()
                        } else {
                            Toast.makeText(this, "LOGIN GAGAL. Username atau Password Anda Salah", Toast.LENGTH_SHORT).show()
                        }
                    },
                    Response.ErrorListener {
                        Log.d("paramserror", it.message.toString())
                    }
                ){
                    override fun getParams(): MutableMap<String, String> {
                        return hashMapOf("username" to username, "password" to password)
                    }
                }
                queue.add(stringRequest)
            }
        }

        binding.buttonRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        finish()
    }

}