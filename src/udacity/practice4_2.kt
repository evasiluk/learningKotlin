package udacity

class Spice(var name: String, var spiciness: String = "mild") {
    val heat: Int
        get() {
            return when(spiciness) {
                "mild"            -> 1
                "medium"          -> 3
                "spicy"           -> 5
                "very spicy"      -> 9
                "extremely spicy" -> 12
                else -> 0
            }
        }
    init {
        println("The heat of $name is $heat")
    }
}

fun main() {
    val list = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )

    val spice = Spice("pepper", "very spicy")

    val filtered = list.filter{it.heat <= 5}

    filtered.forEachIndexed(){index, spice ->
        println("$index - ${spice.name}")
    }
}

fun makeSalt() = Spice("Salt")