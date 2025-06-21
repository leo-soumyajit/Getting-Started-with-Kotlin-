package Object_Oriented_Language.Inheritance

open class Player(name : String) {
    fun details(){
        println("Its a Derived class")
    }
}

class Messi: Player{
    constructor(name : String,position : String):super(name){
        println("Name is $name and Position is $position")
    }
}

fun main(){
    val obj = Messi("Leo Messi","Right Winger/AMF")
}