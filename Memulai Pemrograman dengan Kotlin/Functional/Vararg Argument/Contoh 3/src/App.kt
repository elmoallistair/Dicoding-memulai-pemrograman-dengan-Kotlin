// main function
fun main() {
    val number = intArrayOf(10, 20, 30, 40)
    sets(10, 20, 20, *number , 10)
}

fun sets(vararg number: Int): Int {
    return number.sum()
}