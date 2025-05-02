package Basic_Of_Kotlin

//TODO DOCS : https://www.geeksforgeeks.org/kotlin-operators/
//TODO DOCS : https://kotlinlang.org/docs/kotlin-tour-basic-types.html


//Assignment Operators –
//Operators	Expression	    Translate to
// +=	    a = a + b	    a.plusAssign(b) > 0
// -=	    a = a – b	    a.minusAssign(b) < 0
// *=	    a = a * b	    a.timesAssign(b)>= 0
// /=	    a = a / b	    a.divAssign(b) <= 0
// %=	    a = a % b	    a.remAssign(b)

fun main(){
    var a = 10
    var b = 10
    a+=b
    println(a)
    a-=b
    println(a)
    a*=b
    println(a)
    a/=b
    println(a)
}
