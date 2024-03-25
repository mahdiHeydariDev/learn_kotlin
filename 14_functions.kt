fun main(){
//    A function is a block of code which only runs when it is called.
//
//    You can pass data, known as parameters, into a function.
//
//    Functions are used to perform certain actions, and they are also known as methods.
sayHello()
    sayHelloToPerson("Taha")
    sayHelloToFullName("mahdi","heydari")
    println(addNumbers(10,75))



}
//Create Your Own Functions
//To create your own function, use the fun keyword, and write the name of the function, followed by parantheses ():
fun sayHello(){
    println("Hello Mahdi")
}
//Function Parameters
//Information can be passed to functions as parameter.
//
//Parameters are specified after the function name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma. Just note that you must specify the type of each parameter (Int, String, etc).
fun sayHelloToPerson(name:String){
    println("Hello $name")
}
//Multiple Parameters
//You can have as many parameters as you like:
fun sayHelloToFullName(firstName:String,lastName:String){
    println("Hello $firstName $lastName")
}
//Return Values
//In the examples above, we used functions to output a value. In the following example, we will use a function to return a value and assign it to a variable.
//
//To return a value, use the return keyword, and specify the return type after the function's parantheses (Int in this example):
fun addNumbers(a:Int,b:Int):Int{
    return  a+b;
}


