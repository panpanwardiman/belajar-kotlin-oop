package app

import data.Account

// Observable salah satu library kotlin untuk delegate properties
// dengan observable properties, kita bisa tahu properties, value sebelum dan setelah value ketika diubah
// mendeteksi ketika properties diubah.
// Note: data/Account.kt

fun main() {
    val account = Account()
    account.description = "Contoh"
    account.description = "diubah"
    account.description = "hello world"

    // hasilnya
    // description changed form  to Contoh
    // description changed form Contoh to diubah
    // description changed form diubah to hello world
}

