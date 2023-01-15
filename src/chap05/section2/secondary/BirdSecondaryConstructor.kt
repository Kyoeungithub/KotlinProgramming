package chap05.section2.secondary

class Bird{
    //1) 프로퍼티 선언
    var name: String
    var wing: Int
    var beak: String
    var color: String

    //2) 생성자 - 매개변수를 통해 초기화할 프로퍼티에 저장
    constructor(name: String, wing:Int, beak:String, color:String){
        this.name=name
        this.wing=wing
        this.beak=beak
        this.color=color
    }

    // 메서드
    fun fly()=println("Fly wing: $wing")
    fun sing(vol: Int)=println("Sing vol: $vol")
}

fun main() {
    val coco=Bird("mybird",2,"short","blue") // 4) 생성자의 인자로 객체 생성과 동시에 초기화

    coco.color="yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}