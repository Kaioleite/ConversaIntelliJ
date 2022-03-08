package `Exc Heranca e Polimorf`

class Cavalo (nome:String,idade:Int):Animal(nome,idade) {

    override fun SOM() {
        print("Sons de cavalo ")
    }
    fun correr (){
        print("Cavalo correndo ! ")
    }

}