package chap07.section1

//추상 클래스, 주 생성자에는 비추상 프로퍼티 선언의 매개변수 3개가 있음
abstract class Vehicle(val name: String, val color: String, val weight: Double){

    //추상 프로퍼티(반드시 하위 클래스에서 재정의해 초기화해야 함)
    abstract var maxSpeed: Double

    //일반 프로퍼티(초깃값이 상태를 저장할 수 있음)
    var year="2018"

    //추상 메서드(반드시 하위 클래스에서 구현해야 함)
    abstract fun start()
    abstract fun stop()

    //일반 메서드
    fun displaySpecs(){
        println("Name: $name, Color: $color, Weight: $weight, Year: $year, Max Speed: $maxSpeed")
    }
}