val number: Int? = null //?: nullable
//val number2: Int = null //null can not be a value of a non-null type Int

val number2: Int? = 2 + 5
val number3: Int? = 10

//val number4: Int? = number2 + number3
// (nullable끼리 더할 수 없나?
// => number2라는 변수가 저 연산을 실행할 때 어떤 상태일지 즉, null일지 알수가 없음!!(nullable이니까!)
// => 만약 null이라면 연산이 안되니까 걍 안되도록 하자!!)

val number4: Int? = number2!! + number3!!
//!!의 역할: 야 저 변수 nullable이긴한데, 니가 쓸때는 백퍼 null아니니까 나 믿고 실행해!
//=> 개발자가 nullable이 null이 아니라고 assert해줌!!
//but 돌려보니 null일경우 NPE뜰 수 있다
// => 100% 확신이 있는 경우가 아니면 사용하지 말자!!
println(number4)

if (null == 5) {
    println("same")
} else {
    println("not same")
}

if (null == null) { //상태를 비교하는거임!!!
    println("same")
} else {
    println("not same")
}