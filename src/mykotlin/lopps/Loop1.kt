package mykotlin.lopps

fun main() {
    for (i in 1..3) {
        println("primer: $i")
    }
    for (i in 6 downTo 0 step 2) {
        println("segundo: $i")
    }

    for (ch in "abc") {
        print(ch + 1)
    }
    println()
    for (c in '0' until  '9'+1) {
        print(c)
    }

    for (c in 'a' until 'z'+1) {
        print(c)
    }

    println()
    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))
}