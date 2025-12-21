package Practice

fun main(){
//    val obj = Employee("Souwstika",123)
    val std1 = Student("Swastika",17)
    val std2 = Student("Swastika")
}

class Employee(var name : String , var empId : Int){

    init {
        println("Name is $name")
        println("Employee id is $empId")
    }
}
class Student{
    constructor(name : String, age : Int){
        if (age<18){
            println("Cant vote");
        }else{
            println("Can vote")
        }
    }
    constructor(name: String){
        println("Name is $name")
    }
}
