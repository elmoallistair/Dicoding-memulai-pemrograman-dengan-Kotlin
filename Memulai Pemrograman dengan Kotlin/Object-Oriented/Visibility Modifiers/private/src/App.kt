class Animal(private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean = true) {

    fun getName() = name

    fun setName(newName: String) {
        name = newName
    }
}

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 2.5, 2)

    // dicoding.name <- Cannot access '[PROPERTY]': it is private in 'Animal'
    println(dicodingCat.getName())
    dicodingCat.setName("Gooose")
    println(dicodingCat.getName())
}