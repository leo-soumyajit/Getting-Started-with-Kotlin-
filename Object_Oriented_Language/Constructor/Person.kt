package Object_Oriented_Language.Constructor

//TODO : https://www.geeksforgeeks.org/kotlin-constructor/


fun main(){
    val person = Person("Soumyajit",20)
    person.Details()
    val student1 = Student("Titu",18)
    val student2 = Student("Soumyajit")
}

//Primary constructor
class Person(var name : String , var age : Int){
    fun Details(){
        println("Name is : $name and Age is $age")
    }
}

//secondary constructor using constructor keyword
class Student{
    constructor(name : String , age : Int){
        if (age<=18){
            println("$name cant vote")
        }
        else{
            println("$name can vote")
        }
    }
    //constructor overloading
    constructor(name : String){
        println("Name is $name")
    }

}






















