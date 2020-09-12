package br.com.digitalhouse.`interface`

class Impressora {

    var listaImprimivel = mutableListOf<Imprimivel>()

    fun adicionar(vararg imprimiveis: Imprimivel) = listaImprimivel.addAll(imprimiveis)

    fun imprimirTudo(){
        for(tipo in listaImprimivel){
            println(tipo.nome+tipo.tipoDocumento)
        }
    }
}