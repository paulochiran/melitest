package mykotlin.lambdas

fun main(){
    val heroes = listOf(
        Hero("The Capitan",69, Gender.MALE),
        Hero("Frenchy",42,Gender.MALE),
        Hero("The kid",9,null),
        Hero("Lady Lauren",29,Gender.FEMALE),
        Hero("First Mate",29,Gender.MALE),
        Hero("Sir Stephen",37,Gender.MALE)
    )

    println(heroes.last().name)
    println(heroes.first().name)

    println(heroes.firstOrNull{it.age == 30}?.name)
    println(heroes.firstOrNull{it.age == 29}?.name)

    println(heroes.map {it.age }.distinct().size)
}