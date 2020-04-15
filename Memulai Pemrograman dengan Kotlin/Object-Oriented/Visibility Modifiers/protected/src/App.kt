open class Animal(val name: String, protected val weight: Double)

class Cat(pName: String, pWeight: Double) : Animal(pName, pWeight)


fun main() {
    val cat = Cat("Dicoding Miaw", 2.0)
    println("Nama Kucing: ${cat.name}")
    // println("Berat Kucing: ${cat.weight}") <- Cannot access 'weight': it is protected in 'Cat'
}
