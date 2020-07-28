package app

import data.Gender

// enum class merupakan representasi dari class yang sudah tetap nilainya contoh gender(pria/wanita)
// Note: data/Gender.kt

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    // cara baca Array<Gender> yaitu array of gender
    val allOfGender: Array<Gender> = Gender.values()

    val manFromString = Gender.valueOf("MALE")
    val womanFromString = Gender.valueOf("FEMALE")

    println(man)
    println(woman)
    println(allOfGender.toList())
    man.showDescription()
    woman.showDescription()
}