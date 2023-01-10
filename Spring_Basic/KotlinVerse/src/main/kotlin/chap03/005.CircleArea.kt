package chap03
import kotlin.math.PI

//fun circleArea(radius: Double): Double = PI*radius*radius

fun circleArea2(radius: Double) = PI*radius*radius // 반환값이 Double로 추론됨

fun circleArea3(radius: Double) = { PI*radius*radius }

/*
fun circleArea4(radius: Double) = {
    return PI*radius*radius    // error: 'return' is not allowed here
                               // error: type mismatch: inferred type is () -> [ERROR : Return not allowed] but Double was expected
}
*/

fun main()
{
  //  println(circleArea(5))
    println(circleArea2(1.2))
    println(circleArea3(1.2))

}