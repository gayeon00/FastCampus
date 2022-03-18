/*List*/
val numbers = listOf<Int>(1, 2, 3)
println(numbers)

var number = listOf<Int>(1, 2, 3)
number = listOf<Int>(4, 5)
println(number)

//Map
val number5 = mapOf<Int, String>(1 to "일", 2 to "이")
val number6 = mapOf<Int, String>(Pair(1, "일"), Pair(2, "이"))