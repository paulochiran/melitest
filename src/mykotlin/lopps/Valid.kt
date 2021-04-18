package mykotlin.lopps

fun isValidIdentifier(s: String): Boolean {
    var response= false

    if(s == "") {
        return false;
    }


    if(s.startsWith("_")) {
        response=true
    }
    if(!response) {
        for (c in '0' until '9' + 1) {
            if (s.startsWith(c)) {
                response = false
            }
        }
    }

    if(!response) {
        for (c in 'a' until 'z' + 1) {
            if (s.startsWith(c)) {
                response = true
            }
        }
    }

    var carNoPermited = arrayOf("$")

    for (a in carNoPermited){
        if(s.contains(a)){
            response = false
        }
    }

    return response
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}