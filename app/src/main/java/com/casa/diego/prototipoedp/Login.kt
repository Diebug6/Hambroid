package com.casa.diego.prototipoedp

import android.Manifest
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Login : AppCompatActivity() {
    private val REQUEST_PERMISSION = 1
    var name = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        permisos()
        setContentView(R.layout.activity_login)
    }
    fun login(view: View){
        name = (findViewById(R.id.editText) as EditText).text.toString()
        val pass = (findViewById(R.id.editText2) as EditText).text.toString()
        if(name.trim() == "" || pass.trim() == ""){
            (findViewById(R.id.textView4) as TextView).text = "Error, debe ingresar usario y contraseña"
        }else {
            if(name.equals("local")){
                val intent = Intent(this, HomeLocal::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                Constants.user = name
                startActivity(intent)
            }else {
                val intent = Intent(this, Home::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                Constants.user = name
                startActivity(intent)
            }
        }
    }
    fun permisos() {
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION), REQUEST_PERMISSION)
    }
}
