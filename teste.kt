package br.com.digitalhouse.`interface`

fun main() {
    val documento = Documento("Documento", ".docx")
    val contrato = Contrato("contrato", ".pdf")
    val foto = Foto("foto", ".png")

    documento.imprimir()
    contrato.imprimir()
    foto.imprimir()

    //var args
    val impressora = Impressora()
    impressora.adicionar(documento, contrato, foto)

    impressora.imprimirTudo()
}