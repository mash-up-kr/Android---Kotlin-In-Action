package chaprer3

import java.io.BufferedReader
import java.lang.Exception
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

class Person(val name: String, var isMarried: Boolean)

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == Color.RED && c2 == Color.YELLOW) ||
                (c1 == Color.YELLOW && c2 == Color.RED) -> Color.ORANGE
        (c1 == Color.BLUE && c2 == Color.YELLOW) ||
                (c1 == Color.YELLOW && c2 == Color.BLUE) -> Color.GREEN
        (c1 == Color.BLUE && c2 == Color.VIOLET) ||
                (c1 == Color.VIOLET && c2 == Color.BLUE) -> Color.INDIGO
        else -> throw Exception("Dirty color")
    }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val rignt: Expr) :
    Expr

fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.rignt) + eval(
            e.left
        )
        else -> throw IllegalArgumentException("Unknown expression")
    }

fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

fun main(args: Array<String>) {

    val a = mixOptimized(
        Color.BLUE,
        Color.YELLOW
    )
    val b = eval(
        Sum(
            Sum(
                Num(1),
                Num(2)
            ), Num(4)
        )
    )

    println(a)
    println(b)
//    chaprer1.readNumber
}
