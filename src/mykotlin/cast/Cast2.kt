package mykotlin.cast

fun main(args: Array<String>) {
    //val s = TODO()
    val s = "abc"
    println(s as? Int)    // null
    println(s as Int?)    // exception
}