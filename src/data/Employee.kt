package data

// keyword Open pada class adalah bahwa class dapat di inheritance
// keyword Open pada function adalah bahwa function dapat di override / dideklarasikan ulang di class child
// class secara default bersifat final atau tidak dapat di inheritance, begitu pula dangan function
// function yang telah di override secara default statusnya open
// untuk function agar tidak dapat di override lagi di class child gunakan keyword final
open class Employee(val name: String) {
    // override function
    open fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

open class Manager(name: String) : Employee(name) {
    final override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name} i'm manager")
    }
}

class SuperManager(name: String) : Manager(name) {
    // tidak bisa override function sayHello dari class manager
//    override fun sayHello(name: String) {
//        println("Hello $name, my name is ${this.name} i'm super manager")
//    }
}

class VicePresident(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name} i'm vice president")
    }
}