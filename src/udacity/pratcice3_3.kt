package udacity

fun main() {
    println(getFortuneCookie())
}

fun getFortuneCookie():String {
    val fortunes = listOf<String>("You will have a great day!", "Things will go well for you today.", "Enjoy a wonderful day of success.", "Be humble and all will turn out well.",
                                  "Today is a good day for exercising restraint.", "Take it easy and enjoy life!", "Treasure your friends because they are your greatest fortune.")

    println("Enter your birthday")

    var birthday:Int = readLine()?.toIntOrNull() ?: 1

    val fortune = fortunes[birthday.rem(fortunes.size)]

    return "Your fortune is: $fortune"
}