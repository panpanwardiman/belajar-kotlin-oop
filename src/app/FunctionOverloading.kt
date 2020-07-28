package app

import data.Person

// Function Overloading adalah kemampuan membuat function dengan nama yang sama di dalam class
// Syaratnya parameternya berbeda, bisa tipe parameternya atau jumlah parameter

fun main() {
    val person = Person()

    person.firstName = "Panpan"

    person.sayHello("Wardiman")
    person.sayHello("Jhon", 25, "Jhonny")
}