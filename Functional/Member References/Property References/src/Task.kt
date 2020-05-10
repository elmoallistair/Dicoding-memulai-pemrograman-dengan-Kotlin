var message = "Kotlin"

fun main() {
    println(::message.name)
    println(::message.get())

    ::message.set("Kotlin Academy")

    println(::message.get())
}