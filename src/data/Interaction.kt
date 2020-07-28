package data

interface Interaction {
    // kontrak yang akan diturunkan oleh interface
    // class yang menjadi turunan interface wajib memiliki atau override kontrak di bawah
    // properties tidak boleh assign value nya.
    // function defaultnya sudah open
    val name: String
    fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}") // $this.name ambil properties name Human class
    }
}

// example for multiple interface
// inheritance antar interface
interface Go : Interaction {
    fun go() {
        println("go ${this.name}")
    }
}

// konflik di interface
// untuk menggunakan function dikedua interface tersebut harus di override terlebih dahulu
// di class turunannya.
interface MoveA {
    fun move() = println("Move A")
}

interface MoveB {
    fun move() = println("Move B")
}

class Human(override val name: String) : Go, MoveA, MoveB {
    override fun move() {
        // untuk mengakses super function move di interface gunakan super
        // tetapi pada kasus ini kedua function di interface namanya sama2 move
        // agar tidak keliru mana function move interface A dan B lakukan seperti di bawah
        super<MoveA>.move()
        super<MoveB>.move()
    }
}