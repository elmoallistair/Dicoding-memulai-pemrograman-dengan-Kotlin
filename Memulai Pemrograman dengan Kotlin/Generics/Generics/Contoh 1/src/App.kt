// main function
fun main() {
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList[0]
}

class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}

interface List<T> {
    operator fun get(index: Int): T
}