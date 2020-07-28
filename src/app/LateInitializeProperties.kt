package app

import data.Television

fun main() {
    val tele = Television()

    // println(tele.brand) // error karena belum inisialisasi brand

    tele.initTelevision("Samsung") // wajib panggil function tsb
    println(tele.brand)

    // kalau tidak punya function initTelevision
    tele.brand = "Sharp"
    println(tele.brand)
}