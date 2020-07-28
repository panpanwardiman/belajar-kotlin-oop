package app

import data.Application

// companion object adalah kemampuan membuat inner object di dalam class, tanpa harus menggunakan nama object
// companion object harus diberada di dalam class
// keuntungannya saat kita memanggil object, cukup dengan memanggil nama class nya
// cocok jika membuat singleton object kalau nama class dan object nya sama.
// Note: data/Application.kt

fun main() {
    println(Application.toUpper("wardiman"))
}

