package data

// jika tidak dideklarasikan maka class teacher otomatis public,
// termasuk propertiesnya jika tidak dideklarasikan maka otomatis public
open class Teacher(val name: String) {
    private fun teach() {
        println("Teach me...")
    }

    open protected fun test() {
        println("Test...")
    }
}

class SuperTeacher(name: String) : Teacher(name) {
    override public fun test() {
        // bisa akses function test di class teacher karena tipe nya protected
        super.test()
    }
}

// dalam kehidupan nyata biasanya yang lebih sering digunakan adalah public dan private
// biasanya private digunakan untuk memecah method/function yang panjang, dan menjadi kecil2
// dan yang kecil2 tersebut dijadikan private