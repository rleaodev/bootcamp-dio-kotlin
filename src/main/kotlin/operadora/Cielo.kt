package operadora

import dominio.cartao.Cartao
import java.math.BigDecimal

class Cielo : Operadora() {
    override val valorMaximoPermitido: BigDecimal
        get() = 1000.0.toBigDecimal()

    override fun validaCartao(cartao: Cartao, senha: Int): Boolean {
        return cartao.numero.startsWith("123") && senha == 1234
    }
}