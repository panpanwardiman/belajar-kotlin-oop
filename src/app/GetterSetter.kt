package app

import data.Note

fun main() {
    val note = Note("Belajar kotlin")

    // getter
    println(note.title)

    // setter
    note.title = "Belajar kotlin OOP"
}