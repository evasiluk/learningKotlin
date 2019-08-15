package Aquarium

//class Aquarium {
//    var width: Int = 20
//    var length:Int = 100
//    var height:Int = 40
//
//    //fun volume() = width * length * height / 1000
//
//    var volume: Int
//        get() {
//            return width * length * height / 1000
//        }
//        set(value) {
//            height = (value * 1000) / (width * length)
//        }
//}

class Aquarium(var width:Int = 20, var length:Int = 100, var height:Int = 40) {
    var volume:Int
        get() = width * length * height / 1000
        set(value)  {height = (volume * 1000) / (width * length)}

    var water = volume * 0.9

    constructor(numberOfFish:Int): this() {
        val water: Int = numberOfFish * 2000 //cm3
        val tank: Double = water + water * 0.1
        val height = (tank/width * length).toInt()
    }
}