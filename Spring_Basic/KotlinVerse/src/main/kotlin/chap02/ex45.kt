import java.util.*
import java.util.*

fun main() {
    val operations = charArrayOf('+', '-', '*', '/', '%')
    val squares = IntArray(10) { (it + 1)*(it + 1) }

    println(Arrays.toString(operations))
    println(Arrays.toString(squares))
}