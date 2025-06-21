package Basic_Of_Kotlin.Functions_Kotlin

//TODO : https://www.geeksforgeeks.org/kotlin/kotlin-functions/
// Block of code used to perform some tasks

//fun name(){
    //do somthing
// }

fun main(args: Array<String>){
    println("Sum of two number is : "+add(10,20))
    println("Multiply of two number is : "+mul(10,20))
    noReturn(120,20)
}
fun add(a : Int , b : Int ): Int{
    return a+b;
}

//A function body can be an expression. Its return type is inferred.
//Used for oneline function
fun mul(a : Int , b : Int) = a*b

//Void in Java -> Unit in Kotlin same purpose no return type
//we can omit Unit
fun noReturn(a:Int , b:Int) : Unit{
    print("Substraction of $a and $b is ${a-b}")
}
















