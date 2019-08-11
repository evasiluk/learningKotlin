fun main() {
    val birthday = getBirthday()
    val fortune  = getFortuneCookie(birthday)

    println("Your fortune is: $fortune")
}

fun getFortuneCookie(birthday: Int):String {
    val fortunes = listOf<String>("You will have a great day!", "Things will go well for you today.", "Enjoy a wonderful day of success.", "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.", "Take it easy and enjoy life!", "Treasure your friends because they are your greatest fortune.")

    val fortune:String

    fortune = when(birthday) {
        in 28..30 -> fortunes[1]
        in 1..7 -> fortunes[2]
        else -> fortunes[birthday.rem(fortunes.size)]
    }

    return fortune
}

fun getBirthday():Int {
    println("Enter your birthday")
    return readLine()?.toIntOrNull() ?: 1
}