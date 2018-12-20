package com.casa.diego.prototipoedp

import android.content.Context
import android.content.Intent
import android.location.Criteria
import android.location.LocationManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import java.util.*
import java.util.concurrent.TimeUnit


class MapaLocales : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mapa_locales)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        val location = this.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        val crit = Criteria()
        crit.accuracy = Criteria.ACCURACY_FINE
        crit.powerRequirement = Criteria.POWER_LOW
        val providers = location.allProviders
        val provider = providers[1]
        try {
            val miCiudad = location.getLastKnownLocation(provider)
            val coor = LatLng(miCiudad.latitude, miCiudad.longitude)
            mMap.addMarker(MarkerOptions().position(coor).title("My place"))
            mMap.moveCamera(CameraUpdateFactory.newLatLng(coor))
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(coor, 18.4f))
        } catch (e: SecurityException) {
            print("ERROR->" + e)
            val coor = LatLng(0.0, 0.0)
            mMap.addMarker(MarkerOptions().position(coor).title("My place"))
            mMap.moveCamera(CameraUpdateFactory.newLatLng(coor))
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(coor, 18.4f))
        }
        val t = Timer()
        var intent = Intent(this, Ordenar::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
        t.schedule(object : TimerTask() { override fun run() { startActivity(intent) } },7000)
    }

}
