package data

/**
 * ini adalah contoh penggunaan contructor pada kotlin
 * caranya yaitu dengan menambahkan parameter pada class
 * pembuatannya sama seperti membuat function
 */
class Car(paramBrand: String, paramName: String, paramYear: Int) {

    // initializer block adalah block kode yang akan dieksekusi ketika constructor dipanggil
    // lihat implementasinya di app/construktor.kt
    init {
        println("Car $paramBrand dibuat $paramYear")
    }

    // secondary constructor
    constructor(paramBrand: String, paramName: String):
            this(paramBrand, paramName, 2020) { // wajib memanggil primary constructor
        println("Secondary Constructor 1")
    }

    constructor(paramBrand: String): this(paramBrand, "") {
        println("Secondary Constructor 2")
    }
    var brand: String = paramBrand
    var year: Int = paramYear
}