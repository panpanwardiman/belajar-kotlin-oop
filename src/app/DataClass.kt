package app

import data.Product

// kadang kita membuat class hanya digunakan sebagai representasi dari data/database
// data class merupakan class yang secara otomatis akan membuatkan function equals, hashCode, toString
// dan copy dari semua properties yang terdapat di primary constructor yang dimiliki oleh class
// Note: contoh data/Product.kt
fun main() {
    val product = Product("Indomie", 2500, "Food")
    val product2 = product.copy(name = "Sedap")
    println(product)
    println(product2)
}
