package data

class Application(val name: String) {
    // contoh singleton object
//    object Utilities {
//        fun toUpper(name: String): String {
//            return name.toUpperCase()
//        }
//    }

    // contoh companion object
    companion object {
        fun toUpper(name: String): String {
            return name.toUpperCase()
        }
    }
}