package br.digital.com.aulakotlincomob.tripe

import br.digital.com.aulakotlinsemob.inteiros

class Tripe(
        var dobrado: Boolean,
        // as unidades das alturas devem estar em centimetros
        var alturaMinima: Int,
        var alturaMaxima: Int,
        var alturaAtual: Int
) {
    fun definirAltura( novaAltura: Int) {
        alturaAtual = novaAltura
    }

    fun dobrar() {
        dobrado = true
    }

    fun desdobrar() {
        dobrado = false
    }

    fun guardar() {
        alturaAtual = alturaMinima
        dobrar()
    }

    fun prontoParaGuardar(): Boolean {
        return dobrado && alturaAtual == alturaMinima
    }

    fun usar() {
        desdobrar()
        alturaAtual = (alturaMaxima / 2)
    }

    fun prontoParaUsar(): Boolean {
        return !dobrado && alturaAtual >= (alturaMaxima / 2)
    }
}