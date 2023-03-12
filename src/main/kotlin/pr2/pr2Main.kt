package pr2

fun main() {

    print("성적 입력좀 : ")
    println(
        when(readln().toInt() / 10) {
            10, 9 -> "A"
            8 -> "B"
            7 -> "C"
            6 -> "D"
            else -> "F"
        }
    )

}