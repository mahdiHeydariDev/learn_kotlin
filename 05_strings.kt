fun main(){
    //Strings
    var name:String="Mahdi"
    var family:String="Heydari"
//    Access a String
//    To access the characters (elements) of a string, you must refer to the index number inside square brackets.
//
//    String indexes start with 0. In the example below, we access the first and third element in txt:
    println(name[0])
    println(name[1])
    println(name[2])
    println(name[3])
    println(name[4])

//    String Length
//            A String in Kotlin is an object, which contain properties and functions that can perform certain operations on strings, by writing a dot character (.) after the specific string variable. For example, the length of a string can be found with the length property:
println("Family length:->${family.length}")
//    String Functions
//            There are many string functions available, for example toUpperCase() and toLowerCase():
    println("family with .upperCase :-> ${family.uppercase()}")
    println("Mahdi with .lowerCase ${name.lowercase()}")

//    Comparing Strings
//            The compareTo(string) function compares two strings and returns 0 if both are equal:

    var passWord:String="dsdjdnfcbcvkadjiAADSSAD@3EW2ESCDMK"
    var enteredPassWord:String="dsdjdnfcbcvkadjiAADSSAD@3EW2ESCDM"
    println("differents are:->  ${passWord.compareTo(enteredPassWord)} char")

//    Finding a String in a String
//            The indexOf() function returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
println("Index of h in Mahdi :->${name.indexOf('h')}")

//    Quotes Inside a String
//            To use quotes inside a string, use single quotes ('):
    val letter:String="it's a letter"
    println(letter)

//    String Concatenation
//            The + operator can be used between strings to add them together to make a new string. This is called concatenation:
var firstName:String="mahdi"
    var lastName:String = "Heydari"
    println(firstName+" "+lastName)













}