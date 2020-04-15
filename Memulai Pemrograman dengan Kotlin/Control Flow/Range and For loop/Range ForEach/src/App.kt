// main function
fun main() {
    val rangeInt = 1..10 step 2

    rangeInt.forEach {
        print("$it ")
    }

    println(rangeInt.step)
}