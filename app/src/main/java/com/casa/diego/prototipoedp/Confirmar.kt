package com.casa.diego.prototipoedp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Confirmar : AppCompatActivity() {

    companion object {
        val orden: ArrayList<String> = ArrayList()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmar)
        showOrder()
    }

    fun showOrder(){
        var orden: ArrayList<String> = intent.getStringArrayListExtra(orden.toString())
        var sb: StringBuilder = StringBuilder()
        sb.append("Su orden de: \n")
        var x = 0
        var total = 0
        orden.forEach {
            sb.append(orden[x])
            sb.append("\n")
            total += Integer.parseInt(orden[x].split("$")[1])
            x++
        }
        sb.append("Ha sido confirmada \nCon un total de: $")
        sb.append(total)
        (findViewById(R.id.textView7) as TextView).text = sb.toString()
    }
    fun regresar(view: View){
        val intent = Intent(this, Home::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
        startActivity(intent)
    }
}
