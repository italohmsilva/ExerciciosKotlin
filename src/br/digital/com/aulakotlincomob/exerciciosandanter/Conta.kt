package br.digital.com.aulakotlincomob.exerciciosandanter

class Conta (
        var numeroDaConta: Int,
        var saldo: Double,
        var cliente: Cliente
) {
    fun deposito (valor: Double){
        saldo += valor
        println("Deposito")
        println("Saldo atual: $saldo")

    }

    fun saque (valor: Double){
        if (valor> saldo) {
            println("Saldo Insuficiente")
        } else {
            saldo -= valor
            println("Saque")
            println("Saldo atual: $saldo")
        }

    }
}