//Array in Kotlin

//TODO : https://www.geeksforgeeks.org/kotlin-array/

fun main(args: Array<String>){

    //misc values
    var arr1 = arrayOf("Kanu","Titu","Soumyajit", 1, 1.2, 4)
    for (i in arr1){
        print("$i ")
    }

    println()

    //<Int> specify the values
    var arr2 = arrayOf<Int>(1,2,3,4,5)
    for (i in arr2){
        print("$i ")
    }

    println()
    //<String> specify the values
    var arr3 = arrayOf<String>("Messi","Ronaldo","Neymar")
    for (i in arr3){
        print("$i ")
    }

    println()
    var exmp1 = arrayOf(1,2,3,4,5)
    //size func
    for (i in 0..exmp1.size-1){
        println(exmp1[i])
    }

    println()
    var exmp2 = arrayOf(1,2,3,4,5)
    //set func
    exmp2.set(0,10) //set 10 in 0th index
    exmp2[3] = 6 // same as set function
    for (i in 0..exmp2.size-1){
        println(exmp2[i])
    }



    println()
    var exmp3 = arrayOf(1,2,3,4,5)
    for (i in 0..exmp3.size-1){
        println(exmp3[i])
    }
    //get function
    //get the value of 1st index
    println("The value of 1st index is "+exmp3.get(1))
    println("The value of 1st index is "+exmp3[1]) // same as get function



}

