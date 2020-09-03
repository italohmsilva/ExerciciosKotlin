package br.digital.com.aulakotlinsemob

fun main() {
    var a = compararNumero(13, 13, 13)
    println("questão 1:  numero mair é $a")
    println("questão 2")
    println(comparatexto("um", "uma"))
    println("questão 3")
    println(numpar(8))
    println("questão 4")
    cempositivos()
    println("questão 5")
    println(inteiros(10, 4, 2, 5))
    println("questão 6")
    pares()
}

fun compararNumero(num1: Int, num2: Int, num3: Int): Int {
    if (num1 > num2 && num1 > num2) {
        return num1
    } else if (num2 > num1 && num2 > num3) {
        return num2
    }
    return num3

}

fun comparatexto(texto1: String, texto2: String): Boolean {
    return texto1 != texto2
}

fun numpar(num: Int): Boolean {
    return num % 2 == 0
}

fun cempositivos() {
    for (x in 0..200 step 2)
        println("$x, ")
}

fun inteiros(numA: Int, numB: Int, numC: Int, numD: Int): Boolean {
    return (numA > numC && numA > numD) || (numB > numC && numB > numD)
}

fun pares() {
    for (num in 1..100) {
        if (num % 2 == 0) {
            print("$num, ")
        }
    }
}