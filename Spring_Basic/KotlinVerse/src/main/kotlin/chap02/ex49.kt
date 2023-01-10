import java.util.*
import java.util.*

fun main() {
    val squares2 = arrayOf(1, 4, 9, 16)
    val numbers2 = squares2.copyOf()
    numbers2[0] = 1000 // squares에는 영향이 없다
    println(Arrays.toString(squares2.copyOf(2) )) // 뒤가 잘림: 1, 4
    println(Arrays.toString(squares2.copyOf(5)))// 부족한 부분에 0이 채워짐: 1, 4, 9, 16, 0
}