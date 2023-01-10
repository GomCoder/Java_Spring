import java.util.*
import java.util.*

fun main() {
    val squares2 = arrayOf(1, 4, 9, 16)
    val numbers = squares2
    numbers[0] = 1000   // 바뀐 데이터가 squares와 numbers에 공유됨
    println(squares2[0]) // prints 1000
    println(Arrays.toString(squares2))
}