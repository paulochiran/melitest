package mykotlin.nullable

fun main() {

    var s: String? = "valor"

    if (s != null) {
        if(s.contains("a")){
            s=null
        }
    }


    if(s == null) return

    println(s.length)
}