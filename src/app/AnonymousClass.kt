package app

import data.Action

// saat membuat object, maka diwajibkan untuk menggunakan deklarasi class yang lengkap
// bahkan di kotlin bisa membuat object dari interface
// kemampuan ini disebut anonymous class
// untuk membuat anonymous class gunakan kata kunci object diikuti dengan deklarasi child class

// Note: data/Action.kt

fun fireAction(action: Action) {
    action.action()
}

// kalau function nya cuma 1 gunakan interface, jadi tidak perlu membuat class.
// di bawah contoh pake class
class SampleAction : Action {
    override fun action() {
        println("this sample versi ribet")
    }
}

fun main() {
    // contoh pake class
    fireAction(SampleAction())

    // contoh anonymous class alias class tanpa nama
    // jadi kita mendeklarasi object class tanpa nama
    fireAction(object : Action {
        override fun action() = println("Action One")
    })
    fireAction(object : Action {
        override fun action() = println("Action Two")
    })
}