package mykotlin.cast

fun main(){
    var s : String? ="1"
    //s=null
    try {
        val n = s as Int?
        println(n)
    }
    catch (e: Exception){
        println("Error e")
    }

    val intval: Int? = s?.toInt()
    println("parse int $intval")

    if (s is String){
        println(s.toUpperCase())
    }

    println((s as? String)?.toUpperCase())

}