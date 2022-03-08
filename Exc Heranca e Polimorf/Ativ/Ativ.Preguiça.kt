package `Exc Heranca e Polimorf`.Ativ
import `Exc Heranca e Polimorf`.Preguiça

fun main (){

   var valor = 0.0
   var nome = ""
   var idade = 0
   var espreguicando  = ""
   val preguica = Preguiça(nome, idade)

  print("Digite o nome Da sua preguica : ")
    nome = readLine()!!
  print("Digite a Idade do seu preguica : ")
    idade = readLine()!!.toInt()
  print("digite um Número para o preguica subir:  ")
    valor = readLine()!!.toDouble()
  print("Digite uma letra para o preguica espreguiçar :")
     espreguicando = readLine()!!

     print(" Nome ->  $nome")
     print("\n Idade -> $idade\n")

       preguica.SOM(espreguicando)
        preguica.Subir(valor)
}