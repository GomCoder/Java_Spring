import java.util.Date

fun main() {
    val name = readLine()
    val message = """Hello, $name! Today is ${java.util.Date()} """.trimIndent()

    println(message)
}