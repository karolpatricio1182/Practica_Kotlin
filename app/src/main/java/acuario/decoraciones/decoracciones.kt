package acuario.decoraciones

fun main(args: Array<String>){
        makeDecorations()

}

fun makeDecorations(){
    val d1 = Decoraciones ("granito")
    println(d1)
    val d2 = Decoraciones ("pizarra")
    println(d2)
    val d3 = Decoraciones ("pizarra")
    println(d3)

    println(d1.equals(d2))
    println(d3.equals(d2))

    val d4 =d3.copy()
    println(d3)
    println(d4)

    val d5 = Decoraciones2("cristal","madera","buzo")
    println(d5)

    val (rock,wood,diver) = d5
    println(rock)
    println(wood)
    println(diver)
}
data class Decoraciones(val rocks: String){}
data class Decoraciones2(val rocks: String,val wood: String, val diver: String){}
