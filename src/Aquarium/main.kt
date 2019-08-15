package Aquarium

fun main(args:Array<String>) {
    buildAquarium()
    val fish = Fish(false, 25)
}

fun buildAquarium() {
    val myAquarium = Aquarium()

    println("width: ${myAquarium.width} " +
            "length: ${myAquarium.length} " +
            "height: ${myAquarium.height}"
    )

    myAquarium.height = 80

    println("New height is: ${myAquarium.height} cm")
    println("Volume is ${myAquarium.volume} liters")
}