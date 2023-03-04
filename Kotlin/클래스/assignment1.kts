/*
class Calculator constructor(n1: Int, n2: Int){
    var n1: Int
    var n2: Int
    var result: Int = 0

    init {
        this.n1=n1
        this.n2 = n2
    }

    fun plus() {
        this.result = this.n1 + this.n2
        printResult()
    }

    fun minus() {
        this.result = this.n1 - this.n2
        printResult()
    }

    fun multi() {
        this.result = this.n1 * this.n2
        printResult()
    }

    fun divide() {
        this.result = this.n1 / this.n2
        printResult()
    }

    fun printResult(){
        println(this.result)
    }
}

val cal = Calculator(6,4)
cal.plus()
cal.minus()
cal.multi()
cal.divide()*/
class Calculator {
    var result : Int = 0
        set(value) {
            field = value
            println(field)
        }

    fun plus(inputNumber: Int) {
        result += inputNumber
    }
    fun minus(inputNumber: Int) {
        result -= inputNumber
    }
    fun multiply(inputNumber: Int) {
        result += inputNumber
    }
    fun divide(inputNumber: Int) {
        result /= inputNumber
    }
}

val cal = Calculator()
cal.plus(10)
cal.minus(3)
