package app

import data.Game
import data.Login
import data.MinMax
import kotlin.math.min

// destructuring declaration adalah membuat multiple variable dari sebuah object.
// tidak bisa dilakukan untuk semua object, hanya object yang memiliki function componentX()
// yang bisa dilakukan destructuring.
// saat membuat data class, secara otomatis akan dibuatkan function componentX() sesuai dengan jumlah params nya.
// Note: data/Game.kt dan data/MinMax.kt

fun main() {
    val game = Game("kotlin", 2500)
//    cara extract biasa
//    val name = game.name
//    val price = game.price
//    bayangkan jika ada 10 atau lebih pasti cape

//    cara destructuring
    val (name, price) = game
    println(name)
    println(price)

//    contoh destructuring pada function
//    val result = minMax(10, 100)
//    val min = result.min
//    val max = result.max
//    contoh diatas bisa dipersingkat seperti di bawah
    val (min, max) = minMax(10, 100)
    println(min)
    println(max)

//    kalau tidak ingin menggunakan max misal, gunakan _ (underscore) artinya tidak digunakan

//    lambda destructuring
    val login = Login("panpan", "secret")
//    login(login) {  login ->
//        login.user == "panpan" && login.pass == "secret"
//    }

//    bisa dipersingkat dengan
    login(login) { (user, pass ) ->
        user == "panpan" && pass == "secret"
    }
}

fun minMax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value1, value2)
        else -> MinMax(value1, value2)
    }
}

fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}