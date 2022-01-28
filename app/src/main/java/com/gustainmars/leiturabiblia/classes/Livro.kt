package com.gustainmars.leiturabiblia.classes

abstract class Livro (private val nome: String, private var capitulos: List<Capitulo>) {
    fun printLivro(): String {
        var relatorioLivro: String = ""
        for ((index, capitulo) in capitulos.withIndex()) {
            with(capitulo) {
                relatorioLivro += "Capítulo $numero de $nome tem $versiculos versículos e ${foiLido(lido)}\n"
            }
        }
        return relatorioLivro
    }
    private fun foiLido(lido: Boolean): String = if (lido) "foi lido" else "não foi lido"
}

class Livro2(nome: String, capitulos: List<Capitulo>) :
    Livro (nome, capitulos)