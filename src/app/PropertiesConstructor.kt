package app

import data.User

fun main() {
    val user1 = User("panpan", "wardimanPass")

    println(user1.username)
    println(user1.password)
}