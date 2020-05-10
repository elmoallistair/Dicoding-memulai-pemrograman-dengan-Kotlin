// Coming Soon
fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    println("""
       String result: $stringResult
       Int result: $intResult
    """.trimIndent())
}

// TODO 1
fun <T> getResult(args: T): Int {
    return when (args) {
        is Int -> args * 5
        is String -> args.length
        else -> 0
    }
}