package br.digital.com.aulakotlincomob.aula6.exercicio1

class CamaroteSuperior() : Vip() {
    val localizacao = "Ala esquerda"
    val valorCamaroteSuperior = 25.0
    fun valor(): Double {
        return valorCamaroteSuperior + super.valorVip()
    }
}