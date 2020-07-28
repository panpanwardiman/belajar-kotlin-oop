package app

import data.Employee
import data.Manager

//pholymorphism adalah banyak bentuk
//kemampuan sebuah object berubah bentuk menjadi bentuk lain, jadi dari 1 object berubah jd object yang lain.
//erat hubungannya dengan inheritance

fun main() {
    var employee: Employee = Employee("wardiman")
    employee.sayHello("diman")

//    dari atribut employee dari Employee menjadi Manager, inilah pholymorphism
    employee = Manager("Juned")
    employee.sayHello("Denuj")
}
