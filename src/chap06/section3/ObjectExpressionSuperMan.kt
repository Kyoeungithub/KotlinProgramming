package chap06.section3

open class Superman(){
    fun work()=println("Taking photos")
    fun talk()=println("Talking with people.")
    open fun fly()=println("Fying in the air.")
}

fun main() {
    val pretendMan=object: Superman(){
        override fun fly()=println("I'm not a real superman. I can't fly!")
    }
    pretendMan.work()
    pretendMan.talk()
    pretendMan.fly()
}