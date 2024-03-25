fun main(){
//    Instead of writing many if..else expressions, you can use the when expression, which is much easier to read.
//
//    It is used to select one of many code blocks to be executed:
    val number:Int=4
    var dayName = when (number){
        1->"one"
        2->"two"
        3->"three"
        4->"four"
        5->"five"
        6->"six"
        7->"seven"
        8->"eight"
        9->"nine"
        10->"ten"
        else ->"more than 10"

    }
    println(dayName)


    val score:Int=15
    var level:Char=when(score){
        15->'B'
        20->'A'
        else ->'C'
    }
    println(level)


}