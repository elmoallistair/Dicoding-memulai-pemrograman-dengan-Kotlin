package com.dicoding.oop.utils

fun sayHello() = println("Hello From package utils")

const val PI = 3.1415926535  // package level variable

fun pow(number: Double, power: Double) : Double {
    var result = 1.0
    var counter = power
    while (counter > 0) {
        result *= number
        counter--
    }
    return result
}

fun factorial(number: Double) : Double {
    var result = 1.0
    var counter = 1.0
    while (counter <= number) {
        result *= counter
        counter++
    }

    return result
}

fun areaOfCircle(radius: Double) : Double {
    return PI * 2 * radius
}
