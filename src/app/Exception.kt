package app

import exception.ValidationException

//Error di kotlin direpresentasikan dengan Exception, dimana semua tipe data error pasti
//turunan dari Throwable
//gunakan tanda kunci throw dan diikuti objectnya

//jika terjadi exception, maka program secara otomatis berhenti
//gunakan try catch untuk menangkap exception, lalu lakukan sesuatu jika terjadi error

fun validateSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is Black")
    } else {
        println("Hello $name")
    }
}

fun main() {
    try {
        validateSayHello("wardiman")
        validateSayHello("")

        // ketika error, kode dibawah tidak akan dieksekusi
        // maka akan langsung ke block catch
        println("Program")

    } catch (error: ValidationException) {
        println("Error ${error.message}")
    } finally { // block finally akan selalu dieksekusi baik ada error atau tidak
        println("program selesai")
    }
}