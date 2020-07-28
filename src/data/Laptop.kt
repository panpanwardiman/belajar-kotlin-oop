package data

// Super Class Any
// secara default kalau kita buat class maka super classnya adalah Any

class Laptop(val name: String)

open class HandPhone(val name: String)

class SmartPhone(name: String, val os: String) : HandPhone(name)