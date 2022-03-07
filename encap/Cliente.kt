package encap
 class Cliente (var nome:String) {

    var end = ""
    var telefone = ""
    private val listaDeCompras = mutableListOf<String>()
    var produto = ""


    constructor(
        nome:String,
        end:String,
    telefone:String
    ):this(nome)
    {
        this.end = end
        this.telefone = telefone
    }
    constructor(
        nome:String,
        end:String,
        telefone:String,
        produto: String
             ):this(nome, end, telefone)
    {
                this.produto = produto
                }


    fun CadItem(produto: String){

        if(produto.isEmpty()){
            println("Produto Não exitente!!!!!")
        }else{
          listaDeCompras.add(produto)
        }
    }

    fun removeP(produto: String){
        if(produto.isEmpty()){
            println("Produto inválido")
        }else if(produto.contains(produto)){
            listaDeCompras.add(produto)
            println("Produto removido com sucesso")
        }else{
            println("Esse Produto não existe na lista")
        }
    }
    fun ListProd(produto: String) {
        produto.forEach {
            println(it)

        }
    }

override fun toString(): String {
    return "Nome do Cleinte - $nome" +
            "\nEndereço  - $end" +
            "\ntelefone $telefone " +
            "\nLista  $listaDeCompras "+
            "\nProduto - $produto "
}
}