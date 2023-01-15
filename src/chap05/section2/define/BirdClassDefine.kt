package chap05.section2.define

class Bird{  // 1) 클래스 정의
    // 2) 프토퍼티(속성)
    var name: String="mybird"
    var wing: Int=2
    var beak: String="short"
    var color: String="blue"

    //3) 메서드(함수)
    fun fly()=println("Fly wing; $wing")
    fun sing(vol: Int)=println("Sing vol: $vol")
}

fun main() {
    val coco= Bird() // 4) 클래스의 생성자를 통한 객체의 생성
    coco.color="blue" // 5) 객체의 프로퍼티에 값 할당

    println("coco.color: ${coco.color}") // 6) 객체의 멤버 프로퍼티 읽기
    coco.fly() // 7) 객체의 멤버 메서드 사용
    coco.sing(3)
}