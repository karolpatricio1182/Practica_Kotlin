package acuario
import kotlin.math.PI
open class acuario (var largo: Int = 100,var ancho: Int = 20, var alto: Int = 40){

    open var volume : Int
        get() = ancho * alto * ancho / 1000
        set (value) {alto = (value * 1000) / (ancho * largo)}
    open var water = volume *0.9
    constructor(numberOfFish: Int): this(){
        val water: Int = numberOfFish *2000
        val tank: Double = water + water *0.1
        alto = (tank / (largo * ancho)).toInt()
    }
    /*
    fun volume(): Int{
        return ancho * alto * ancho / 1000
    }
    */

}
class TowerTank(): acuario(){
    override var water = volume * 0.8
    override var volume: Int
        get() = (ancho * alto * ancho / 1000 * PI).toInt()
        set (value) {alto = (value * 1000) / (ancho * largo)}

}