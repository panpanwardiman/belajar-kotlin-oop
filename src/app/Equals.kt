package app

import data.Company

fun main() {
    val company1 = Company("Panpan")
    val company2 = Company("Panpan")


    // jika tidak membuat override equals function maka kotlin akan membaca nama objectnya tanpa
    // memperdulikan nilai atributnya. contoh company1 == company 2 hasilnya false
    // jika override equals function di class company maka contoh tsb hasilnya true.
    println(company1 == company2)
    println(company1 == company1)
    println(company2 == company2)
}