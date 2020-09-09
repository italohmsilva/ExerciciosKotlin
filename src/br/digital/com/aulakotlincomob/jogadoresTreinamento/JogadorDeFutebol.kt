package br.digital.com.aulakotlincomob.jogadoresTreinamento

class JogadorDeFutebol(
        var nome: String,
        var energia: Int,
        var alegria: Int,
        var gols: Int,
        var experiencia: Int
) {
    fun fazerGol() {
        energia -= 5
        alegria += 10
        gols++
        println("GOOOOOLLLLLL")
    }

    fun correr() {
        energia -= 10
        println("Cansei!!")
    }
}