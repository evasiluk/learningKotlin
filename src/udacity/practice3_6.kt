package udacity

fun main() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    val fil1 = spices.filter{it.contains("curry")}.sortedBy { it.length }
    val fil2 = spices.filter{it.startsWith('c') && it.endsWith('e')}
    val fil3 = spices.take(3).filter{it.startsWith('c')}

}