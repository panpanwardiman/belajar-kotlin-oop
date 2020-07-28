package app

import data.Fruit

fun main() {
    val fruit1 = Fruit(100)
    val fruit2 = Fruit(100)
//    val fruit3 = fruit1.plus(fruit2) contoh biasa

//    contoh operator overloading
    val fruit3 = fruit1 + fruit2
}