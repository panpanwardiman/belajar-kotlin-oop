package app

import data.SuperTeacher
import data.Teacher

// class, interface, constructor, function, dan properties (termasuk getter setter) bisa memiliki visibility modifier
// ada 4 di kotlin: public, private, protected, internal
// secara internal di kotlin adalah public
// Note: data yang digunakan adalah data/Teacher.kt

fun main() {
    val teacher = SuperTeacher("panpan")
    println(teacher.name)
    teacher.test()
}