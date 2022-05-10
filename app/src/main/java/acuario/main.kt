package acuario

class mainAcuario(var length: Int = 100,var width: Int = 20, var height: Int = 40){
    var volume : Int
        get() = width * height * length / 1000
        set (value) {height = (value * 1000) / (width * length)}
    var water = volume * 0.9

    constructor(numberOfFish: Int): this(){
        val water: Int = numberOfFish * 2000 //cm3
        val tank:Double = water + water *0.1
        height= (tank / (length * width)).toInt()
    }
}

    fun main(args: Array<String>) {
        buildAquarium()
        makeFish()
    }

fun makeFish(){
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color} \n Plecostumus: ${pleco.color}")
    shark.eat()
    pleco.eat()
}
fun buildAquarium(){
    /*
    //clase sin parametros iniciales
    val myAcuario = acuario()
    println("largo: ${myAcuario.largo}"+
            "ancho: ${myAcuario.ancho}"+
            "alto: ${myAcuario.alto}")
    myAcuario.alto =80
    println("Alto: ${myAcuario.alto} cm")
    println("Volumen: ${myAcuario.volume} litros")
     */
    //clase con parametros iniciales
    val smallAcuario= acuario(20,15,30)
    println("Acuario chico: ${smallAcuario.volume} litros")
    val smallAcuario2= mainAcuario(numberOfFish = 9)
    println("Acuario chico 2: ${smallAcuario2.volume} liteos con"+
            "largo: ${smallAcuario2.length}"+
            "ancho: ${smallAcuario2.width}"+
            "alto ${smallAcuario2.height}"
    )
}
