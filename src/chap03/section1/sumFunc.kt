package chap03.section1

fun sum(a:Int, b:Int): Int{
    var sum=a+b
    return sum
}

fun main() {
    val result1=sum(3,2)
    val result2=sum(6,7)

    println(result1)
    println(result2)
}