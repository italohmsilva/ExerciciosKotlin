package br.digital.com.aulakotlincomob.jogadoresTreinamento

fun main(){
    val jogador1 = JogadorDeFutebol("Pelé",100,50,0,5)
    val jogador2 = JogadorDeFutebol("Maradona",80,20,1,20)

    val sessao1 = SessaoDeTreinamento(jogador1)
    val sessao2 = SessaoDeTreinamento(jogador2)

    sessao1.treinarA(jogador1)
    sessao2.treinarA(jogador2)


}