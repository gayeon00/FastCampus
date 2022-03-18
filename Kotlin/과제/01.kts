val A: Int = 0
val B: Int = 0
val C = if(A==B) true else false
println(C)

val A1: Int = 1
val B1 = A1*2
println(B1)

fun (a: Int?, b: Int?): Int{
    val a1 = if(a==null) 0 else a
    val b1 = if(b==null) 0 else b
    return a1+b1
}