package Basic_Of_Kotlin.`Control Flow`

//TODO docs : https://www.geeksforgeeks.org/kotlin-for-loop/

//In Kotlin, for loop is used to iterate through the following because all of them provides iterator.

//Range
//Array
//String
//Collection

fun main(){
    //range 1..10 means 1 to 10
    for (i in 1..10){
        if (i.rem(2)==0){
            print("$i ")
        }
    }
    println()
    //downTo for reverse 10 to 1
    for (i in 10 downTo 1){
        print("$i ")
    }
    println()
    //step for skipping
    for (i in 10 downTo 1 step 3) {
        print("$i ")
    }
}
