package br.digital.com.aulakotlincomob.aula6.exercicio1

open class Vip() : Ingresso() {
    val adicional: Double = 50.0
    fun valorVip(): Double {
        return super.valor + adicional
    }
}