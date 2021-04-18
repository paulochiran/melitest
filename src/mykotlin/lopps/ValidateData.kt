package mykotlin.lopps

fun main(){
    println("datos")

    fun validL (c: Char) = c in 'a' .. 'z' || c in 'A'..'Z'

    val palabra = "sfsdfsd33331212"
    var respuesta = true;
    for(c in palabra){
        println("letra $c validacion ${validL(c)}")
       if (!validL(c)){
           respuesta = false
           break;
       }
    }

    println("la cadena es válida: $respuesta")

    //data
    var pair1 :Pair<Char,Double>
    pair1 = 'a' to 1.0
    println("valor del pair $pair1")


}

