package app

import data.Application
import data.Utilities

// Object yang dibuat 1 kali
// di kotlin cara membuat singleton dengan menggunakan kata kunci object
// singleton tidak memiliki constructor
// biasanya singleton dibuat untuk membuat helper class atau utilities class
// jadi dibanding harus membuat function di dalam class harus membuat object terlebih dahulu
// maka gunakan singleton class
// Note: data/Utilities.kt dan data/Application.kt

fun main() {
    // jika diubah maka akan berpengaruh kesemua function a, b karena merubah data di Singleton Utilities
    // gunakan val saat deklarasi data di utilities
    Utilities.name = "berubah"

    println(Utilities.toUpper("panpan"))
    a()
    b()

//    println(Application.Utilities.toUpper("wardiman"))
}

fun a() {
    println(Utilities.name)
}

fun b() {
    println(Utilities.name)
}
