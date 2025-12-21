package Practice

fun main(){
    var arr1 = arrayOf("Kanu","Titu","messi",1,2.2)
    for (i in arr1){
        print("$i ")
//        print(" "+i)
    }
    println()
    var arrInt = arrayOf<Int>(1,2,3,4,5,6,1,2,3);
    for (i in arrInt){
        print("$i ")
//        arrInt.sort()
////        println()
//        print("$i ")
    }
    println()

    var arrStr = arrayOf<String>("Titu","Kanu","Messi");
    for (i in arrStr){
        print("$i ")
    }
    println()
    var arr2 = arrayOf(1,2,3,4,5,6);
    for (i in 0..arr2.size-1){
        print(" "+arr2[i])
    }
    println()
    arr2.set(0,199)
    print(arr2.get(0))
}