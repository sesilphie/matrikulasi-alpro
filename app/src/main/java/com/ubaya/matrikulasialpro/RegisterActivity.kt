package com.ubaya.matrikulasialpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.ubaya.matrikulasialpro.databinding.ActivityLoginBinding
import com.ubaya.matrikulasialpro.databinding.ActivityRegisterBinding
import org.json.JSONObject

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSubmitRegister.setOnClickListener {
            val username = binding.textInputUsernameRegis.text.toString()
            val nama = binding.textInputNamaRegis.text.toString()
            val email = binding.textInputEmailRegis.text.toString()
            val password = binding.textInputPasswordRegis.text.toString()
            val confirmPassword = binding.textInputConfirmPassRegis.text.toString()

            if (username == ""){
                Toast.makeText(this, "Harap menginputkan username Anda", Toast.LENGTH_SHORT).show()
            } else if (nama == ""){
                Toast.makeText(this, "Harap menginputkan nama Anda", Toast.LENGTH_SHORT).show()
            } else if (email == ""){
                Toast.makeText(this, "Harap menginputkan email Anda", Toast.LENGTH_SHORT).show()
            } else if (password == ""){
                Toast.makeText(this, "Harap menginputkan password Anda", Toast.LENGTH_SHORT).show()
            } else if (confirmPassword == ""){
                Toast.makeText(this, "Harap menginputkan Confirm password Anda", Toast.LENGTH_SHORT).show()
            } else{
                if (password == confirmPassword){
                    val queue = Volley.newRequestQueue(this)
                    val url = "http://192.168.1.176/tugas_akhir/register_matrikulasiAlpro.php"
                    val stringRequest = object : StringRequest(
                        Request.Method.POST, url,
                        Response.Listener {
                            Log.d("checkregister", it)
                            val obj = JSONObject(it)
                            if (obj.getString("result") == "OK"){
                                val builder = android.app.AlertDialog.Builder(this)
                                with (builder)
                                {
                                    setTitle("Daftar Akun")
                                    setMessage("Selamat, Anda berhasil membuat akun baru!")
                                    setPositiveButton("OK"){dialogInterface, i ->
                                        finish()
                                    }
                                    setCancelable(false)
                                    create().show()
                                }

                            }else if (obj.getString("result") == "ERROR"){
                                Toast.makeText(this, "Register User Gagal. " + obj.getString("message"), Toast.LENGTH_LONG).show()
                            }
                        },
                        Response.ErrorListener {
                            Log.d("paramserror", it.message.toString())
                        }
                    ){
                        override fun getParams(): MutableMap<String, String> {
                            return hashMapOf("username" to username, "name" to nama,
                                "email" to email, "password" to password)
                        }
                    }
                    queue.add(stringRequest)
                } else{
                    Toast.makeText(this, "Password dan Confirm Password Anda tidak cocok. Pastikan password dan Confirm Password Anda sama", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}