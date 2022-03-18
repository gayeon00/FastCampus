//함수를 선언하는 방법
fun plusNumbers(firstNum: Int, secondNum: Int): Int {
    val result: Int = firstNum + secondNum
    return result
}

// 함수를 사용(호출)하는 방법
plusNumbers(firstNum = 10, secondNum = 20)
plusNumbers(10, 20)

val result: Int = plusNumbers(5, 7)
println(result)

//기본값이 있는 함수를 선언하는 방법
fun plusNumbersWithDefault(firstNum: Int, secondNum: Int = 20): Int {
    return firstNum + secondNum
}

val result2: Int = plusNumbersWithDefault(firstNum = 10)
println(result2)
val result3: Int = plusNumbersWithDefault(firstNum = 10, secondNum = 30)
println(result3)

//반환값이 없는 함수
fun plusNumbersWithNoReturn1(firstNum: Int, secondNum: Int) {
    val result: Int = firstNum + secondNum
    println(result)
}

fun plusNumbersWithNoReturn2(firstNum: Int, secondNum: Int) {
    val result: Int = firstNum + secondNum
    println(result)
    return
}
/*
반환값 없는 함수도 return 있어도 됨! but 키워드만! 뒤에 뭐 더있으면 안됨!
*/

plusNumbersWithNoReturn2(100, 200)

//함수 선언을 간단하게 하는 법(return 문도 없는데 어케 했노??)
fun shortPlusNumbers(firstNum: Int, secondNum: Int) = firstNum + secondNum
val result10 = shortPlusNumbers(10, 100)
println(result10)

//가변인자를 갖는 함수
fun plusMultipleNumbers(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}
plusMultipleNumbers(1, 2, 3, 4, 5)