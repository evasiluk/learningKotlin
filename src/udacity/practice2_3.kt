package udacity

fun main() {
    val numbers = arrayOf(11, 12, 13, 14, 15);
    val strings = mutableListOf<String>();

    for(num in numbers) {
        strings.add(num.toString());
    }

    println(strings)

    for(i in 0..100 step 7) {
        println("$i - ");
    }
}