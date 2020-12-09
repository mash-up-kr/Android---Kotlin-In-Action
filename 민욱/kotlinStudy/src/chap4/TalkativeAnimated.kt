package chap4

internal open class TalkativeAnimated : Animated() {

    override fun animate() {
        TODO("Not yet implemented")
    }

    private fun yell() = println("Hey!")

    protected fun whisper() = println("Let's talk!")
}

//fun TalkativeAnimated.giveSpeech() {
//
//    yell()
//
//    whisper()
//}

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}

sealed class Expr { //sealed는 하위 클래스를 제한
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}
