//06
fun findSumIsSixFromDice(){
    for (i in 1 until 6) println("[$i, ${6-i}]")
}
findSumIsSixFromDice()

/*
//08
fun abc(army1: MutableList<Char>, army2: MutableList<Char>, n: Int): MutableList<Any>?{
    if(n<army1.size) army1.removeAt(n)
    else              return null
    if(n<army2.size) army2.removeAt(n)
    else              return null
    return mutableListOf(army1, army2)
}


val result = abc(mutableListOf('a','b','c','d','e'), mutableListOf('a','b','c'),2)
print(result)


//09
fun abc2(n: Int){
    val l = mutableListOf<Int>()
    for (i in 1..9) l.add(n*i)
    println(l)
}

abc2(3)

//10
fun seperate(list1: MutableList<Int>, list2: MutableList<Int>){
    val even = mutableListOf<Int>()
    val odd = mutableListOf<Int>()

    for (i in list1){
        if (i%2==0) even.add(i)
        else        odd.add(i)
    }

    for (i in list2){
        if (i%2==0) even.add(i)
        else        odd.add(i)
    }

    return mapOf(Pair("짝수",even), Pair("홀수",odd))

}*/
