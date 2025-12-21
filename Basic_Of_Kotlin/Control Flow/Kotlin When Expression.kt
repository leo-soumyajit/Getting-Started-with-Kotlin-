package Basic_Of_Kotlin.`Control Flow`

import java.util.Scanner

//TODO docs : https://www.geeksforgeeks.org/kotlin/kotlin-when-expression/

//In Kotlin, when replaces the switch operator of other languages like Java

fun main(){
    var sc = Scanner(System.`in`)
    print("Enter choice")
    var options : Int = sc.nextInt();
    when(options){
        1-> print("Sunday!!")
        2-> print("Monday")
        3-> print("Tuesday")
        4-> print("Wednesday")
        5-> print("Thursday")
        6-> print("Friday")
        7-> print("Saturday")
        else-> print("Noh Invalid Input")
    }



}