package br.com.digitalhouse.`interface`

class Documento(override var nome: String, override var tipoDocumento: String): Imprimivel {

    override fun imprimir() {
        println("Eu sou um Documento Word ${nome+tipoDocumento}")
    }
}