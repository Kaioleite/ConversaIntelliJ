fun main(){
/* 1- Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
      em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as
       informações deste objeto no console.
*/
val Usuario = Cliente()
Usuario.Nome ="Kaio"
Usuario.idade = 24
Usuario.email= "KaioMaster@gmail.com"
Usuario.end ="avenida Augustinho carrara 2400 "
Usuario.Estadocivil = "Casado"

println(" Nome -> ${Usuario.Nome}  ")
println(" Idade -> ${Usuario.idade}  ")
println(" Email -> ${Usuario.email} ")
println(" Endereço -> ${Usuario.end}  ")
println(" Estado Civil ->${Usuario.Estadocivil}  ")
}