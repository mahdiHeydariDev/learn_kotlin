fun main(){
//    Loops
//    Loops can execute a block of code as long as a specified condition is reached.
//
//    Loops are handy because they save time, reduce errors, and they make code more readable.
//
//    Kotlin While Loop
//    The while loop loops through a block of code as long as a specified condition is true:
    var counter:Int=0
    while (counter<=10){
        println(counter)
        counter++
    }

//    The Do..While Loop
//    The do..while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
var counter2:Int=0

    do{
        println("With do...while $counter2")
        counter2++
    }while(counter2<=10)



}