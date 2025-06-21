package Basic_Of_Kotlin.`Control Flow`

//TODO docs : https://www.geeksforgeeks.org/kotlin-while-loop/


//The syntax of while loop-
//while(condition) {
//    // code to run
//}

fun main(){
//    var num : Int = 1
//    while(num<=10){
//        println(num)
//        num++
//    }
    sumOfNNumbers()
}
fun sumOfNNumbers(){
    var sum = 0
    var i = 1;
    while(i<=100){
        sum +=i;
        i++
    }
    print("$sum ")
}

























