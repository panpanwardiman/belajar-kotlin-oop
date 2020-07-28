package data

class Person {
    // dalam deklarasi properties sebisa mungkin hindari properties dengan nilai null
    // kalau bisa usahakan selalu ada default value, hal ini untuk menghindari Null Pointer Exception
    var firstName: String = ""
    var middleName: String? = null // boleh null/kosong
    var lastName: String = ""

    // chapter function dibelajar oop kotlin
    fun sayHello(name: String) {
        println("Hello $name, My name is ${this.firstName}")
    }

    // Contoh Function Overloading
    fun sayHello(name: String, age: Int, lastName: String) {
        println("Hello $name, I'm age $age, my lastname is ${this.lastName}")
    }

    fun run() {
        println("I'm run")
    }

    fun getFullName(): String {
        return "${this.firstName} ${this.middleName} ${this.lastName}"
    }
}