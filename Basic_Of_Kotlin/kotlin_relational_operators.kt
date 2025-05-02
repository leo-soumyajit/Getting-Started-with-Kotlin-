package Basic_Of_Kotlin

//TODO DOCS : https://www.geeksforgeeks.org/kotlin-operators/
//TODO DOCS : https://kotlinlang.org/docs/kotlin-tour-basic-types.html


//Relational Operators –
//Operators	Meaning	    Expression	        Translate to
//>	greater than	    a > b	            a.compareTo(b) > 0
//<	less than	        a < b	            a.compareTo(b) < 0
//>= greater than or equal to	a >= b	    a.compareTo(b) >= 0
//<= less than or equal to	a <= b	        a.compareTo(b) <= 0
//== is equal to	         a == b	        a?.equals(b) ?: (b === null)
//!= not equal to	         a != b	        !(a?.equals(b) ?: (b === null)) > 0

fun main(){
    var a : Int = 20
    var b : Int = 20
    println(a.compareTo(b)<0) // a<b
    println(a.compareTo(b)>0) // a>b

    println(a.compareTo(b)>=0) // a>=b
    println(a.compareTo(b)<=0) // a<=b

    println(a?.equals(b) ?: (b===null)) //a==b
    println(!(a?.equals(b) ?: (b===null))) //!=0

    var isEqual = (a?.equals(b) ?: (b===null))
    println("a and b is equals to each other : ${!isEqual}") //we can use this way also


    val c : String = "kanu"
    val d  = "kanu"
    println(c.equals(d)) //.equals for String comparison like in Java
    println(c==d)



}