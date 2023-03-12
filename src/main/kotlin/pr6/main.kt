package pr6

fun main() {

    // apply | run
    // also  | let

    // apply, run, also, let

    // substring(start, end)

    // run { 해당 run 을 실행한 객체 (this) } -> 마지막 줄에 적힌 값이 return 이 됨

    println("1.0.txt.txt".run {substring(0, str.length - 4)})

    // apply { 해당 apply 을 실행한 객체 (this) } -> 그대로 그 객체 그대로 return 이 됨

    val number = 10.run {

    }

    // Builder Pattern -> Builder 라는 이름 앞에 있는 객체를 만들기 위한 객체
    //  - 모든 함수(매서드)가 꼬리에 꼬리를 무는 형태로 생성이 가능 ( 자기자신을 리턴 )
    //  StringBuilder ? -> String 을 만들기 위한 객체
    //      StringBuilder ? -> String 을 만들기 위한 객체

    val builder = StringBuilder()
    builder.append("abc").append("abc").toString() //~~~

    println(run {
        "a".run {

        }.run {

        }
    })

}
