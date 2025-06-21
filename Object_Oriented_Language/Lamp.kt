package Object_Oriented_Language

class Lamp {
    //property
    private var isOn : Boolean = false

    //member functions
    fun turnOn() {
        isOn = true
    }
    fun turnOff(){
        isOn = false
    }

    fun isLampOn(lamp : String){
        if (isOn==false){
            println("$lamp Lamp is off")
        }else{
            println("$lamp Lamp is on")
        }
    }
}
fun main(){
    val obj1 = Lamp()
    val obj2 = Lamp()
    obj1.turnOn()
    obj1.turnOff()
    obj1.isLampOn("obj1")

}