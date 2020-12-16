package chapter04

internal open class TalkativeButton {
    private fun yell() = println("Hey!")
    fun whisper() = println("Let's talk!")
    open fun test() {}

    protected class A : TalkativeButton() {

    }
}

internal fun TalkativeButton.giveSpeech() {
    whisper()
}