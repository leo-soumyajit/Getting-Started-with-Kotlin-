package Basic_Of_Kotlin.Operators

//TODO DOCS : https://www.geeksforgeeks.org/kotlin-operators/
//TODO DOCS : https://kotlinlang.org/docs/kotlin-tour-basic-types.html


//Logical Operators –
//Operators	    Meaning	                                    Expression
//&&	        return true if all expressions are true	    (a>b) && (a>c)
//||	        return true if any of expression is true	(a>b) || (a>c)
//!	            return complement of the expression	         a.not()


fun main(){
    //leap year
    var year = 2200
    if (year.rem(4) == 0  && (year.rem(400)==0 || year.rem(100)!=0)){
        println("Yes its a leap year")
    }else{
        println("No! its not a leap year")
    }
}