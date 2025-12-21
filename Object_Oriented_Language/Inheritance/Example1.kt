
//TODO: https://www.geeksforgeeks.org/kotlin/kotlin-inheritance/

//By default, all classes are final need to use OPEN keyword to inherit it
open class Employee(name : String , age : Int ,
                    salary : Long){

    //open use for also func to override it
    open fun features(){
        //
    }
}

class webDeveloper(name : String ,age : Int ,
                   salary : Long,val empId:String):Employee(name , age , salary){
    init {
        println("Name is $name")
        println("Age is $age")
        println("Salary is $salary")
        features()
    }
    override fun features(){
        println("Hei im a Engineer with expertise in Webdev $empId")
        println()
    }
}
class androidDeveloper(name : String ,age : Int ,
                   salary : Long):Employee(name , age , salary){
    init {
        println("Name is $name")
        println("Age is $age")
        println("Salary is $salary")
        features()
    }
    override fun features(){
        println("Hei im a Engineer with expertise in Android Development")
        println()
    }
}

class iosDeveloper(name : String ,age : Int ,
                   salary : Long):Employee(name , age , salary){
    init {
        println("Name is $name")
        println("Age is $age")
        println("Salary is $salary")
        features()
    }
    override fun features(){
        println("Hei im a Engineer with expertise in IOS Dev")
        println()
    }
}

fun main(){
    val obj1 = webDeveloper("Soumyajit",20,124000.00.toLong(),"EMP111")
    val obj2 = androidDeveloper("Titu",21,125000.00.toLong())
    val obj3 = iosDeveloper("MS Dhoni",44,126000.00.toLong())
}