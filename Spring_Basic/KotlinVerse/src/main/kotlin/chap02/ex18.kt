fun main() {
    println(Float.MIN_VALUE)              // 1.4E-45
    println(Double.MAX_VALUE)             // 1.7976931348623157E308
    println(Double.POSITIVE_INFINITY)     // Infinity
    println(1.0/Double.NEGATIVE_INFINITY) // -0.0
    println(2 - Double.POSITIVE_INFINITY) // -Infinity
    println(3 * Float.NaN) // NaN
}