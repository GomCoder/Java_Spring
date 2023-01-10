import java.util.*
import java.util.*

fun main() {
    val squares2 = arrayOf(1, 4, 9, 16)
    squares2[2] = 100 // squares: 1, 4, 100, 16
    println(Arrays.toString(squares2))
    squares2[3] += 9  // squares: 1, 4, 100, 25
    println(Arrays.toString(squares2))
    squares2[0]--     // squares: 0, 4, 100, 25
    println(Arrays.toString(squares2))
}