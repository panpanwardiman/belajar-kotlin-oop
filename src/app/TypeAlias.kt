package app

import data.Application

// type alias adalah membuat nama berbeda dari tipe data yang telah ada
// biasanya digunakan ketika ada tipe data dengan nama yang sama, atau mempersingkat tipe data.

typealias App = Application

// type alias function
typealias StringSupplier = () -> String

fun sayHello(supplier: StringSupplier)  {
    println("Hello ${supplier()}")
}

fun main() {
    val app = App("Kotlin App")

    sayHello { "Makmur" }
}