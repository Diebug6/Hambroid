package com.casa.diego.prototipoedp

import java.lang.StringBuilder

class Pedido(comida: String, fecha: String, local: String, total:String) {

    var fecha = fecha
    var comida = comida
    var local = local
    var total = total

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(fecha)
        sb.append("|")
        sb.append(comida)
        sb.append("|")
        sb.append(local)
        sb.append("|")
        sb.append(total)
        sb.append("\n")
        return sb.toString()
    }
}