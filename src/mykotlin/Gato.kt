package mykotlin

internal class Gato(var nombre: String, gender: String?) : Animal() {
    override fun sonido() {
        println("Miauuu")
    }

    override fun toString(): String {
        return "kotlin.Gato{" +
                "gender='" + gender + '\'' +
                ", nombre='" + nombre + '\'' +
                '}'
    }

    init {
        super.gender = gender
    }
}