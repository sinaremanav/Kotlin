class Car(
    val make: String,
    val model: String,
    val year: Int,
    var mileage: Double
) {
    fun details() {
        println("Car Details:")
        println("Make: $make")
        println("Model: $model")
        println("Year: $year")
        println("Mileage: $mileage")
    }

    fun drive(miles: Double) {
        if (miles > 0) {
            mileage += miles
            println("Drove $miles miles.")
        } else {
            println("Miles driven should be positive.")
        }
    }
}
fun main() {
    val Car = Car("Toyota", "Camry", 2015, 90000.0)

    Car.details()
    println("\n")

    Car.drive(150.5)
    //1.6km =1 mile

    Car.details()
}