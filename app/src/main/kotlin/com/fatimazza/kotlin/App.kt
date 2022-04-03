/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.fatimazza.kotlin

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    // String
    val name = "Codewithza "
    val lastname: String = "here"
    println(name + lastname)

    // Int
    val valueA: Int = 20
    val valueB = 30
    println(valueA + valueB)

    // Char
    var alphabet: Char = 'A'
    println(alphabet +" " +alphabet++ +" " +alphabet++)

    // String - Advanced Manipulation
    val firstChar = name[0]
    println("First character is $firstChar")
    // Escaped String
    println("Kotlin \nIt\'s... \t \"Awesome\"")
    println( "Unicode text: \u00A9")
    // Raw String
    val line = """
        Line 1
        Line 2
        Line 3
    """.trimIndent()
    println(line)

    println("")

    // IF Expression
    println(if (true) "Always true" else "False")

    val now = 16
    val openHours = 7
    val office: String
    if (now > openHours) {
        office = "Office already open"
    } else {
        office = "Office is closed"
    }
    print(office)

    val officeOpen = if (now > openHours) {
        "Office already open"
    } else if (now == openHours) {
        "Wait, office will be open"
    } else {
        "Office is closed"
    }
    println(officeOpen)

    println("")

    // Function
    println(App().greeting)

    val user = setUser("Fatima", 17)
    println (user)
    printUser("Fatima")
}

fun setUser(name: String, age: Int) = "Hei $name, you are $age years old"

fun printUser(name: String) {
    println("Your name $name")
}
