package chap05.section6

//여러 마리의 오리를 위한 List의 매개변수
class Pond(_name: String, _members: MutableList<Duck>){
    val name: String=_name
    val members: MutableList<Duck> = _members
    constructor(_name: String) : this(_name, mutableListOf<Duck>())
}

class Duck(val name: String){
    fun main(){
        //두 개체는 서로 생명주기에 영향을 주지 않음
        val pond=Pond("myFavorite")
        val duck1=Duck("Duck1")
        val duck2=Duck("Duck2")

        //연못에 오라클 추가 - 연못에 오리가 집합
        pond.members.add(duck1)
        pond.members.add(duck2)
    }
}