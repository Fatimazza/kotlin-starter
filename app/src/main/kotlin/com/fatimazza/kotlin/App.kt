/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.fatimazza.kotlin

import kotlin.random.Random

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {

    // 1 Kotlin Fundamental

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
    val closeHours = 17
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

    // Boolean
    practiceBoolean(now, openHours, closeHours)

    // Numbers
    practiceNumbers()

    // Array
    practiceArray()

    // Nullable Types
    practiceNullableTypes()

    // String Template
    practiceStringTemplate()

    // 2 Control Flow

    // Enumeration
    practiceEnum()

    // Expression and Statement
    practiceExpressionStatement()

    // When Expression
    practiceWhen()

    // When vs IF Expression
    practiceWhenVsIf()

    // While and Do While
    practiceWhileDoWhile()
}

fun setUser(name: String, age: Int) = "Hei $name, you are $age years old"

fun printUser(name: String) {
    println("Your name $name")
}

fun practiceBoolean(now: Int, openHours: Int, closeHours: Int){
    println("")
    // Boolean Disjunction OR
    val isOpen = now >= openHours && now <= closeHours
    // Boolean Negation NOT
    if (!isOpen) {
        println("Office is closed")
    } else {
        println("Office is open")
    }
}

fun practiceNumbers(){
    println("")
    // Numbers
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE
    println("MaxInt $maxInt MinInt $minInt")
    // Number Operation
    println(5+5*4)
    // Number Data Type Conversion
    val stringNumber = "23"
    val intNumber = 3
    println(intNumber + stringNumber.toInt())
    // Readable Number
    val readableNumber = 1_000_000
    println("Readable Number $readableNumber")
}

fun practiceArray() {
    println("")
    // Mix Array, one or more data type
    val mixArray = arrayOf(1, 2, 3, "Oke", true)
    println(mixArray[3])
    // Int Array
    val intArray = intArrayOf(3, 5, 9)
    println(intArray[1])
    // Array with size and lambda
    val anotherIntArray = Array(4, {i -> i * i}) // 0, 1, 4, 9
    println(anotherIntArray[3])
}

fun practiceNullableTypes() {
    println("\nNullable Types Not Printed")

    // Nullable Types
    // val text: String = null // compile time error
    val text: String? = null

    // Accessing Nullable Object
    // val length = text.length // compile time error
    if (text != null) {
        val length = text.length
    }

    // Handling Nullable Object

    // Safe Calls Operator ?.
    text?.length
    // Elvis Operator ?:
    val textLength = text?.length ?: 7
    println("print length or default number (7): $textLength")
    // Non-Null Assertion !!
    // not recommended to use
    // force nullable object to be non-null
    // val textLengthNull = text!!.length
    // println(textLengthNull) // compile not error, but runtime error
}

fun practiceStringTemplate() {
    println("")
    val name = "Fatima"
    val age = 17
    val weight = 51.2
    // Concatenation, not using String Template
    println("My Name " +name)
    // String Template
    println("My Name $name age $age weight $weight")
    // Expression inside String Template
    val hour = 7
    println("Office ${if (hour > 7) "already close" else "is open"}")
}

fun practiceEnum() {
    println("")

    // Accessing Object from Enum Class
    val color: Color = Color.RED
    println(color)

    val colorGreen = ColorInt.GREEN
    println(colorGreen)

    val colorBlue = ColorIntAgain.BLUE
    colorBlue.printValue()

    // Get list of Object in Enum Class
    // using values()
    val colors: Array<Color> = Color.values()
    colors.forEach {
        color -> print(color)
    }

    println("")
    // Get the name of Object in Enum Class
    // using valueOf()
    // beware of Illegal Argument Exception, when argument not match the Enum object, exp. typo to "RE"
    val colorName: Color = Color.valueOf("RED")
    println(colorName)

    // Get list of Object and its name
    // using enumValues() and enumValueOf()
    val myColors: Array<ColorInt> = enumValues()
    myColors.forEach {
        color -> print(color)
    }
    val myColorName: ColorInt = enumValueOf("BLUE")
    println("\nColor Name is $myColorName")

    // Get position each Object in Enum Class
    val colorRed: Color = Color.RED
    println("Position of Color Red is ${colorRed.ordinal}")

    // Check instances of Enum Class
    // using When Expression
    val theColor: Color = Color.BLUE
    // beware warning ‘when' expression on enum is recommended to be exhaustive
    // happened when all objects not listed
    when(theColor) {
        Color.RED -> println("The color is Red")
        Color.GREEN -> println("The color is Green")
        Color.BLUE -> println("The color is Blue")
    }
}

// Enum Class contains Objects
enum class Color {
    RED, GREEN, BLUE
}

// Enum Class with parameter
enum class ColorInt(val value:Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

// Enum Class with Anonymous class for each Object
enum class ColorIntAgain(val value: Int){
    RED(0xFF0000){
        override fun printValue() {
            println("Value of Red is $value")
        }
    },
    GREEN(0x00FF00) {
        override fun printValue() {
            println("Value of Green is $value")
        }
    },
    BLUE(0x0000FF) {
        override fun printValue() {
            println("Value of Blue is $value")
        }
    };
    abstract fun printValue()
}

fun practiceExpressionStatement() {
    println("")

    // IF as Statement
    val openOffice = 7
    val now = 8
    if (now > openOffice)
        println("Office is open")
    else println("Office is close")

    // IF as Expression
    // A statement which has Return
    // the Return can be stored in a variable
    val office = if (now > openOffice) "Office already open" else "Office already closed"
    println(office)

    // Statement
    // Variable delaration is statement
    val value1 = 10
    val value2 = 4
    // Expression
    // Calling function is expression
    sum(value1, value2)
    // Expression inside expression
    // Expression 1 calling sum(), Expression 2 is 1*4
    sum(1, 1*4)
}

fun sum(value1: Int, value2: Int) {
    value1 + value2
}

fun practiceWhen() {
    println("")

    // When Expression
    val value = 7 //other than 6,7,8 print else
    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        // else is optional
        else -> println("value cannot be reached")
    }

    // When Expression with Return
    val myValue = 25
    val stringOfValue = when (myValue) {
        6 -> "my value is 6"
        7 -> "my value is 7"
        8 -> "my value is 8"
        // else is a MUST
        else -> "my value cannot be reached"
    }
    println(stringOfValue)

    // When Expression with curly braces
    val otherValue = 8
    val otherStringOfValue = when (otherValue) {
        6 -> {
            println("Six")
            "other value is 6"
        }
        7 -> {
            println("Seven")
            "other value is 7"
        }
        8 -> {
            println("Eight")
            "other value is 8"
        }
        // else is a MUST
        else -> {
            println("Undefined")
            "other value cannot be reached"
        }
    }
    println(otherStringOfValue)

    // When is used to check Instance type of Object
    val anyType: Any = 100L
    when(anyType) {
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }

    // When is used to check a value in a Range and Collection
    val theValue = 27
    val ranges = 10..50
    when (theValue) {
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }

    // Capture When subject using variable, Kotlin 1.3 up
    val registerNumber = when(val regisNo = getRegisNumber()) {
        in 1..50 -> 10 * regisNo
        in 51 .. 100 -> 100 * regisNo
        else -> regisNo
    }
    println(registerNumber)
}

fun getRegisNumber() = Random.nextInt(100)

fun practiceWhenVsIf() {
    println("")

    // IF Expression
    // NO more than 2 conditions, simple condition
    val anyType: Any = 100L
    if (anyType is Long) {
        println("the value has a Long type")
    } else {
        println("the value is not a Long type")
    }

    // When Expression
    // More than 2 conditions
    when (anyType) {
        is Long -> println("the value has a Long type")
        is Int -> println("the value has an Int type")
        is Double -> println("the value has a Double type")
        else -> println("Undefined")
    }
}

fun practiceWhileDoWhile() {
    println("")

    // While
    // Entry Controlled Loop
    // Condition evaluated first, then the loop runs
    var counter = 1
    while (counter <= 3) {
        println("This is While")
        counter ++ // code to stop the loop
    }
}

