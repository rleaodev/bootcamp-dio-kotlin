package impressao

import dominio.contratos.Impressora
import dominio.contratos.Imprimivel

class Hp : Impressora {
    override fun imprime(imprimivel: Imprimivel) {
        println("********************** HP ******************")
        println(imprimivel.obtemCabecalho())
        println(imprimivel.obtemCorpo())
        println(imprimivel.obtemRodape())
    }
}