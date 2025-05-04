package Basic_Of_Kotlin

import java.util.Scanner

//Todo docs : https://kotlinlang.org/docs/standard-input.html

fun main(){
    val sc = Scanner(System.`in`)
    println("Enter Number : ")
    var num : Int = sc.nextInt() //for integer

    sc.nextLine()
    //Whenever you use nextInt() (or nextDouble(), nextFloat(), etc.)
    // and then want to read a full line of text with nextLine(),
    // you must add an extra sc.nextLine() in between to consume the leftover newline.

    print("Enter Your Name : ")
    var str : String = sc.nextLine() //for full String
    println("Your Name is $str and age is $num")
}