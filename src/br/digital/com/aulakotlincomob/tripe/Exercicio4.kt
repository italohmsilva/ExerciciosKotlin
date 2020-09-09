package br.digital.com.aulakotlincomob.tripe

import kotlin.reflect.typeOf

fun main(){
    val tripe = Tripe( true,50, 150, 100)
    tripe.definirAltura(110)
    println(" A nova altura definida foi ${tripe.alturaAtual}")
    tripe.dobrar()
    println(" o pé esta dobrado? Resp: ${tripe.dobrado}")
    tripe.desdobrar()
    println(" o pé esta dobrado? Resp: ${tripe.dobrado}")
    tripe.guardar()
    println(" O Tripe esta pronto para guardar? Resp: ${tripe.prontoParaGuardar()}")
    tripe.usar()
    println(" O Tripe esta pronto para usar? Resp: ${tripe.prontoParaUsar()}")


}