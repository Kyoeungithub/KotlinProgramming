package chap03.section3.funcfunc

fun main() {
    println("funcFunc: ${funcFunc()}")
}

fun sum(a: Int, b:Int)=a+b

fun funcFunc():Int{
    return sum(2,2)
}