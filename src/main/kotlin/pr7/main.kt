package pr7

// 오버로딩 ?
//      -> 같은 이름으로 호출되는 기능들을 매개변수의 차이로 여러개를 선언
//          다형성 ( 다양한 형태를 가질 수 있는 객체지향의 특징 )

// 미리 지정해서 생략하게 하고싶다면, 반드시 가장 뒤에서부터 완성시켜야 함.
class Test (
    val age: Int,
    val number1: Int,
    val number2: Int,
    val name: String
    ){
    constructor(number1:Int,name:String): this(10,number1, -1, name)

}

open class Parent(
    val test: Int
) {
    open
}

fun main() {



}