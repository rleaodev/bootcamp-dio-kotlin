package dominio.pedido

import dominio.Produto
import java.math.BigDecimal

data class ItemPedido (val produto: Produto, var quantidade: Int = 0) {
    fun valorTotal(): BigDecimal = produto.preco * quantidade.toBigDecimal()
}