package app

import data.MyBase
import data.MyBaseDelegate

// delegation adalah meneruskan properties atau function ke object lain
// Note: data/Base.kt

fun main() {
    val base = MyBase()
    base.sayHello("wardiman")

    val myBaseDelegate = MyBaseDelegate(base)
    myBaseDelegate.sayHello("diman")
}