fun main(args: Array<String>) {
    print("Dime tu estado de animo: ")
    var estadoAnimo = readLine()!!.toString()
    whatShouldIDoToday(estadoAnimo)

}

fun whatShouldIDoToday(animo : String,clima : String = "soleado",temperatura : Double = 24.0){
    when {
        isVeryHot(temperatura) -> println("ve a nadar")
        isSadRainyCold(animo, clima, temperatura) -> println("estate en la cama")
        isHappySunny(animo, clima) -> println("ve a caminar")
        animo =="feliz" && clima =="soleado" -> println("Buen dia para ir a la playa")
        animo =="feliz" && clima =="nublado" -> println("Buen dia para ir a jugar futbol o andar en bici")
        animo =="triste" && clima =="nublado" -> println("Buen dia para no hacer nada")
        animo =="triste" && clima =="lloviendo" -> println("Buen dia para llorar")
        animo =="feliz" && clima =="chispiando" -> println("Buen dia para leer un libro con cafe")
        animo =="deprimido" && clima =="soleado" -> println("Levantate y ve a correr")
        animo =="enojado" && clima =="soleado" -> println("Ve al gym para que se te baje")
        animo =="angustiado" && clima =="soleado" -> println("Si puedes hacer algo hazlo sino no te sirve de nada estar asi")
        animo =="enojado" && clima =="soleado" && temperatura==0.0-> println("Ve al gym para que se te baje")
        animo =="deprimido" && clima =="soleado" && temperatura==20.0-> println("Toma un baño con agua fria")
        animo =="angustiado" && clima =="soleado" && temperatura==15.5-> println("Dia perfecto para tomar un helado")

        else -> {print("Quedate en casa y juega videojuegos")}
    }
}
fun isVeryHot (temperature: Double) = temperature > 35.0
fun isSadRainyCold (mood: String, weather: String, temperature: Double) =
    mood == "triste" && weather == "lloviendo" && temperature == 0.0
fun isHappySunny (mood: String, weather: String) = mood == "happy" && weather == "sunny"