package com.casa.diego.prototipoedp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class HomeLocal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_local)
        sayHello()
    }
    fun adminLocal(view: View){
        intent = Intent(this, Admin::class.java)
        startActivity(intent)
    }
    fun sayHello(){
        val name = Constants.user
        var txtView = findViewById(R.id.textView2) as TextView
        txtView.text = getString(R.string.home_hello, name)
    }
}
