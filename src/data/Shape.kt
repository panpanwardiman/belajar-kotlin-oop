package data

// Properties Overrirde
open class Shape {
    open val corner: Int = -1

    open fun printName() {
        println("this is shape")
    }
}

class Retangle : Shape() {
    override val corner: Int = 4
    // super keyword akses properties parent class
    val parentCorner: Int = super.corner

    override fun printName() {
        println("this is retangle")
        super.printName()
    }
}