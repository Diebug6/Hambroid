package com.casa.diego.prototipoedp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Pedidos : AppCompatActivity() {
    var comida: ArrayList<String> = ArrayList()
    var total: ArrayList<String> = ArrayList()
    var fecha: ArrayList<String> = ArrayList()
    var local: ArrayList<String> = ArrayList()
    var pedido: Pedido = Pedido(comida, fecha, local, total)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadData()
        setContentView(R.layout.activity_pedidos)
        loadContent()
    }
    fun loadData(){
        comida.add("Papas fritas")
        comida.add("Pizza mediana")
        total.add("2000")
        total.add("7000")
        local.add("McDonals")
        local.add("Papa John's")
        fecha.add("25/04/2018")
        fecha.add("20/05/2018")
        pedido = Pedido(comida, fecha, local, total)
    }
    fun loadContent(){
        println(pedido.toString())
        var txtView = findViewById(R.id.textView13) as TextView
        txtView.text = pedido.toString()
    }
}
