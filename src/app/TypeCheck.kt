package app

import data.Laptop

// kata kunci is adalah untuk mengecek tipe
fun printObject(any: Any) {
//    println(any)
//    check casts
    if (any is Laptop) {
        println("my laptop ${any.name}")
    } else {
        println(any)
    }
}

fun printObjectWithWhen(any: Any) {
//    println(any)
    when(any) {
        is Laptop -> {
            println("my laptop is ${any.name}")
        }
        else -> {
            println(any)
        }
    }
}

//conversi dengan kata kunci as
fun printString(any: Any) {
    val value = any as String
    println(value)
    // hati2 jika mengkonversi data dengan kata kunci as
    // bisa menyebabkan error classCastExeption
}

//jika value tidak sesuai dengan tipe data maka akan menjadi null
fun printStringSafe(any: Any) {
    val value: String? = any as? String
    println(value)
}

fun main() {
    printObject("panpan")
    printObject(1)
    printObject(Laptop("Asus"))

    printStringSafe("wardiman") // wardiman
    printStringSafe(1) // Null
}