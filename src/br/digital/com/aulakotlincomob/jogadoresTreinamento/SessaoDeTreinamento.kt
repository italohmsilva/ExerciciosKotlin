package br.digital.com.aulakotlincomob.jogadoresTreinamento

class SessaoDeTreinamento(jogadorDeFutebol: JogadorDeFutebol) {
    var experienciainicial = jogadorDeFutebol.experiencia
    fun treinarA(jogadorDeFutebol: JogadorDeFutebol) {
        jogadorDeFutebol.correr()
        jogadorDeFutebol.fazerGol()
        jogadorDeFutebol.correr()
        jogadorDeFutebol.experiencia++
        println("O jogador ${jogadorDeFutebol.nome} iniciou com ${experienciainicial} pontos de experiência e agora possui ${jogadorDeFutebol.experiencia} pontos de experieência")
    }
}