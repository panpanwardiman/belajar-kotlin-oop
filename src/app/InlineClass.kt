package app

import data.Token

// kadang kita hanya membuat class dengan satu properties
// inline class hanya boleh membuat 1 properties
// terlalu banyak class akan memakan konsumsi memory yang lebih banyak ketika program running
// Note: data/Token.kt

fun main() {
    val token = Token("Rahasia")
    println(token.value)
    println(token.toUpper("panpan"))
}