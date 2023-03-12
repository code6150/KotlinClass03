package pr4

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.File

// Java + 내가 다른 언어에서 편하다 느낀것들 다 가져오자! = kotlin
// inline function ( 인라인 함수 ) -> C#, C++
// 코드를 복사해서 호출한 위치로 붙여넣는 함수

class User(
    val name:String,
    val age :Int
    )

fun main() {

    val user = Gson().fromJson<User>(File("text.txt").readText(), object: TypeToken<User>() {}.type)

    println(user.name + ", " + user.age)

}

inline fun <reified T> File.fromJson() : T {
    return this.readText().fromJson()

}

inline fun <reified T> String.fromJson(): T {
    val type = object : TypeToken<T>() {}.type
    return Gson().fromJson(this,type)
}