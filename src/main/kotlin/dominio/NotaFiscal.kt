package dominio

import dominio.contratos.Imprimivel
import dominio.pedido.Pedido

class NotaFiscal (private val pedido: Pedido) : Imprimivel {
    override fun obtemCabecalho(): String {
        return "NOTA FISCAL PAULISTA"
    }

    override fun obtemCorpo(): String {
        return pedido.obtemCorpo()
    }

    override fun obtemRodape(): String {
        return "--------------------"
    }
}