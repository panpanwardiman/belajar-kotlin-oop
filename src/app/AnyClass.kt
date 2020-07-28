package app

import data.SmartPhone

fun main() {
    val smartPhone = SmartPhone("samsung", "android")
    // to string adalah function dari class Any
    println(smartPhone.toString())
}