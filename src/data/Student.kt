package data

class Student(val name: String, private val age: Int)

// extention function tidak bisa mengakses member/properties private dan protected
fun Student?.sayHello(name: String) {
    if (this != null) {
        println("Hello $name, my name is ${this.name}")
    }
    // cara lain
    // println("Hello $name, my name is ${this?.name}")
}

// ex: Extension properties
val Student.upperCase: String
    get() = this.name.toUpperCase()