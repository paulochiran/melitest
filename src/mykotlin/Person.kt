package mykotlin

class Person(var name: String, var cel: String, var age: Int, var gender: Char, var salary: Double, var stature: Long) {
    override fun toString(): String {
        return "kotlin.Person{" +
                "name='" + name + '\'' +
                ", cel='" + cel + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                ", stature=" + stature +
                '}'
    }
}