package com.acaroom.kotlin.chap03.section04.nested

class Outer{
    val ov=5
    class Nested{
        val nv=10
        fun greeting()="[Nested] Hello ! $nv" //외부의 ov에서는 접근 불가
    }
    fun outside() {
        val msg=Nested().greeting() // 객체 생성 없이 중첩 클래스의 메서드 접근
        println("[Outer]: $msg. ${Nested().nv}")
    }

}


fun main() {
    //static처럼 객체 생성 없이 사용
    val output=Outer.Nested().greeting()
    println(output)

    //Outer.outside() // 오류! 외부 클래스의 경우는 객체를 생성해야 함
    val outer=Outer()
    outer.outside()
}