package com.casa.diego.prototipoedp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Admin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)
    }
    fun notImplemented(view: View){
        val text = "Metodo no implementado en el prototipo"
        val length = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, text, length)
        toast.show()
    }
}
