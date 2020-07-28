package app

import data.Person

fun main() {
    // instansiasi object panpan
    // di kotlin tidak perlu kata kunci 'new' untuk menginstansiasi object
    val panpan = Person()

    panpan.firstName = "Hanif"

    println(panpan.firstName)
}