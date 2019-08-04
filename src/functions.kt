fun main() {
    println(myFirstFunction1());
    println(myFirstFunction1(25));
    println(myFirstFunction41(25, 2.5))
    println(myFirstFunction42(25, 2.5))
}

fun myFirstFunction1():Int {
    return 1;
}

fun myFirstFunction1(a:Int):Int {
    return a;
}

fun myFirstFunction3(){
    println("Hello world");
}

fun myFirstFunction41(a:Long, b:Double):Double {
    val result = a + b;
    return result;
};
fun myFirstFunction42(a:Long, b:Double) = a + b; // короткая запись