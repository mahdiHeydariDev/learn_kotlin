fun main(){
//    Kotlin Break
//            The break statement is used to jump out of a loop.
//



    var userGuessed:String=""
    var score=5
    while (score>0){
        println("GUESS:")
        userGuessed= readln()
        if (userGuessed=="mahdi"){

            println("Happy Mappy")
            println("score:$score")
            break
        }else{
            println("WRONG -1 your score is-> $score")
            score--
        }
    }
}