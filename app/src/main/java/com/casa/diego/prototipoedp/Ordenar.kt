package com.casa.diego.prototipoedp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class Ordenar : AppCompatActivity() {
    var orden: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ordenar)
        loadLocales()
    }
    fun loadLocales(){
        val spinner = findViewById<View>(R.id.spinner3) as Spinner
        val adapter = ArrayAdapter.createFromResource(this, R.array.ordenar_locales, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
    }

    fun loadFood(view: View){
        val spinner = findViewById<View>(R.id.spinner3) as Spinner
        val local = spinner.getSelectedItem().toString()
        if(local == "McDonals"){
            loadMcdonald()
        }else if(local == "Papa Johns"){
            loadPapa()
        }else if(local == "Juan Maestro"){
            loadMaestro()
        }
    }
    fun loadMaestro(){
        val spinner = findViewById<View>(R.id.spinner4) as Spinner
        val adapter = ArrayAdapter.createFromResource(this, R.array.ordenar_comida_juanmaestro, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
    }
    fun loadMcdonald(){
        val spinner = findViewById<View>(R.id.spinner4) as Spinner
        val adapter = ArrayAdapter.createFromResource(this, R.array.ordenar_comida_mcdonals, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
    }
    fun loadPapa(){
        val spinner = findViewById<View>(R.id.spinner4) as Spinner
        val adapter = ArrayAdapter.createFromResource(this, R.array.ordenar_comida_papajohns, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
    }
    fun addFood(view: View){
        val spinner = (findViewById<View>(R.id.spinner4) as Spinner).selectedItem.toString()
        var txt = (findViewById(R.id.textView6) as TextView).text.toString()
        txt += spinner +"\n"
        orden.add(spinner)
        (findViewById(R.id.textView6) as TextView).text = txt
    }
    fun confirmar(view: View){
        val intent = Intent(this, Confirmar::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
        intent.putStringArrayListExtra(Confirmar.orden.toString(), orden)
        startActivity(intent)
    }

}
