// main function
fun main() {
    sets(10, 10, name = "Kotlin")
}

fun sets(vararg number: Int, name: String): Int {
    println(name)
    return number.sum()
}