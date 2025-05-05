package Basic_Of_Kotlin.`Control Flow`

import java.util.Scanner

//TODO : https://www.geeksforgeeks.org/kotlin-if-else-expression/

//if expression
//if-else expression
//if-else-if ladder expression
//nested if expression

fun main(){
    val sc = Scanner(System.`in`)
    println("Enter the number")
    val num = sc.nextInt()
    val res = if (num>0){  //here res variable stores the result of if else block
        print("Number is Positive : ")
        num
    }else if (num==0){
        print("Number is Zero : ")
        num
    }else{
        print("Number is Negative : ")
        num
    }
    println(res)
}
