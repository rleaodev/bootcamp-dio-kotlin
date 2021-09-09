package operadora

import dominio.cartao.Cartao
import java.math.BigDecimal

abstract class Operadora {
    protected abstract val valorMaximoPermitido: BigDecimal

    fun autoriza(cartao: Cartao, senha: Int, valor: BigDecimal): Boolean {
        if (validaCartao(cartao, senha) && valor < valorMaximoPermitido) {
            return true
        }
        return false
    }

    abstract fun validaCartao(cartao: Cartao, senha: Int): Boolean
}

