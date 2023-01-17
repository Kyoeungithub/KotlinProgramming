package chap06.section2

class Person{
    lateinit var name: String // 1) 지연 초기화를 위한 선언

    fun test(){
        if (!::name.isInitialized){
            println("not initialized")
        }else{
            println("initialized")
        }
    }
}

fun main() {
    val kildong=Person()
    kildong.test()
    kildong.name="Kildong" // 3) 이 시점에서 초기화됨(지연 초기화)
    kildong.test()
    println("name=${kildong.name}")
}