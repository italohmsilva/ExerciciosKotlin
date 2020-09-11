package aula6

import java.util.*

abstract class Conta(var saldo: Double, val cliente: Cliente) {

    abstract fun sacar(valor: Double): String

    fun depositar(valor: Double) {
        saldo += valor
    }

    final fun consultarSaldo(): Double {
        return saldo
    }
}

