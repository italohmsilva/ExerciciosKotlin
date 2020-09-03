package br.digital.com.aulakotlinsemob

fun main () {
    println("Hello Word")
    println(meuNome("Italo"," Machado"))

    var lista = arrayListOf<String>();
    lista.add("primeiro item")
    println(lista[0])
}

fun meuNome(nome: String, sobrenome: String) :String{
    return nome + sobrenome
}

var lista = arrayListOf<String>();
