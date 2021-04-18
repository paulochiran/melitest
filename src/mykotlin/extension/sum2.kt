package mykotlin.extension


fun List<Int>.sum2():Int{
    var result =0
    for (i in this){
        result+= i
    }
    return result
}

fun main(){
    val sum = listOf(10, 20, 30, 41).sum2()
    println("suma $sum")
}