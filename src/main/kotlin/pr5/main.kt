package pr5

import java.text.DecimalFormat

fun main() {

    // 10000 -> 10,000
    // 100000 -> 100,000

    val format = DecimalFormat("#,###.##")
    print(format.format(1234567.511))

}