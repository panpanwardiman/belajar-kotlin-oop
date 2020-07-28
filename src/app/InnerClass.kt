package app

import data.Boss

// di kotlin kita dapa membuat class inner dan outer
// tp class inner tidak dapat mengakses data class outer.
// agar class inner dapat mengakses data class outer, gunakan kata kunci inner

fun main() {
    val bos = Boss("wardiman")
    val employee = bos.Employee("panpan")

    employee.hi()
}