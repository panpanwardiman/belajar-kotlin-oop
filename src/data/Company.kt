package data

class Company(val name: String) {
    // cara membandingkan atribut pada 2 buah object
    override fun equals(others: Any?): Boolean {
        return when(others) {
            is Company -> others.name == this.name
            else -> false
        }
    }

    override fun hashCode(): Int {
        return this.name.hashCode()
    }
}