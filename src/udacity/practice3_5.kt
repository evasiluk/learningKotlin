package udacity

fun main() {
    println(whatShouldIDoToday("sad", weather = "Rainy"))
}

fun whatShouldIDoToday(mood:String, weather:String = "sunny", temperature:Int = 24 ): String {
    return when {
        cond1(mood, weather) -> "go for a walk"
        cond2(mood, weather) -> "stay in bed"
        cond3(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}

fun cond1(mood:String, weather:String) = (mood == "happy" && weather == "Sunny")
fun cond2(mood:String, weather:String) = (mood == "sad" && weather == "Rainy")
fun cond3(temperature:Int) = temperature > 35