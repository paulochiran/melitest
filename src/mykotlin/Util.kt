@file:JvmName("Util")
package mykotlin

fun main(){
    joinString()
    displaySeparator()
    println()
    displaySeparator('A', 13)
    println()
    displaySeparator('A')
    println()
    println(sum(c=3))
}

fun foo2() = 0

fun joinString(){
    println(listOf('a', 'b', 'c').joinToString(
            separator = "-", prefix = "(", postfix = ")"))

    println(listOf(1,2,3,4,5).joinToString(postfix = "."))

    println(listOf(1,2,3,4,5).joinToString(postfix = ".", separator = ""))
}

fun displaySeparator(character: Char = '*', size :Int =10){
    repeat(size) {
        print(character)
    }
}

fun sum (a: Int = 10, b: Int = 20, c: Int = 30) = a+b+c