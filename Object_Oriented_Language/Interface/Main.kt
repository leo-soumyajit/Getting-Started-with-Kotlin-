package Object_Oriented_Language.Interface

//TODO: https://www.geeksforgeeks.org/kotlin/kotlin-interfaces/

interface Vehicle{
    fun start();
    fun stop();
}

interface CarType{
    fun publicVehicles();

    fun privateVehicles();

}

class Car: Vehicle, CarType{
    override fun start() {
        println("The Car has started")
    }
    override fun stop() {
        println("The Car has stopped")
    }

    override fun publicVehicles() {

    }

    override fun privateVehicles() {

    }
}


interface FirstInterface {
    // 'b' has a default value of 5
    fun add(a: Int, b: Int = 5): Int
    fun print() {
        println("This is a default method defined in the interface")
    }
}

class InterfaceDemo : FirstInterface {
    override fun add(a: Int, b: Int): Int {
        return a + b
    }
    override fun print() {
        super.print()
        println("It has been overridden")
    }
}

fun main(){
//    val obj = Car();
//    obj.start()
//    obj.stop()
    val demo = InterfaceDemo()
    println("Sum is ${demo.add(5)}")    // Only 'a' provided; 'b' defaults to 5
    println("Sum is ${demo.add(5, 10)}") // Both 'a' and 'b' provided
    // Calls the overridden print() in InterfaceDemo
    demo.print()

}