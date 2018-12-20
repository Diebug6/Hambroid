package com.casa.diego.prototipoedp

import android.Manifest
import android.content.Context
import android.content.Intent
import android.location.Criteria
import android.location.LocationManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.view.View
import android.widget.TextView

import com.google.android.gms.location.places.ui.PlacePicker

import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds

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
        var intent = Intent(this, MapaLocales::class.java)
        startActivity(intent)
    }
}
