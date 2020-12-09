package chap4

abstract class Animated {
    abstract fun animate() // 하위 클래스에서 반드시 오버라이

    open fun stopAnimating() { //open 키워드로 오버라이드 허용

    }

    fun animateTwice() {

    }
}