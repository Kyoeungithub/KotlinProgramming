package chap05.section5.burglar

open class Car protected constructor(_year: Int, _model: String, _power: String, _wheel: String){

    private var year: Int=_year
    public var model: String=_model // public은 기본 값이므로 생략 가능
    protected open var power: String=_power
    internal var wheel: String=_wheel

    protected fun start(key: Boolean){
        if(key) println("Start the Engine!")
    }
    class Driver(_name: String, _license: String){ //2)
        private var name: String=_name
        var license: String=_license // public
        internal fun driving()=println("[Driver] Driver() - $name")
    }
}

class Tico(_year: Int, _model: String, _power: String, _wheel: String, var name: String, private var key: Boolean) : Car(_year,_model,_power,_wheel){
    override var power: String="50hp"
    val driver=Driver(name, "first class")

    constructor(_name: String, _key: Boolean):this(2014,"basic","100hp","normal",_name,_key){
        name=_name
        key=_key
    }

    fun access(password: String){
        if(password=="gotico"){
            println("---[Tico] access()-------")
            // super.year 3) private 접근 불가
            println("super.model = ${super.model}") // public
            println("super.power = ${super.power}") // protected
            println("super.wheel = ${super.wheel}") // internal
            super.start(key) //protected

            //driver.name // private 접근 불가
            println("Driver().license = ${driver.license}") //public
            driver.driving()
        }else{
            println("You're a burglar")
        }
    }
}

class Burglar(){
    fun steal(anycar: Any){
        if(anycar is Tico){
            println("---[Burglar] steal()--------")
//            println(anycar.power) // protected 접근 불가
//            println(anycar.year) // private 접근 불가
            println("anycar.name = ${anycar.name}")
            println("anycar.wheel = ${anycar.wheel}")
            println("anycar.model = ${anycar.model}")

            println(anycar.driver.license) // public 접근
            anycar.driver.driving() //internal 접근 (같은 모듈 안에 있으므로)
//            println(Car.start()) // protected 접근 불가
            anycar.access("dontknow")
        }else{
            println("Nothing to steal")
        }
    }
}

fun main() {
    // val car=Car() //protect 생성 불가
    val tico=Tico("kildong",true)
    tico.access("gotico")

    val burglar=Burglar()
    burglar.steal(tico)
}