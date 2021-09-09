package dominio.cartao

data class Cartao(
    val nomeTitular: String,
    val numero: String,
    val bandeira: Bandeira
) {
}