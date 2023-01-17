package chap06.section2

class LazyTest{
    init{
        println("init block") //2
    }
    val subject by lazy{
        println("lazy initialized") //6
        "Koglin Programming"
    }
    fun flow(){
        println("not initialized") //4
        println("subject one: $subject") // 최초 초기화 시점
        println("subject two: $subject") // 8) 이미 초기화된 값 사용
    }
}

fun main() {
    val test=LazyTest()
    test.flow()
}