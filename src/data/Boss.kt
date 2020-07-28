package data

class Boss(val bossName: String) {

    inner class Employee(val name: String) {
        fun hi() {
            println("Hello ${this.name}, my name is $bossName")
        }
    }
}