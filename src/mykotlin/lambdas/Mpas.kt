package mykotlin.lambdas

fun main(){
    val mapNumbers = mapOf(1 to "x", 2 to "y", -1 to "zz")

    mapNumbers.mapValues { (key,value) -> println("1. llave $key, valor $value")}
    println("------------------")
    mapNumbers.mapValues { entry -> println("2. llave ${entry.key}, valor ${entry.value}")}
    println("------------------")
    mapNumbers.mapValues { (_,value) -> println("3. valor $value")}
}