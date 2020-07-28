package data

// contoh 1
// enum class Gender {
//    // data gender
//     MALE,
//    FEMALE
// }

// contoh 2
enum class Gender(val description: String) {
    MALE("Male"),
    FEMALE("Female");

    fun showDescription() {
        println(description)
    }
}