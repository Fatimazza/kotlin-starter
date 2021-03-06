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

    // Range
    practiceRange()

    // For
    practiceFor()

    // Break and Continue
    practiceBreakContinue()

    // 3 Data Class & Collection

    // Data Class
    practiceDataClass()

    // Collections
    // An object that can store a collection of other objects
    // other object ... including Data Class

    // Object inheritance of Collections are
    // List, Set, Map, Sequences

    // Collection is Immutable by default
    // Always use immutable collection interfaces ( List , Set , Map )
    // to declare Collections which are not mutated
    // Mutable Collections is not recommended
    // due to the unpredictable result when the collection modified by > 1 process

    // List, Set, Map execute Eager Evaluation / Horizontal Evaluation
    // evaluate all item in a collection
    // this affect to performance

    // Sequences execute Lazy Evaluation / Vertical Evaluation
    // evaluate item needed only

    // List
    practiceList()

    // Set
    practiceSet()

    // Map
    practiceMap()

    // Collection Operation
    practiceCollectionOperation()

    // Sequence
    practiceSequence()
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
    // beware warning ???when' expression on enum is recommended to be exhaustive
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

    // While and Do While cannot be used in Range

    // While
    // Entry Controlled Loop
    // Condition evaluated first, then the loop executed
    var counter = 1
    while (counter <= 3) {
        println("This is While")
        counter ++ // code to stop the loop
    }

    // Do While
    // Exit Controlled Loop
    // Loop executed first, then condition is evaluated
    counter = 1
    do {
        println("This is Do While")
        counter++ // stop the loop, prevent infinite loop
    } while (counter<=2)
}

fun practiceRange() {
    println("")

    // Range
    // Created using .. operator
    val rangeInt = 1..10
    // Step define gap between 2 values
    // Default step is 1
    println(rangeInt.step)

    // Change Range Step
    val rangeIntStep = 1..10 step 2
    // Print All Range Values
    rangeIntStep.forEach {
        print("$it ")
    }
    println()

    // Create Range using rangeTo // ascending
    val rangeUp = 1.rangeTo(3)
    rangeUp.forEach {
        print("$it ")
    }
    println()

    // Reverse Range to descending order
    val rangeDown = 9.downTo(1).step(3)
    rangeDown.forEach {
        print("$it ")
    }
    println()

    // Check value in Range
    // if (1 <= 3 && 3 <= 5){ println("3 is in Range") }
    val fiveToOne = 5.downTo(1)
    if (3 in fiveToOne) {
        println("3 is in Range")
    }

    // Check value not in Range
    val fiveToTen = 5.rangeTo(10)
    if (3 !in fiveToTen) {
        println("3 is NOT in Range")
    }

    // Char Range
    // Also available Int Range, Long Range
    val charRange = 'A'.rangeTo('F')
    charRange.forEach { print("$it ") }
}

fun practiceFor() {
    println()

    // For Loop
    // Can be used Ranges, Collection, and Arrays
    val ranges = 1..3
    for (i in ranges) {
        println("value is $i")
    }

    // For used in Ranges using RangeTo and Step
    val myRange = 6.rangeTo(10) step 2
    for (i in myRange) {
        println("My Range value is $i")
    }

    // For Each, lambda expression to perform Loop
    // Alternative of For
    val myRange2 = 6.rangeTo(10) step 2
    for (i in myRange2) {
        println("My Range 2 value is $i")
    }

    // Access index of each element of Ranges
    // Using For, and withIndex()
    val rangeWithIndex = 1.rangeTo(5) step 2
    for ((index, value) in rangeWithIndex.withIndex()) {
        println("value $value with index $index")
    }

    // Access index of each element of Ranges
    // Using For Each Indexed
    val rangeWithIndex2 = 5.rangeTo(10) step 2
    rangeWithIndex2.forEachIndexed { index, value ->
        println("the value $value with index $index")
    }

    // For Each Indexed
    // A Lambda Expression which Argument is NOT USED, change to _
    rangeWithIndex2.forEachIndexed { index, _ ->
        println("the index $index")
    }
}

fun practiceBreakContinue() {
    println()
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    // Break
    // to stop execution of loop in certain condition
    for (i in listOfInt) {
        if (i == null) break
        print(i)
    }

    // Continue
    // to continue with the next loop iteration
    println()
    for (i in listOfInt) {
        if (i == null) continue
        print(i)
    }

    // Break and Continue with label
    // to terminate and skip the iteration to the desired labeled loop
    // each expression has a label with identifier, exp @foo and @bar

    // Break with label
    println()
    outerLoop@ for (i in 1..5) {
        println("Outside Loop - $i")

        innerLoop@ for (j in 1..5) {
            print("Inside Loop - $j || ")
            if ( j > 2) break@outerLoop
        }
    }

    // Continue with label
    outerLoop@ for (i in 1..3) {
        println("\nOut Loop - $i")

        innerLoop@ for (j in 1..3) {
            print("Ins Loop - $j || ")
            if ( j > 1) continue@outerLoop
        }
    }
}

// Data Class & Collection

fun practiceDataClass() {
    println("\n")
    // Data Class
    // A class that provide functionality to manage data

    // Create object from Regular Class and Data Class
    val user = User("fatima", 17)
    val dataUser = DataUser("fatima", 17)

    // Compare Regular Class to Data Class

    // Contain package name, class name, & class' memory address
    println(user)
    // Contain class name, all property & value inside the class
    println(dataUser)

    val userMe = UserMe("fatima", 17)
    println(userMe)

    // Object Equals Comparison
    println()
    val dataUser2 = DataUser("fatima", 17)
    val dataUser3 = DataUser("magista", 16)
    println("dataUser equals dataUser2 = ${dataUser.equals(dataUser2)}")
    println("dataUser equals dataUser3 = ${dataUser.equals(dataUser3)}")

    val user2 = User("fatima",17)
    val user3 = User("magista", 16)
    // Result always false, even though the data is same
    // Cause regular class compares the memory reference (object location)
    // instead of the content
    println("user equals user2 = ${user.equals(user2)}")
    println("user equals user3 = ${user.equals(user3)}")

    // Object Equal Comparison - after manually added
    val userMe2 = UserMe("fatima", 17)
    val userMe3 = UserMe("magista", 16)
    println("userMe equals userMe2 = ${userMe.equals(userMe2)}")
    println("userMe equals userMe3 = ${userMe.equals(userMe3)}")

    // Copy and Modify Data Class
    val dataUser4 = dataUser.copy()
    val dataUser5 = dataUser.copy(age = 22)
    println()
    println(dataUser4)
    println(dataUser5)

    // Destructuring Declarations
    // Parse object properties into variables
    val myDataUser = DataUser("fitimizzi", 7)
    val name = myDataUser.component1()
    val age = myDataUser.component2()
    println()
    println("My name is $name, I am $age years old")
    // Make several Variables from an Object directly
    val (myName, myAge) = myDataUser
    println("My name is .. $myName, I am .. $myAge years old")
    // Add Behaviour in Data Class, in the form of a Function (1)
    val dataUserMe = DataUserMe("fitimizzi", 3)
    dataUserMe.intro()
}

// Compare Regular Class to Data Class
class User(val name: String, val age: Int)
data class DataUser(val name: String, val age: Int)

// Regular class with additional functions
// which already available in data class
class UserMe(val name: String, val age: Int) {

    // Add toString() function to print information of UserMe object
    override fun toString(): String {
        return "UserMe(name=$name, age=$age)"
    }

    // Add equals() function to compare object data
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as UserMe

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    // Add hashcode() function
    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

// Add behaviour in Data Class, in the form of a function (2)
data class DataUserMe(val name: String, val age: Int) {
    fun intro(){
        println("My name is >> $name, I am >> $age years old")
    }
}

// Collections - List
fun practiceList() {
    println()
    // List
    // Collection store same & different data type
    // Immutable, data can't be changed or modified

    // Same data type
    val numberList : List<Int> = listOf(1, 2, 3, 4, 5)
    val numberListAgain = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c')

    // Different data type
    val anyList = listOf('a', "Kotlin", 3, true)
    // including Data Class, in this case User()
    val anyListAgain = listOf('a', "Kotlin", 3, true, User("za", 18))

    // Accessing data in List
    numberList.forEach { print("$it ") }
    println()
    anyListAgain.forEach { print("$it ") }
    println()
    println(anyList[3]) // index start from 0
    // println(anyList[5]) // Array Index Out Of Bounds

    // Modify value inside a List
    // Convert default Immutable List to Mutable, using mutableListOf()
    val myAnyList = mutableListOf('a', "Kotlin", 3, true)
    myAnyList.forEach{ print("$it ") }
    // Add item at the end of a List
    myAnyList.add('i')
    // Add item in certain index
    myAnyList.add(1, "love")
    // Change item value
    myAnyList[3] = 5
    // Delete item based on Array index
    myAnyList.removeAt(0)
    println()
    myAnyList.forEach{ print("$it ") }
}

// Collections - Set
fun practiceSet() {
    println("\n")

    // Set
    // Collection store unique value, no duplicate data
    // Immutable, data can't be changed or modified
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    // Set only print unique value
    integerSet.forEach { print("$it ") }

    // Order in Set is not important
    // different order considered the same
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println()
    println(setA == setB) // will be true

    // Check a value inside of a Set
    println(9 in setA)
    println(2 in setB)

    // Union (gabungan) of two Set
    val setC = setOf(1, 3, 5, 6, 9)
    val union = setA.union(setC)
    println(union)
    // Intersect (irisan) of two Set
    val intersect = setB.intersect(setC)
    println(intersect)

    // Modify value inside a Set
    // Convert default Immutable Set to Mutable, using mutableSetOf()
    // Only adding and deleting, CANNOT change value
    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    println(mutableSet)
    // Cannot change value
    // mutableSet[2] = 6
    // Add item in the end of a Set
    mutableSet.add(6)
    // Delete item with certain value
    mutableSet.remove(1)
    println(mutableSet)
}

// Collections - Map
fun practiceMap() {
    println()

    // Map
    // Collection store data with format key-value pairs
    // Format: Key to Value
    // Immutable, data can't be changed or modified

    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    println("value of key Jakarta is .. " +capital["Jakarta"])
    println("value of key Jakarta is ... " +capital.getValue("Jakarta"))
    println(capital["Norway"]) // will be null
    // println(capital.getValue("Norway")) // No Such Element Exception

    // Show all Keys in a Map
    // mapKey returns a Set, cause Key should be unique
    val mapKey = capital.keys
    println(mapKey)
    // Show all Value in a Map
    // mapValues returns a Collection as data type
    val mapValues = capital.values
    println(mapValues)

    // Modify a Map
    // Convert Immutable Map to Mutable using toMutableMap()
    // Adding key-value pairs
    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Oslo", "Norway")
    mutableCapital.put("Berlin", "Germany")
    mutableCapital.forEach { key, value -> println("key $key value $value")  }
}

// Collection Operation
fun practiceCollectionOperation() {
    println()

    // Filter and Filter Not
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7)
    // Filter even number, divisible by 2
    val evenList = numberList.filter { it % 2 == 0 }
    evenList.forEach { print("$it ") }
    // Filter odd number
    println()
    val oddList = numberList.filterNot { it % 2 == 0 }
    oddList.forEach { print("$it ") }

    // Map
    // Create new collection from the result of a function
    println()
    val multipliedBy3 = numberList.map { it * 5 }
    multipliedBy3.forEach { print("$it ") }

    // Count
    // Count all items inside a Collection
    println()
    val myNumberList = listOf(1, 3, 5, 7, 8, 10)
    println(myNumberList.count())
    // Count with a Lambda Expression as a condition
    println(myNumberList.count { it % 5 == 0})

    // Find and FirstOrNull
    // Find first item based on condition
    // When data not found, it returns null
    val numList = listOf(1, 2, 3, 4, 5, 6, 7)
    val firstOddNumber = numList.find { it % 2 == 1 }
    println("first odd number $firstOddNumber")
    val firstOrNullNumber = numList.firstOrNull { it % 8 == 0 }
    println("first or null number $firstOrNullNumber")
    // LastOrNull
    // Find last item based on condition
    val lastNumber = numList.lastOrNull()
    println("last number $lastNumber")

    // First and Last
    // Filter first and last item of collection
    // Can be used with Lambda Expression as the condition
    val moreThan5 = numList.first{ it > 5}
    println(moreThan5)
    val lastLessThan5 = numList.last { it < 5 }
    println(lastLessThan5)
    // If the condition not fulfilled, the result is Null
    val moreThan10 = numList.find { it > 10 }
    println(moreThan10) // Null

    // Sum
    // Sum up each data in Collection with Number type data
    val theNumberList = listOf(1, 3, 4, 6, 8)
    val totalNumber = theNumberList.sum()
    println("totalNumber $totalNumber")

    // Sorted
    // Sort all items in a Collections
    // Ascending Sort by default
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)
    // Descending Sort
    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)
}

// Collections - Sequences
fun practiceSequence() {
    println()
    // Sequence
    // Collection which execute Lazy Evaluation

    // Difference between List and Sequence
    // List
    val list = (1..100).toList()
    list.filter { it % 5 == 0 }.map { it * 2 }.forEach { print("$it ") }
    // all items > filtering all > mapping all > print
    // Sequence, convert using asSequence()
    println()
    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { print("$it ") }
    // all items > filtering > only filtered item > mapping > print

    println()
    // Create Sequence Object (unlimited) using generateSequence()
    // 2 parameters: first item in Sequence, lambda expression of item changes
    val sequenceNumber = generateSequence(1) { it + 3}
    // using take() to prevent infinite loop
    sequenceNumber.take(7).forEach { print("$it ") }
}

