abstract class Animal(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan!")
    }

    fun sleep(){
        println("$name sedang tidur!")
    }
}

fun main() {
    println("Abstract Class")
}