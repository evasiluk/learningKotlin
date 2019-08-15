fun main() {

    val trout   = "trout"
    val haddock = "haddock"
    val snapper = "snapper"

    val sentence = "I like $trout and $haddock, but don't like $snapper"

    //println(sentence)

    //______________________________

    val fishname = "Princess"

    when(fishname.length) {
        0 -> println("Wrong name!");
        in 3..12 -> println("Good name!");
        else -> println("It's OK name");
    }

    //______________________________  Ranges
    val myRange = 1..10;
    for(i in myRange){
        println(i);
    }

    val myEvenRange = 1..20 step 2;
    for(i in myEvenRange) {
        println(i);
    }

    //______________________________arrays
    var fishes = arrayOf("koi", "goldfish");
    println(fishes[0]);

    for(fish in fishes) {
        println(fish);
    }

    var nums = arrayOf(3.14, 2.45, 6.18)
    var sum: Double = 0.0;

    for (n in nums) {
        sum += n;
    }

    println(sum);

}