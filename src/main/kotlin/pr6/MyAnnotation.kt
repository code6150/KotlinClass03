package pr6

annotation class MyAnnotation(
    val name: String,
    val age : Int
)

@MyAnnotation("홍길동",15)
class TestClass {

}

annotation class SetRange(
    val max: Int,
    val min: Int
) {

}

fun main() {

    val ano = TestClass::class.java.getAnnotation(MyAnnotation::class.java)
    println(ano)

}