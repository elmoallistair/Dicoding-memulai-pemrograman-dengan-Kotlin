val sum: (Int, Int) -> Int = { valueA, valueB -> valueA + valueB }

val multiply: (Int, Int) -> Int = { valueA, valueB -> valueA * valueB }

fun main() {
    val sumResult = sum.invoke(10, 10)
    val multiplyResult = multiply.invoke(20, 20)

    println(sumResult)
    println(multiplyResult)
}