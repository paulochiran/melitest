package mykotlin.extension

fun sum(lista: List<Int>):Int{
    var result =0
    for (i in lista){
        result+= i
    }
    return result
}

fun main(){
    val sum = sum(listOf(10,20,30,40))
    println("suma $sum")
}