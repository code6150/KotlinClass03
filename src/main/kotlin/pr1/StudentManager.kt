package pr1

object StudentManager {

    private val students = ArrayList<String>()

    // Boolean -> true / false
    fun isStudent(name:String):Boolean {
        return students.contains(name)
    }

    fun registerStudent(name:String) = students.add(name)

}