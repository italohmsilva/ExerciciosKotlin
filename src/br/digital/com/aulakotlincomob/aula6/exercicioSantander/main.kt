package aula6

fun main() {
    val cliente1 = Cliente(1, "Freitas", "12344", "443434334")
    val cc = ContaCorrente(1000.00, cliente1, 200.00)

    println("===========Conta Corrente===================")

    println("Saldo Inicial: ->   ${cc.saldo}")
    cc.depositar(100.00)
    println("Saldo apos deposito de 100: ->   ${cc.saldo}")

    println(cc.sacar(200.00))
    println("Saldo apos sacar 200:  ->  ${cc.saldo}")

    println("Tentativa de sacar 1100.10")
    println(cc.sacar(1100.10))
    println("Saldo apos tentativa de sacar sacar 1100.10: ->   ${cc.saldo}")

    println("Tentativa de sacar 1100.00")
    println(cc.sacar(1100.00))
    println("Saldo apos tentativa de sacar sacar 1100.00: ->  ${cc.saldo}")




    println("===========Conta Poupança===================")
    val cliente2 = Cliente(2, "Silva", "12344", "443434334")
    val cp = ContaPoupanca(1000.00, cliente2, 0.10)

    println("Saldo Inicial: ->  ${cp.saldo}")
    cp.depositar(200.00)

    println("Saldo apos depositar 200.00 : -> ${cp.saldo}")
    println("Recolhendo juros ${cp.recolherJuros()}")

    println("Saldo atual: ${cp.consultarSaldo()}")

    println("Tentativa de saque de 1201.00")
    println(cp.sacar(1201.00))
    println("Saldo apos tentativa de saque de 1201.00:  -> ${cp.consultarSaldo()}")


    println("Tentativa de saque de 1200.00")
    println(cp.sacar(1200.00))
    println("Saldo apos tentativa de saque de 1200.00:  ->  ${cp.consultarSaldo()}")
}