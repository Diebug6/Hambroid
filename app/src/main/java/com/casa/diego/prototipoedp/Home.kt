package com.casa.diego.prototipoedp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.casa.diego.prototipoedp.Constants.Companion.user

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        sayHello()
    }
    fun sayHello(){
        val name = Constants.user
        var txtView = findViewById(R.id.textView2) as TextView
        txtView.text = getString(R.string.home_hello, name)
    }
    fun pedidos(view: View){
        var intent = Intent(this, Pedidos::class.java)
        startActivity(intent)
    }
    fun contacto(view: View){
        var intent = Intent(this, Contacto::class.java)
        startActivity(intent)
    }
    fun ordenar(view: View){
        var intent = Intent(this, Ordenar::class.java)
        startActivity(intent)
    }
}
