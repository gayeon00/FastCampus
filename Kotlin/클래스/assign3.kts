import com.sun.jdi.IntegerValue

/*
class Calculator constructor(n: Int){
    var n: Int = 0
    var result: Int = 0

    init {
        this.n = n
    }

    fun calculate(command: String){
        val commList = command.split(" ")
        commList.forEach {
            val operator = it.slice(0..it.length-2)
            val number = it.get(it.length-1).toInt()-51
            when (operator){
                "더하기" -> result = this.n + number
                "빼기" -> result = this.n - number
                "곱하기" -> result = this.n * number
                "나누기" -> result = this.n / number
            }
            println(result)
        }
    }
}

val calculator= Calculator(3)
calculator.calculate("더하기3 빼기7 곱하기3 나누기5")*/
class Calculator {
    var result = 0
        set(value) {
            field = value
            println("= $field")
        }

    fun calculate(inputCommand: String) {
        val commandList = inputCommand.split(" ")
        commandList.forEach {
            val operator = it.substring(0,it.length-1)
            val num = Character.getNumericValue(it[it.length-1])

            when(operator) {
                "더하기" -> result+=num
                "빼기" -> result-=num
                "곱하기" -> result*=num
                "나누기" -> result/=num
            }
        }
    }
}

val cal = Calculator()
cal.calculate("더하기3 빼기7 곱하기3 나누기5")
