fun getGreeting():String{
    return "Hello Kotlin"
}

fun getAnotherGreeting():String = "Hello PHP"

fun sayHello(name:String) {
    val msg = "Hello $name"
    println(msg)
}

fun main() {
    println(getGreeting())
    println(getAnotherGreeting())
    sayHello("Eugene")
}