package Object_Oriented_Language.GetterSetters

//TODO : https://www.geeksforgeeks.org/kotlin/kotlin-setters-and-getters/


fun main(){
    val obj = Company()
    obj.name = "GeeksForGeeks"
    println(obj.name)
}

class Company{
    var name : String = "DefaultValue"
        //this piece of code will be auto generated in background we don't need to write this
        get() = field
        set(value) {
            field = value
        }
}