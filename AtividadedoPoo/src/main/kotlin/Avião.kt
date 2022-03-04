class Avião (var Nome :String ,var Numvoo:Int , var Destino:String) {

    var Compaerea = ""
    var Horavoo = ""
    var Localemb = ""
    var NumBag = 0

    constructor(
        Nome: String,
        Numvoo: Int,
        Destino: String,
        Compaerea: String,
        Horavoo: String,
        Localemb: String,
        NumBag: Int
    ) : this(Nome, Numvoo, Destino) {
        this.Horavoo = Horavoo
        this.Compaerea = Compaerea
        this.Localemb = Localemb
        this.NumBag = NumBag
    }

    override fun toString(): String {
        return "Nome do Passageiro - $Nome" +
                "\nNúmero do Voo - $Numvoo" +
                "\nDestino - $Destino" +
                "\nCompanhia Aerea - $Compaerea" +
                "\nHorário Do Voô - $Horavoo" +
                "\nLocal De Embarque - $Localemb" +
                "\nNúmero da Bagagem - $NumBag"
    }
}