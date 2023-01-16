package chap05.section6.composition

class Car(val name: String, val power: String){
    private var engine=Engine(power) //Engine 클래스 객체는 Car에 의존적

    fun startEngine()=engine.start()
    fun stopEngine()=engine.stop()
}

class Engine(power: String){
    fun start()=println("Engine has bee started.")
    fun stop()=println("Engine has been stopped.")
}