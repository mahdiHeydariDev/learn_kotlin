//In Kotlin, the type of a variable is decided by its value:
fun main(){
    val myNum = 5             // Int
    val myDoubleNum = 5.99    // Double
    val myLetter = 'D'        // Char
    val myBoolean = true      // Boolean
    val myText = "Hello"      // String

    /**
     *
     * Data types are divided into different groups:
     *
     * Numbers
     * Characters
     * Booleans
     * Strings
     * Arrays
     *
     */
//    Integer Types
//            Byte
//    The Byte data type can store whole numbers from -128 to 127. This can be used instead of Int or other integer types to save memory when you are certain that the value will be within -128 and 127:
//    The Byte data type can store whole numbers from -128 to 127. This can be used instead of Int or other integer types to save memory when you are certain that the value will be within -128 and 127:
    var age: Byte=85
    println(age)
//    Short
//    The Short data type can store whole numbers from -32768 to 32767:
    var studentsCount:Short=1500
    println(studentsCount)
//    Int
//    The Int data type can store whole numbers from -2147483648 to 2147483647:
    var countryPopulation:Int=80000000
    println(countryPopulation)

//    Long
//    The Long data type can store whole numbers from -9223372036854775807 to 9223372036854775807. This is used when Int is not large enough to store the value. Optionally, you can end the value with an "L":

    var worldPopulation:Long=9000000000L
    println(worldPopulation)


//    Floating Point Types
//    Floating point types represent numbers with a decimal, such as 9.99 or 3.14515.
//
//    The Float and Double data types can store fractional numbers:
    val score:Float=10.5F
    val weight:Double=105.2
    println(score)
    println(weight)


//    Booleans
//    The Boolean data type and can only take the values true or false:

    val isAlive:Boolean=true
    val isMarried:Boolean=false
    println(isAlive)
    println(isMarried)


//    Characters
//    The Char data type is used to store a single character. A char value must be surrounded by single quotes, like 'A' or 'c':
    val openKey:Char='O'
    println(openKey)


//    The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes:
   val introduce:String="Hello every one , my name is mahdi."
    println(introduce)










}
