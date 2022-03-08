package `Exc Heranca e Polimorf`.Ativ

import `Exc Heranca e Polimorf`.Cavalo

fun main () {


    var valor = 0.0
    var nome = ""
    var idade = 0
    var Relinchando = ""
    val Horse = Cavalo(nome, idade)

    print("Digite o nome Do seu cavalo : ")
    nome = readLine()!!
    print("Digite a Idade do seu cavalo : ")
    idade = readLine()!!.toInt()
    print("digite um Número para o cavalo correr :  ")
    valor = readLine()!!.toDouble()
    print("Digite uma letra para o cavalo Relinchar:")
    Relinchando = readLine()!!

    print(" Nome ->  $nome")
    print("\n Idade -> $idade\n")

    Horse.SOM(Relinchando)
    Horse.correr(valor)
}