package Basic_Of_Kotlin

import java.util.Scanner

//TODO docs : https://www.geeksforgeeks.org/kotlin-type-conversion/

//In Kotlin, the helper function can be used to explicitly convert one data type to another data type.
//toByte()
//toShort()
//toInt()
//toLong()
//toFloat()
//toDouble()
//toChar()

fun main(){
    println((65.toChar()))
    println('A'.code) //A.toInt() same
    println(22.toFloat())
    println(10L.toInt())
    println(10.00.toInt())
}