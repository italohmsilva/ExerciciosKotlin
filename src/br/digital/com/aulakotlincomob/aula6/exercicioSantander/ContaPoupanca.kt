package aula6

class ContaPoupanca(saldo: Double, cliente: Cliente, private var txJuros: Double) : Conta(saldo, cliente) {

    override fun sacar(valor: Double): String {
        if (valor > saldo) {
            return "Saldo insuficiente ${consultarSaldo()}"
        }

        saldo -= valor
        return "Saque realizado com sucesso"
    }

    fun recolherJuros(): Double {
        return saldo * txJuros
    }
}
