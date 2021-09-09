import dominio.Cliente
import dominio.NotaFiscal
import dominio.pedido.ItemPedido
import dominio.pedido.Pedido
import dominio.ProdutoFactory
import dominio.cartao.Bandeira
import dominio.cartao.Cartao
import dominio.contratos.Imprimivel
import dominio.pedido.Pagamento
import impressao.Epson
import impressao.Hp
import operadora.Cielo
import operadora.Rede

fun main(args: Array<String>) {
    val arroz = ProdutoFactory.create("Arroz", preco = 25.0)
    val leite = ProdutoFactory.create("Leite", "4.0")
    val farinha = ProdutoFactory.create("Farinha", 4)
    val feijao = ProdutoFactory.create(nome = "Feijão", preco = 7.0)

    var joao = Cliente(nome = "João", "111.222.333-45")
    val pedido = Pedido(joao)

    val itemPedido_arroz = ItemPedido(arroz, 1)
    val itemPedido_Feijao = ItemPedido(feijao, 2)

    pedido.adicionaProduto(itemPedido_arroz)
    pedido.adicionaProduto(itemPedido_Feijao)

    val cartao = Cartao(
        nomeTitular = "João da Silva",
        numero = "12312345678910",
        bandeira = Bandeira.MASTERCARD
    )

    val operadora = Cielo()
    val impressora = Epson()

    val pagamento = Pagamento(operadora, impressora)

    pagamento.fechaPedido(pedido, cartao, 1234)
    impressora.imprime(NotaFiscal(pedido))







}