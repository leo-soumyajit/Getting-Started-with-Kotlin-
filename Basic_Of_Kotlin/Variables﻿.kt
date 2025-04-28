package Basic_Of_Kotlin

fun main(){
    //Read-only variables with val
    //Mutable variables with var

    val name = "Soumyajit"
    //name+="banerjee" gives error as val variable cant be reassigned
    var age = 20
    age+=1 //var variable can be reassigned
    println("Name is : "+name)
    println("Age is : "+age)

}

//https://kotlinlang.org/docs/kotlin-tour-hello-world.html#variables