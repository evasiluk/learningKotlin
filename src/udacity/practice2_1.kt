package udacity

fun main() {
    val akvQnt: Int = 2.plus(71).plus(273).minus(13).div(30).plus(1)
    println(akvQnt)

    var rainbowColor: String = "blue"
    rainbowColor = "red"

    val blackColor:String = "black"
    //blackColor = "blue" // error

    var greenColor = null
    var blueColor:String? = null

    listOf(null, null)
    var list:List<String?> = listOf(null, null)
    var list2:List<String>? = null

    var nullTest:Int? = 5
    //var nullTest:Int? = null
    println(nullTest?.inc() ?:0)


}