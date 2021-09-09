package dominio

import java.math.BigDecimal

class Produto (val nome: String, val preco: BigDecimal) {
    override fun toString(): String {
        return nome
    }
}