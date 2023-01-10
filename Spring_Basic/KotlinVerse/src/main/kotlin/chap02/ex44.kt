import java.util.*

fun main() {
    val size = readLine()!!.toInt()
    val squares0 = Array(size) { (it + 1)*(it + 1) }

    println(Arrays.toString(squares0))
}