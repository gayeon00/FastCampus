//변수를 자료형과 함께 선언
val byteInt: Byte = 10
val shortInt: Short = 10
val integerInt: Int = 10
val longInt: Long = 10

//val wrongByte: Byte = 1000 -> Byte가 표현할 수 있는 범위보다 큰 수 적어줘서 에러 발생!
//val wrongByte: Byte = "바이트" -> type mismatch
//val floatNumber: Float = 10.0 ->the floating-point literal does not conform to the expected type Float
val floatNumber: Float = 10.0f //float의 경우에는 할당하려는 값 뒤에 f를 붙여줘야 함!!
val doubleNumber: Double = 10.0 //double은 안적어도 ㄱㅊ
//val doubleNumber: Double = 10 => 실수형은 소숫점 붙여줘야함

//논리형
val isYes: Boolean = true
val isFalse: Boolean = false

//문자/문자열
val text1: Char = 'A'
val text2: String = "AB"

//타입을 선택할 때는 담을수 있는 타입 중에 제일 작은 놈을 선택!
//일반적으로 그냥 Int, Double사용하자!

//변수명 작명 시 주의점
/*
-> 키워드는 사용할 수 없음!(val, var, Int, true 등)
*/
