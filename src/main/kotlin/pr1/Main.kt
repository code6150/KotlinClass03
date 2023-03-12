package pr1

fun main() {

    while (true) {
        // 추가:이름 -> 해당 이름을 학생 리스트에 추가
        // 확인:이름 -> 해당 이름이 학생인지 확인

        val a = readln()

        val answer:List<String> = a.split(":")

        when(answer[0]) {
            "추가" -> StudentManager.registerStudent(answer[1])
            "확인" -> StudentManager.isStudent(answer[1])
        }
    }

}
