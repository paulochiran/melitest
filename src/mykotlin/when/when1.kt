package mykotlin.`when`

import java.lang.Integer.parseInt


fun main(args: Array<String>) {
    var x = 1;
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }
    println("1. ----------------------------------")
    var s ="1"
    when (x) {
        parseInt(s) -> println("s encodes x")
        else -> println("s does not encode x")
    }
    println("2. ----------------------------------")
    var validNumbers = intArrayOf(1, 2, 3, 40)
    x=400
    when (x) {
        in 1..10 -> print("x is in the range")
        in validNumbers -> print("x is valid")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
    println("")
    println("3. ----------------------------------")
}
