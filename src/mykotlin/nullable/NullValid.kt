package mykotlin.nullable

fun main(){
    val s1 : String = "Always not null"
    var s2 : String ? = "valor"

    if (s2 != null) {
        if(s2.contains("a")){
            s2=null
        }
    }

    println("tam s1 = ${s1.length}")
    if (s2 != null) {
        println("tam s2 =  ${s2.length} ")
    }

    val tam = s2?.length
    println("nuevo tam $tam")

    val s: String?
    s = ""
    val length = s?.length
    println(length)
}