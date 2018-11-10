package com.casa.diego.prototipoedp

import java.lang.StringBuilder

class Pedido(comida: ArrayList<String>, fecha: ArrayList<String>, local: ArrayList<String>, total: ArrayList<String>) {
    var fecha = fecha
    var comida = comida
    var local = local
    var total = total

    override fun toString(): String {
        val sb = StringBuilder()
        var x = 0
        comida.forEach {
            sb.append(fecha[x])
            sb.append(" | ")
            sb.append(local[x])
            sb.append(" | ")
            sb.append(comida[x])
            sb.append(" | $")
            sb.append(total[x])
            sb.append(" \n")
            x++
        }
        return sb.toString()
    }
}