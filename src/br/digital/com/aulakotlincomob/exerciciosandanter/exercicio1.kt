package br.digital.com.aulakotlincomob.exerciciosandanter

fun main(){
    val pessoa = Cliente( "Italo","Machado")
    val pessoa2 = Cliente( "Ana", "Maria")

    val conta1 = Conta(1,5000.8, pessoa)
    val conta2 = Conta( 2, 8000.6, pessoa2)

    conta1.deposito(512.32)
    conta2.deposito(487.6)

    conta1.saque(4800.0)
    conta2.saque(7200.0)



}