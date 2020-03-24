## Latihan
Lengkapi potongan kode pada program sederhana di samping agar dapat berjalan dengan baik.

<b><i>TODO</i></b>:<br>
Lengkapi inisialisasi variable ```result``` dengan melakukan operasi matematika pada argumen yang diberikan dengan rumus perhitungan berikut:

```valueA + (valueB - valueC)```

Jika ```valueC``` bernilai null berikan <b>50</b> untuk nilai defaultnya.

Jika program dijalankan, maka pada konsol akan menampilkan text:

```ResultA is 54```<br>
```ResultB is 103```

Anda bisa menggunakan <b>Elvis Operator<b> untuk penanganan parameter yang bernilai null. 
  
## Solusi
```
fun main() {
    val valueA = 101
    val valueB = 52
    val valueC = 99

    val resultA = calculateResult(valueA, valueB, valueC)
    val resultB = calculateResult(valueA, valueB, null)

    println("""
        ResultA is $resultA
        ResultB is $resultB
    """.trimIndent())
}

fun calculateResult(valueA: Int, valueB: Int, valueC: Int?): Int {
    // TODO
    val result = valueA + (valueB - (valueC ?: 50))
    return result
}
```
