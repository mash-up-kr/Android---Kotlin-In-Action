package chap3

fun main() {

    for (index in 1 until 10) {
        println(index)
    }
}

var opCount = 0

//kotlin 에서 헷갈렸던 부분이었다. val은 우리가 값이 변경되지 않는 immutable 변수의 선언인데 const가 왜 있을 까?
//java로 컴파일 해보면 알 수 있다. val은 getter가 생성되어 상수와 맞지 않다는 것

const val UNIX_LINE_SEPARATOR = "\n"

fun performOperation() {
    opCount++;
}

fun reportOperationCount() {
    println("Operation performed $opCount times")
}