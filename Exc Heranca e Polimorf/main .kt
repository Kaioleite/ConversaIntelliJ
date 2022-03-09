package `Exc Heranca e Polimorf`
import `Exc Heranca e Polimorf`.Cavalo
import `Exc Heranca e Polimorf`.Cachorro
import `Exc Heranca e Polimorf`.Preguica
fun main(){

val tobby = Cachorro("tobby",24)
val epona = Cavalo("epona",5)
val laura = Preguica("Laura",6)

    tobby.SOM()
    tobby.corre()
    epona.SOM()
    epona.correr()
    laura.SOM()
    laura.Subir()


}





























   /* var valor = 0.0
    var nome = ""
    var idade = 0
    var latir = ""
    val Dog = Cachorro(nome,idade)

    print("Digite o nome Do seu cãozinho : ")
       nome = readLine()!!
    print("Digite a Idade do seu cãozinho : ")
       idade = readLine()!!.toInt()
    print("Se quer que seu cão corra digite um Número:  ")
       valor = readLine()!!.toDouble()
    print("Se quer que seu cão lata Digite qualquer letra:")
       latir= readLine()!!

     print(" Nome ->  $nome")
     print("\n Idade -> $idade\n")

    Dog.SOM(latir)
    Dog.correr(valor)*/











