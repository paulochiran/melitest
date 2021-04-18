package mykotlin.nullable

fun String?.isEmptyOrNull() = this ==null || isEmpty()

fun main(){
    val s1: String? = null
    val s2: String? = ""
  //  s1.isEmptyOrNull() eq true
    //s2.isEmptyOrNull() eq true

    println(s1.isEmptyOrNull())

    val s3 = "   "
   // s3.isEmptyOrNull() eq false



}