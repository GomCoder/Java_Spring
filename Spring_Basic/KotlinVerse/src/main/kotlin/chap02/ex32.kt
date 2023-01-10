fun main() {
    val a4 = 1                // Int
    val b3 = 2L               // Long
    //println(a4 == b3)          // Error: comparing Int and Long
    println(a4.toLong() == b3) // Ok: 두 타입 모두 Long임
}