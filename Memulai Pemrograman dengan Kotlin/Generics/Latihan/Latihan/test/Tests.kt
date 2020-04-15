import org.junit.Assert
import org.junit.Test

class Test {

    private fun <T> checkFunction(args: T) {
        val result = when (args) {
            is String -> args.length
            is Int -> args * 5
            else -> 0
        }

        Assert.assertEquals("Fungsi getResult seharusnya mengembalikan nilai $result", result, getResult(args))
    }

    @Test
    fun test1() = checkFunction("Kotlin")

    @Test
    fun test2() = checkFunction(true)

    @Test
    fun test3() = checkFunction(10)

    @Test
    fun test4() = checkFunction(0x01)

    @Test
    fun test5() = checkFunction(false)

    @Test
    fun test6() = checkFunction(10L)

    @Test
    fun test7() = checkFunction('A')

    @Test
    fun test8() = checkFunction(100110)
}