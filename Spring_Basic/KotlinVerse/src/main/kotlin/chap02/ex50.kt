import java.util.*
import java.util.*

fun main() {
    val b = intArrayOf(1, 2, 3) + 4                // 원소를 하나만 추가: 1, 2, 3, 4
    val c = intArrayOf(1, 2, 3) + intArrayOf(5, 6) // 다른 배열을 추가: 1, 2, 3, 5, 6

    println(Arrays.toString(b));
    println(Arrays.toString(c));
}
