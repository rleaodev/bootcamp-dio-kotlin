package dominio.pedido

import dominio.cartao.Cartao
import dominio.contratos.Impressora
import operadora.Operadora

class Pagamento (
    private val operadora: Operadora,
    private val impressora: Impressora) {

    fun fechaPedido(pedido: Pedido, cartao: Cartao, senha: Int) {
        if (operadora.autoriza(cartao, senha, pedido.valorTotal())) {
            impressora.imprime(pedido)
        } else {
            println("Compra não autorizada")
        }
    }
}