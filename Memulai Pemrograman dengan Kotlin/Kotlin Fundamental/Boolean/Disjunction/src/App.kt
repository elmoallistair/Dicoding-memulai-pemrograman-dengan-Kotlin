// main function
fun main() {
    val officeOpen = 6
    val officeClosed = 16
    val now = 20

    val isOpen = now < officeOpen || now > officeClosed

    print("Office is closed : $isOpen")
}

/*
    Output : Office is closed : true
 */