package chap07.section3

class Point(var x: Int=0, var y: Int=10){
    //plus() 함수의 연산자 오버로딩
    operator fun plus(p: Point): Point{
        return Point(x+p.x, y+p.y)
    }
}

fun main() {
    val p1=Point(3,-8)
    val p2=Point(2,9)

    var point=Point()
    point=p1+p2
//    --point
    println("point = (${point.x}, ${point.y})")
}