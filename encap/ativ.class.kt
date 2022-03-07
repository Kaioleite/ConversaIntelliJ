package encap
fun main() {

   var opc = 0
    print("/*** BEM-VINDO AO SUPERMERCADO AGRIÃO ******/ ")
    print(" \nDigite o seu nome: ")
    val nome = readLine()!!
    print("Digite o seu endereço:")
    val end = readLine()!!
    print("Digite o seu Telefone : ")
    val tel = readLine()!!

    try {
        val cliente = Cliente(nome, end, tel)
        while (true) {
            println("\n### -> Menu <- ###\n")
            println(" 1 - Coloque Produtos em seu carrinho :) ")
            println(" 2 - Retire Produtos do seu carrinho :( ")
            println(" 3 - De uma Espiadinha em seu  carrinho o_o ")
            println("Digite qualquer outro Número para sair !!! ")
            while (true) {
                println("\nDigite o Número de acordo com seu Desejo: ")

                try {
                    opc = readLine()!!.toInt()
                    break
                } catch (e: Exception) {
                    println("Valor Inválido :( ")
                }
            }

            when (opc) {
                1 -> {
                    print("Digite o Produto a ser adicionado:\n")
                    val produto = readLine()!!
                    cliente.addProd(produto)
                }
                2 -> {
                    print("Digite o Produto a ser removido:\n")
                    val produto = readLine()!!
                    cliente.removeP(produto)
                }
                3 ->  cliente.ListaProduto()
                else -> break
            }
        }
     } catch (e: Exception) {
        println(e.message)
    }
}
