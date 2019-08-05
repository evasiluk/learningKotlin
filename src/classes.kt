fun main() {
    val person = Person("John", "Doe", 30);
    println(person.firstName)
    println(person.lastName)
    println(person.age)

    val car = Car(20.5, 10)
    val model = car.getModel();
    println(model)

    val cat = Cat("Jora", "Thai")
    val catName = cat.getName();
    val breed   = cat.breed;

    println(catName)
    println(breed)
}