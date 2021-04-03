package mykotlin


fun main(args : Array<String>){
    println("First ${foo()}, second ${foo()}")

    val mutableList1 = mutableListOf<String>("Java")
    mutableList1.add("Kotlin")
    println(mutableList1)
}

fun foo(): String {
    println("Calculating foo..")
    return "foo"
}