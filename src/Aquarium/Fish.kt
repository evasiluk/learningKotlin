package Aquarium

class Fish(var friendly: Boolean = true, var neededVolume: Int) {
    val size:Int
    init {
        if(friendly) {
            size = neededVolume
        } else {
            size = neededVolume * 2
        }
    }

    init {
        println("constructed a fish with size of $neededVolume and final size ${this.size}")
    }
}