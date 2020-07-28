package app

data class Friend(val name: String)

fun sayHello(friend: Friend?) {
//     println("hello ${friend?.name}")

//     bisa juga seperti ini jika ingin ada condition tertentu
//    if (friend != null) {
//        println("hello ${friend.name}")
//    } else {
//        println("null")
//    }

//     elvis operator
//    val name = friend?.name ?: "" // kalau null maka ganti menjadi string kosong
//    println("hello $name")

//   cara memaksa friend tidak null
    val name = friend!!.name
    println("hello $name")
}

fun main() {
    sayHello(Friend("diman"))
}