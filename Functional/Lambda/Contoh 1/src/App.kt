// main function
fun main() {
    printMessage("Hello From Lambda")
}

val printMessage = { message: String -> println(message) }