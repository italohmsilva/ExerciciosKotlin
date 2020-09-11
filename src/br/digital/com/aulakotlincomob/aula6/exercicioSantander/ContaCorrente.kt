package aula6

class ContaCorrente(saldo: Double, cliente: Cliente, var limiteChequeEspecial: Double) : Conta(saldo, cliente) {

    override fun sacar(valor: Double): String {
        if (valor > (saldo + limiteChequeEspecial)) {
            return "Saldo insuficiente ${consultarSaldo()}"
        } else if (valor > saldo && valor <= (saldo + limiteChequeEspecial)) {
            saldo = 0.0
            limiteChequeEspecial = limiteChequeEspecial - (valor - saldo)
            return "Utilizado limite ${consultarSaldo()}"
        } else {
            saldo -= valor
            return "Saque realizado com sucesso"
        }
    }

    fun depositarCheque(cheque: Cheque) {
        saldo += cheque.valor
    }
}


