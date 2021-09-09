package impressao

import dominio.contratos.Impressora
import dominio.contratos.Imprimivel

class Epson : Impressora {
    override fun imprime(imprimivel: Imprimivel) {
        println(imprimivel.obtemCabecalho())
        println(imprimivel.obtemCorpo())
        println(imprimivel.obtemRodape())
    }
}