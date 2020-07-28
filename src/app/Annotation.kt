package app

import program.MyApplication

//annotation menambahkan metadata ke kode program yang kita buat
//biasanya annotation digunakan ketika ingin membuat library/framework
//annotation biasanya bisa diakses dengan replection
//annotation hanya boleh memiliki properties via primary constructor
//tidak boleh memiliki member lainnya (function atau properties di body)
//annotation selalu diawali dengan @

//contoh nya ada di package annotations dan program

fun main() {
    val myApplication = MyApplication("kotlin", 1)
    println(myApplication.info())
}