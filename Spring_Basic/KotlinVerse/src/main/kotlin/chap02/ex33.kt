fun main() {
    val set = sortedSetOf(Double.NaN, Double.NaN,Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY,0.0)
    println(set) // [-Infinity, 0.0, Infinity, NaN]
}