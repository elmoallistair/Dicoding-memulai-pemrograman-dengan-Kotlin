// main function
fun main() {
    val officeOpen = 7
    val now = 20
    val office: String
    if (now > officeOpen) {
        office = "Office already open"
    } else {
        office = "Office is closed"
    }

    print(office)
}