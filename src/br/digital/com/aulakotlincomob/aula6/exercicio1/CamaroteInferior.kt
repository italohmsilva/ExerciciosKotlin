package br.digital.com.aulakotlincomob.aula6.exercicio1

class CamaroteInferior(): Vip() {
    val localizacao = "Ala direita"
    fun imprimaLocal(){
        println("O local do seu ingresso é $localizacao e seu valor é de ${super.valorVip()}")
    }
}