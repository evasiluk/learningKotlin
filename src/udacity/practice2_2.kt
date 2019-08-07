package udacity

fun main() {
    val trout = "trout";
    val haddock = "haddock";
    val snapper = "snapper";

    val sentence = "I like $trout and $haddock, but i hate $snapper";
    println(sentence);


    val fishname = "Goldeen";

    when(fishname.length) {
        0 -> println("error")
        in 3..12 -> println("Good fish name")
        else -> println("OK fish name")
    }
}