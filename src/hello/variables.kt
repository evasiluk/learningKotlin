fun main(){
    val name: String = "Nate"
    var greeting: String = "Hello"
    greeting = "hi"

    var cat: String? = null  // ? - чтобы можно было присвоить значение null
    val newName = "Kate" // можно не указывать тип - kotlin попытается сам определить тип исходя из значения

    cat = "Jora"
    if(cat != null) {
        println("Hello $cat")
    } else {
        println("No kitty :(")
    }

    when(cat) {
        null -> println("No kitty:(")
        else -> println("Hello $cat")
    }

    val greetingToCat = when(cat) {
        null    -> "No kitty :("
        "Jora" -> "Hello Soneyka"
        "Vasya" -> "hello Yasya"
        else    -> "strange cat"
    }

    println(greetingToCat)
}