package Basic_Of_Kotlin.Functions_Kotlin

//same name but diff params or diff return type

fun main(args: Array<String>){
    println(addition(10,20,20))
    println(addition(10,20))
}

fun addition(a:Int , b:Int ) : Int{
    return a+b
}

fun addition(a:Int , b:Int , c:Int):Int{
    return a+b+c
}


