import java.util.*
fun main() {
    val aa = emptyArray<String>()      // Array<String> (원소 0개)
    val bb = arrayOf("hello", "world") // Array<String> (원소 2개)
    val cc = arrayOf(1, 4, 9)          // Array<Int> (원소 3개)


    println(Arrays.toString(aa))
    println(Arrays.toString(bb))
    println(Arrays.toString(cc))

}