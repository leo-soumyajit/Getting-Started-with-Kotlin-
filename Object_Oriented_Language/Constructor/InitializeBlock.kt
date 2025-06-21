package Object_Oriented_Language.Constructor

//Init block
fun main(){
    val obj = Employee("Soumyajit",166)

}
class Employee(var name : String , var emp_Id : Long){
    val fname : String
    var employeeId : Long
    init {
        fname = name
        employeeId = emp_Id
        println("Name is $fname")
        println("Employee Id is $employeeId")
    }

}