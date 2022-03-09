package `Exc Heranca e Polimorf`

class Cachorro (nome:String, idade:Int):Animal(nome,idade) {
         override fun SOM() {
                print("Au Au Au ")
          }
    fun corre(){
        print(" correndo como um cachoorro ")
    }
}