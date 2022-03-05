fun main () {

/* val num = arrayOf(5, 10, 15, 20, 25)
   for (i in num) {
       println(i)*/
/*val num = mutableListOf(5,10,15,20,25)
num.remove(5)
for (i in num){
    print(" $i ")

}*/
/* ****dica fazer rodando em lopping infinito e ter uma opção d para
        ou digitar qualquer coisa diferente sair do looping.***********

Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
 */
    val listmak = mutableListOf<String>()
    listmak.add("Base")
    listmak.add("Pó")
    listmak.add("Demaquilante")
    listmak.add("Blush")
    println(listmak)
    print("Adicione um nome na lista: ")
    val nomeUsu = readLine()!!
    listmak.add(nomeUsu)
    print(listmak)

    while (true) {
        if (nomeUsu.isEmpty()) {
            break
        }   else if (nomeUsu == "não") {
            break
        } else {
            listmak.add(nomeUsu)

            print("\nRemova algum nome que você adicionou dentro da lista: ")
            val nomeUsu = readLine()!!
            if (listmak.contains(nomeUsu)) {
                listmak.remove(nomeUsu)
                println("Usuário $nomeUsu removido com sucesso!")
                print(listmak)
                break
            }  else {
                println("O nome $nomeUsu não existe na lista")

            }

        }
    }
}