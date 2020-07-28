package data

import kotlin.properties.Delegates

class Account(description: String = "") {
    // delegate ke lazy
    val name: String by lazy {
        println("Name is called")
        "wardiman"
    }

    // contoh Observable properties
    var description: String by Delegates.observable(description) { property, oldValue, newValue ->
        println("${property.name} changed form $oldValue to $newValue")
    }
}