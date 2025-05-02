package Basic_Of_Kotlin

//TODO DOCS : https://www.geeksforgeeks.org/kotlin-operators/
//TODO DOCS : https://kotlinlang.org/docs/kotlin-tour-basic-types.html

//Arithmetic Operators –
//Operators	Meaning	Expression	Translate to
//+	Addition	a + b	a.plus(b)
//–	Subtraction	a – b	a.minus(b)
//*	Multiplication	a * b	a.times(b)
///	Division	a / b	a.div(b)
//%	Modulus	a % b	a.rem(b)

fun main(){
    var a = 20
    var b : Int = 10 //explicitly defined the type of variable
    println("a + b is "+(a+b))
    println("a + b is ${a.plus(b)}") //Translate to

    println("a - b is "+(a-b))
    println("a - b is ${a.minus(b)}")

    println("a * b is "+(a*b))
    println("a * b is ${a.times(b)}")

    println("a / b is "+(a/b))
    println("a / b is ${a.div(b)}")


}

