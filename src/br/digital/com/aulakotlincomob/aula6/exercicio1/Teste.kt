package br.digital.com.aulakotlincomob.aula6.exercicio1


fun main() {

    val camaroteInferior = CamaroteInferior()
    val camaroteSuperior = CamaroteSuperior()
    val normal = Normal()

    println(
            "Digite o numero do tipo de ingresso que deseja comprar:" +
                    "1 para comprar ingresso Normal e 2 para ingresso VIP"
    )
    var escolha: Int = readLine()!!.toInt()
    if (escolha == 1) {
        println("Ingresso Normal selecionado no valor de: ${normal.valor}")
    } else {
        println("Ingresso Vip selecionado")
        println(
                "Agora selecione qual camarote você gostaria:" +
                        "Digite:" +
                        "1 - Para camarote Superior" +
                        "2 - Para camarote Inferior"
        )
        escolha = readLine()!!.toInt()
        when (escolha) {
            1 -> println(" O valor do camarote Superior é ${camaroteSuperior.valor()}")
            2 -> camaroteInferior.imprimaLocal()
        }
    }
}



