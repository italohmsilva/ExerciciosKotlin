package br.digital.com.aulakotlincomob.aula6.exercicio1

open class Ingresso() {
    open val valor: Double = 100.0
    open fun imprimeValor() {
        println(" O Valor do ingresso é $valor")
    }
}