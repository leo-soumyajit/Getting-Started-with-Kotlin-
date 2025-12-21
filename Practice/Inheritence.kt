package Practice



open class Emp(name : String, age : Int){
    open fun features(){
        //
    }
}

class WebDev: Emp{

    val sal : Int=0;
    constructor(name: String, age : Int, sal:Int):super(name,age){
        println("Name is $name")
        println("Age is $age")
        println("Salary is $sal")
        features()
    }
    override fun features(){
        println("Hei im a full stack web dev $sal");
    }
}

fun main() {
    var obj = WebDev("Titu",21,10000)
}