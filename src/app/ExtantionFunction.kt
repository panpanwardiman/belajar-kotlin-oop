package app

import data.Student
import data.sayHello
import data.upperCase

// perlu diperhatikan bahwa saat membuat extansion function, kita tidak memodifikasi class aslinya.
// extension function hanyalah sebuah function bantuan yang artinya, kita tidak bisa mengakses data
// private atau protected dari class tersebut.
// extension function mirip seperti helper function

// secara standar, extension function tidak bisa digunakan untuk data null
// untuk bisa digunakan untuk data null gunakan kata kunci ? (tanda tanya)

// Note: data / contoh yang digunakan data/Student.kt

fun main() {
    val student: Student? = Student("panpan", 25)
    student.sayHello("wardiman")

    // extension properties
    println(student?.upperCase)
}