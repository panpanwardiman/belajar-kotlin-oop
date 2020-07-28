package app

import data.Account

// lazy akan di assign ketika dipanggil, ketika dipanggil maka akan dieksekusi, jika tidak maka tidak akan dieksekusi

fun main() {
    val account = Account()
    println(account.name)
    println(account.name)
    println(account.name)
}