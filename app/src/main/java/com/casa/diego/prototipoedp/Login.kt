package com.casa.diego.prototipoedp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Login : AppCompatActivity() {

    var name = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun login(view: View){
        name = (findViewById(R.id.editText) as EditText).text.toString()
        val pass = (findViewById(R.id.editText2) as EditText).text.toString()
        if(name.trim() == "" || pass.trim() == ""){
            (findViewById(R.id.textView4) as TextView).text = "Error, debe ingresar usario y contraseña"
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
