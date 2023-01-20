package chap07.section2

//실드 클래스를 선언하는 첫 번쨰 방법
sealed class Result{
    open class Success(val message: String): Result()
        class Error(val code: Int, val message: String): Result()
    }

    class Status: Result() // 실드 클래스 상속은 같은 파일에서만 가능
    class Inside: Result.Success("Status") // 내부 클래스 상속

fun main() {
    //Success에 대한 객체 생성
    val result=Result.Success("Good!")
    val msg=eval(result)
    println(msg)
}

// 상태를 검사하기 위한 함수
fun eval(result: Result): String = when(result){
    is Status -> "in progress"
    is Result.Success -> result.message
    is Result.Error -> result.message
}