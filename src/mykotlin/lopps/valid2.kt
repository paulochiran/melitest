package mykotlin.lopps

fun isValidIdentifier2(s: String): Boolean {
    fun isValidCharacter(ch : Char) = ch == '_' || ch.isLetterOrDigit()

    if(s.isEmpty() || s[0].isDigit()) return false

    for(ch in s){
        if(!isValidCharacter(ch)) return false
    }

    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier2("name"))   // true
    println(isValidIdentifier2("_name"))  // true
    println(isValidIdentifier2("_12"))    // true
    println(isValidIdentifier2(""))       // false
    println(isValidIdentifier2("012"))    // false
    println(isValidIdentifier2("no$"))    // false
}