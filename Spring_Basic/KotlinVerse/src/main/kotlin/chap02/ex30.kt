fun main() {
    val x=1
    val y=2
    println((x == 1) or (y == 1))     // true
    println((x == 0) || (y == 0))     // false
    println((x == 1) and (y != 1))    // true
    println((x == 1) and (y == 1))    // false
    println((x == 1) xor (y == 1))    // true
    println((x == 1) xor (y != 1))    // false
    println(x == 1 || y/(x - 1) != 1) // true
    println(x != 1 && y/(x - 1) != 1) // false
}