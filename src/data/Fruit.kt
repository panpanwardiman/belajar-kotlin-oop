package data

data class Fruit(val equality: Int) {
    operator fun plus(fruit: Fruit): Fruit {
        return Fruit(this.equality + fruit.equality)
    }
}