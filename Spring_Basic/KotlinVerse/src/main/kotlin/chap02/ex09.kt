fun main() {
    val one: Byte = 1                              // OK
    //val tooBigForShort: Short = 100_000            // Error: too big for Short
    val million = 1_000_000                        // OK: Int로 타입이 추론됨
    //val tooBigForInt: Int = 10_000_000_000         // Error: too big for Int
    val tenBillions = 10_000_000_000               // OK: Long으로 타입이 추론됨
    //val tooBigForLong = 10_000_000_000_000_000_000 // Error: too big for Long

    println(one)
    println(million)
    println(tenBillions)
}