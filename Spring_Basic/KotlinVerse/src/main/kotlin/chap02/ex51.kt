import java.util.*
import java.util.*

fun main() {
    println(intArrayOf(1, 2, 3) == intArrayOf(1, 2, 3)) // false

    println(intArrayOf(1, 2, 3).contentEquals(intArrayOf(1, 2, 3))) // true

}
