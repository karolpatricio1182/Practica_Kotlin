package acuario

abstract class AcuarioPez {
    abstract val color: String
}

class Shark: AcuarioPez(),FishAction{
    override val color = "gray"
    override fun eat(){
        println("come peces")
    }
}
class Plecostomus: AcuarioPez(),FishAction{
    override val color = "gold"
    override fun eat(){
        println("muchas algas")
    }
}

interface FishAction{
    fun eat()
}