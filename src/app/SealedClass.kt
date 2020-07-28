package app

import data.Minus
import data.Modulo
import data.Operation
import data.Plus

// sealed class merupakan jenis class yang didesain untuk inheritance
// tidak bisa diinisialisasi menjadi object, dan secara standar sealed class merupakan abstract class
// cocok digunakan sebagai class parent
// sealed class sangat berguna di when expression
// dengan sealed class kita dapat membatasi hanya class turunannya yang perlu di check
// Note: data/Operation.kt

fun operation(value1: Int,value2: Int, operation: Operation): Int {
    return when (operation) {
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
    }
}

fun main() {
    println(operation(10, 10, Plus()))
    println(operation(10, 10, Minus()))
    println(operation(10, 10, Modulo()))
}