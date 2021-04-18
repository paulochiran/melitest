package mykotlin.nullable

 fun isFoo1(n: Name) = n.value == "foo"
// fun isFoo2(n: Name?) = n.value == "foo"
 fun isFoo3(n: Name?) = n != null && n.value == "foo"
 fun isFoo4(n: Name?) = n?.value == "foo"

fun main(){
      // isFoo1(null)
       //isFoo2(null)
       isFoo3(null)
       isFoo4(null)

}

class Name {
    var value: String? = null
}
