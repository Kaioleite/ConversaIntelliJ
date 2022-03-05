fun main () {
    // 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares.(For)
    /*
    var numP = 0
    var numI = 0
    var Par = 0
    val impar = 0
    for (i in 1..10) {
        print("Digite um Número : ")
        val i = readLine()!!.toInt()
        if (i % 2 == 0) {
            Par++
            numP = Par
        } else {
            numI++
            numI += impar
        }
    }
    print("$numP números pares . $numI números ímpares ." )
    }
   */

/* 3 - Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos
  de 21 anos. Total de pessoas com mais de 50 anos. O programa termina
   quando idade for =-99. (WHILE)
     */
   /*
    var menor = 0
    var maior = 0
    var idade = 0
    while (idade != -99) {
        print("Digite a sua Idade: ")
        idade = readLine()!!.toInt()
        if (idade in 0..21) {
            menor++
        } else if (idade >= 50) {
            maior++

        }
    }
     println("As pessoas menores que 21 são: $menor e maiores que 50 são : $maior")
    */

    /*
    5 - Crie um programa que leia um número do teclado até que encontre
     um número igual a zero. No final, mostre a soma dos números digitados.(

     var num = 0
     var soma = 0
    do{ print("Digite um número:")
        num = readLine()!!.toInt()
        soma += num

     }while ( num !=0 )
      println("A de soma todos números digitados é : $soma")
*/

}