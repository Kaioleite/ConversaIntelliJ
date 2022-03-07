package encap
 class Cliente (var nome:String) {

    var end = ""
    var telefone = ""
    private val listaDeCompras = mutableListOf<String>()

    constructor(
        nome:String,
        end:String,
    ):this(nome)
    {
        this.end = end

    }
    constructor(
        nome:String,
        end:String,
        telefone:String
             ):this(nome, end)
    {
         this.telefone = telefone
                }
     init{
         if(nome.isEmpty())
             throw Exception("A classe cliente não foiinstanciada corretamente.")
     }
    fun addProd(produto:String){

        if(produto.isEmpty()){
            println("Produto Não exitente!!!!!")
        }else{
          listaDeCompras.add(produto)
            println("O item $produto foi Adicionado com Sucesso!!")
        }
    }

    fun removeP(produto: String){
        if(produto.isEmpty()){
            println("Produto inválido")

        }else if(listaDeCompras.contains(produto)){
            listaDeCompras.remove(produto)
            println("O Item $produto removido com sucesso")

        }else{
            println("Esse Produto não existe na lista")
        }
    }
    fun ListaProduto(){
       println(" \n *** Compras do Cliente $nome *** \n")
        listaDeCompras.forEach{
            print("\n $it")
        }

        }

      override fun toString(): String {
       return "Nome do Cleinte - $nome" +
            "\nEndereço  - $end" +
            "\ntelefone $telefone " +
            "\nLista  $listaDeCompras "
}
}