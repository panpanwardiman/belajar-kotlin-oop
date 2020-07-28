package data

interface Base {
    fun sayHello(name: String)
}

class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}

//contoh melakukan delegate manual
//class MyBaseDelegate(val base: Base) : Base {
//    override fun sayHello(name: String) {
//        base.sayHello(name)
//    }
//}

//contoh delegate otomatis
class MyBaseDelegate(val base: Base) : Base by base // akan di override function semua secara manual

// jika ingin ada function yg di override/tidak semua
// maka override secara manual function yang akan di override