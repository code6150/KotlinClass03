package pr8

// 객체 지향에서는 기본적으로 맴버 변수는 private 으로 선언
// ( java ) -> kotlin 은 무조건 public ? (x)
// kotlin 은 변경 가능한 변수 (var) 의 경우 private 으로 만듦.

class Person {
    // 맴버 변수를 private 으로 만드는 이유?
    //  이유모를 오류/결함을 피하기 위해서
    var age: Int = 15
        set(value) {
            if(value < 0) return
            field = value
        }

}

fun main() {


    val p = Person()
    p.age
}
