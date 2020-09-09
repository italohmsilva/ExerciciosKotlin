package br.digital.com.aulakotlincomob.veiculosUsados

import java.util.*

class Concessionaria() {
    var vendas = mutableListOf<Venda>()
    fun registrarVenda(venda: Venda) {
        vendas.add(venda)
    }
}