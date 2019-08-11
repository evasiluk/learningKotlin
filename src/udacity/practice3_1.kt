package udacity

import java.util.*

fun main(args: Array<String>){
    println(args[0])
    dayOfWeek()
}

fun dayOfWeek(){
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    var dayString = ""

    dayString = when(day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    }

    println("What day is it today?")
    println("Today is $dayString")
}