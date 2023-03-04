/*
class Calculator constructor(n: Int){
    var n: Int = 0
    var result: Int = 0

    init {
        this.n = n
    }

    fun calculate(operator: Char, n1: Int ){
        when(operator) {
            '+' -> result = this.n + n1
            '-' -> result = this.n - n1
            '*' -> result = this.n * n1
            '/' -> result = this.n / n1
            else-> println("잘못된 연산입니다.")
        }
        println(result)
    }
}

val calculator = Calculator(3)
calculator.calculate('+', 10)
calculator.calculate('-', 50)*/
class Calculator(initialValue: Int) {
    var result: Int = 0
        set(value) {
            field = value
            println("= $field")
        }

    init {
        this.result = initialValue
    }

    fun calculate(operator: Char, inputNumber: Int){
        when(operator) {
            '+' -> result+=inputNumber
            '-' -> result-=inputNumber
            '*' -> result*=inputNumber
            '/' -> result/=inputNumber
            else ->println("불가능한 연산입니다.")
        }
    }
}

val cal = Calculator(4)
cal.calculate('+', 10)
cal.calculate('-', 5)

