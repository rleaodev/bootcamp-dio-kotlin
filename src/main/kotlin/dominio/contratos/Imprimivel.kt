package dominio.contratos

interface Imprimivel {
    fun obtemCabecalho(): String
    fun obtemCorpo(): String
    fun obtemRodape(): String
}