package mykotlin


fun main (args : Array<String>){
    val name = if (args.size>0) args[0] else "Kotlin"
    println("1 Hello, $name !!")
    main2()
    val arreglo = arrayOf("B","C" )
    main3(arreglo)
}

fun main2 (){
    var valor="dddd"

    val name  = "Kotlin"
    println("2 Hello, $name !!!")
}

fun main3 (args : Array<String> ){
    val name  = if (args.size>0) args[0] else "Kotlin"
    println("2 Hello, $name, ${args.getOrNull(1)}, ${args.getOrNull(2)}")
}