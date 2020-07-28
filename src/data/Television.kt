package data

// Late-Initialized Properties
// lateinit mendeklarasikan properties tanpa harus langsung mengisi datanya
// lateinit hanya bisa digunakan di var
class Television {
    lateinit var brand: String

    fun initTelevision(brand: String) {
        this.brand = brand
    }
}