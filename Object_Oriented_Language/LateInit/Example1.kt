package Object_Oriented_Language.LateInit

fun main(){
    val obj1 = LateInit("Soumyajit",20)
    //here we initialise it later
    obj1.profession="Engineer"
    println(obj1.profession)

}

class LateInit(var name : String , var age : Long){
    //by using lateinit we can initialise it later on
    lateinit var profession : String
    init {
        if (age <= 18){
            println("$name can vote")
        }else{
            println("$name can't vote")
        }
    }


}