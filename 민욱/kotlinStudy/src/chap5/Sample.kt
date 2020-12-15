package chap5

import java.lang.StringBuilder

fun alphabet() : String {
    val result = StringBuilder()

    return with(result) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }

        append("\nNow I know the alphabet!")
        this.toString()
    }
}

fun alphabetByApply() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()