package chap7

import java.lang.IndexOutOfBoundsException

data class Point(val x: Int, val y: Int) : Comparable<Point> {
    operator fun plus(other: Point) : Point {
        return Point(x + other.x, y + other.y)
    }

    override fun compareTo(other: Point): Int{
        return compareValuesBy(this, other,
            Point::x, Point::y
        )
    }
}

operator fun Point.get(index: Int): Int {
    return when(index) {
        0 -> x
        1 -> y
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

//컬렉션 객체의 요소를 추가하는. 객체를 반환하지 않
operator fun <T> MutableCollection<T>.plusAssign(element: T) {
    this.add(element)
}

//단항 연신자 이기 때문에 인자가 없음
operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)

    println(p1 + p2)

    println(p1 * 1.5)

    println("abc" < "bac")

    //get 관례
    println(p1[1])
}