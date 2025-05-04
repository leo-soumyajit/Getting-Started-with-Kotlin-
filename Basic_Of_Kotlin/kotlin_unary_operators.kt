package Basic_Of_Kotlin

//TODO DOCS : https://www.geeksforgeeks.org/kotlin-operators/
//TODO DOCS : https://kotlinlang.org/docs/kotlin-tour-basic-types.html


//Unary Operators –
//Operators	    Expression	    Translate to
//++	        ++a or a++	    a.inc()
//—	            –a or a–	    a.dec()

fun main(){
    var x : Int = 10
    var y : Int = 20

    x++
    --y
    println(x.inc())
    println(y)

}