package operadora

import dominio.cartao.Cartao
import java.math.BigDecimal

class Rede : Operadora() {
    override val valorMaximoPermitido: BigDecimal
        get() = 200.0.toBigDecimal()

    override fun validaCartao(cartao: Cartao, senha: Int): Boolean {
        return cartao.numero.startsWith("321")
    }
}