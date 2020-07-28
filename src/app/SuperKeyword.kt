package app

import data.Retangle

fun main() {
    val retangle = Retangle()
    println("this corner child class ${retangle.corner}")
    println("this parent corner child class ${retangle.parentCorner}")
}