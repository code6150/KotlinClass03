package pr5

// open class 와 abstract class 의 차이
//  - 독립적인 생성이 가능하냐 불가능하냐의 차이
//  - abstract ( 추상 ) : 완성되지 않은 클래스                 [ 생성 불가능 ]
//  - open ( 열려있는 )  : 완성은 되었으나 수정이 가능한 클래스   [ 생성 가능 ]
open class Person(
    val name:String,
    val age:Int
)

fun main() {
    Person("이름", 15)
}