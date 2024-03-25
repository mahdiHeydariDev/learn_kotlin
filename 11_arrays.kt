fun main(){
//    Kotlin Arrays
//            Arrays are used to store multiple values in a single variable, instead of creating separate variables for each value.
//
//    To create an array, use the arrayOf() function, and place the values in a comma-separated list inside it:
var students= arrayOf("Mahdi","Taha","John","Jimmy")
//    Access the Elements of an Array
//            You can access an array element by referring to the index number, inside square brackets.
//
//    In this example, we access the value of the first element in students:
    println(students[0])
    println(students[1])
//    Change an Array Element
//            To change the value of a specific element, refer to the index number:
    students[2]="David"
    println(students[2])
//    Array Length / Size
//            To find out how many elements an array have, use the size property:
    println("Size of students array is ${students.size}")

//    Check if an Element Exists
//    You can use the in operator to check if an element exists in an array:
    if ("Mahdi" in students){
        println("Mahdi is great")
    }

//    Loop Through an Array
//            Often when you work with arrays, you need to loop through all of the elements.
//
//    You can loop through the array elements with the for loop, which you will learn even more about in the next chapter.
//
//    The following example outputs all elements in the cars array:
    for(student in students){
        println(student)
    }









}