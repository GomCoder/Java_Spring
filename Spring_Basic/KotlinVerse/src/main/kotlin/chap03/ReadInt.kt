package chap03
/*
fun readInt() = readLine()!!.toInt()
fun readInt(radix: Int) = readLine()!!.toInt(radix)

object O {
    fun plus(a: String, b: String) = a + b
    //fun plus(a: String, b: String) = a.toInt() + b.toInt()  // error: conflicting overloads: public final fun plus(a: String, b: String): String defined...
}
*/
fun mul(a: Int, b: Int) = a*b            // 1
fun mul(a: Int, b: Int, c: Int) = a*b*c  // 2
fun mul(s: String, n: Int) = s.repeat(n) // 3
fun mul(o: Any, n: Int) = Array(n) { o } // 4

mul(1, 2)   // Int가 Any의 하위타입이므로 1과 4중에 1을 선택
// mul(1, 2L) // error: none of the following functions can be called with the arguments supplied
// 오류: (Int, Long) 타입을 받을 수 있는 함수가 없음
mul(1L, 2)// Long, Int 타입을 받을 수 있는 함수는 4번뿐이므로 4를 선택
mul("0", 3) // String이 Any의 하위타입이기 때문에 3과 4중에 3을 선택

mul("0" as Any, 3) // (Any, Int)를 받을 수 있는 함수는 4뿐이므로 4를 선택
