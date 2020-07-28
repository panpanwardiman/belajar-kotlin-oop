package app

import data.Car

fun main() {
    val avanza = Car("Toyota") // class Car dengan constructor
    avanza.year = 2020 // merubah value year atau bisa seperti di bawah

    val almaz = Car("Wuling", "Almaz")

    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)
}