package mykotlin

open class Animal {
    var gender: String? = null
    open fun sonido() {
        println("sonido")
    }

    override fun toString(): String {
        return "kotlin.Animal{" +
                "gender='" + gender + '\'' +
                '}'
    }
}