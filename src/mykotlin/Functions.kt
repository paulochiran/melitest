package mykotlin

fun main(){
    println(max(13,56))
    println(min(45,65))
    println(topLevel())

    var a = A()
    println(a.member())

    var f1 = other()
    println(f1)
}

fun max(a: Int, b: Int) : Int {
    return (if (a>b) a else b)
}

fun min(a:Int, b : Int) = if (a<b) a else b

fun topLevel() = 1

class A {
    fun member() = 2
}

fun other(){
    fun local() = 3
}