package app

import data.Person

fun main() {
    val panpan = Person()

    panpan.firstName = "Panpan"
    panpan.middleName = "Tengah"
    panpan.lastName = "Wardiman"

    panpan.sayHello("Paseo")
    panpan.run()
    // jika return String
    val fullname = panpan.getFullName()
    println(fullname)
}