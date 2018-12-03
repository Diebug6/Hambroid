package com.casa.diego.prototipoedp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.casa.diego.prototipoedp.Constants.Companion.orders

class Pedidos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadOrder()
        setContentView(R.layout.activity_pedidos)
        loadContent()
    }
    fun loadOrder(){
        orders.clear()
        orders.add(Pedido("Italiano","25/03/2018","Juan Maestro","$3900"))
        orders.add(Pedido("Papas Fritas","25/03/2018","McDonals","$2500"))
        orders.add(Pedido("Pizza mediana","25/03/2018","Papa Johns","$7000"))
    }
    fun loadContent(){
        var txtView = findViewById(R.id.textView13) as TextView
        txtView.text = orders.toString().replace("[","").replace(",","").replace("]","").replace(" ","")
    }
}
