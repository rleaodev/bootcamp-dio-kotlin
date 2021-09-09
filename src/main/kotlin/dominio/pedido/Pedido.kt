package dominio.pedido

import dominio.Cliente
import dominio.contratos.Imprimivel
import extensoes.formataPraReal
import java.math.BigDecimal
import java.text.NumberFormat

class Pedido (val cliente: Cliente) : Imprimivel {
    private val listaDeProdutos = mutableListOf<ItemPedido>()
    private var numeroPedido : Long = 0
    val itens
        get() = listaDeProdutos.toMutableList()

    init {
        numeroPedido = System.currentTimeMillis()
    }

    fun adicionaProduto(itemPedido: ItemPedido) {
        listaDeProdutos.add(itemPedido)
    }

    override fun obtemCabecalho(): String {
        return "Pedido Nº ${numeroPedido}"
    }

    override fun obtemCorpo(): String {
        val corpo = StringBuilder()

        listaDeProdutos.forEach { item ->
            corpo.append("${item.produto.nome}\n")
            corpo.append("${item.produto.preco.formataPraReal()} x ")
            corpo.append("${item.quantidade} = ${item.valorTotal().formataPraReal()}\n")
        }

        return corpo.toString()
    }

    override fun obtemRodape(): String {
        return "Valor total do pedido ${this.valorTotal().formataPraReal()}"
    }

    fun valorTotal(): BigDecimal = listaDeProdutos.sumOf { it.valorTotal()}

}