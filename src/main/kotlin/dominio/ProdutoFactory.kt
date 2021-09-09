package dominio

class ProdutoFactory {
    companion object {
        fun create(nome: String, preco: Double): Produto {
            return Produto(nome, preco.toBigDecimal())
        }

        fun create(nome: String, preco: String): Produto {
            return Produto(nome, preco.toBigDecimal())
        }

        fun create(nome: String, preco: Int): Produto {
            return Produto(nome, preco.toBigDecimal())
        }
    }
}