package br.digital.com.aulakotlincomob.atletasProva

fun main() {
    val atleta1 = Atleta("Italo", 12, 22)
    val atleta2 = Atleta("Yago", 10, 10)

    val prova1 = Prova(11, 20)
    val prova2 = Prova(9, 9)
    val prova3 = Prova(25, 25)

    println(prova1.podeRealizar(atleta1))
    println(prova1.podeRealizar(atleta2))

    println(prova2.podeRealizar(atleta1))
    println(prova2.podeRealizar(atleta2))

    println(prova3.podeRealizar(atleta1))
    println(prova3.podeRealizar(atleta2))
}
