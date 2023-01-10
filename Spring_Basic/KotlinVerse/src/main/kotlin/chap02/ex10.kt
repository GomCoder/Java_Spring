fun main() {
    val hundredLong = 100L     // OK: Long으로 타입이 추론됨
    //val hundredInt: Int = 100L // Error: assigning Long to Int
    println(hundredLong)
}