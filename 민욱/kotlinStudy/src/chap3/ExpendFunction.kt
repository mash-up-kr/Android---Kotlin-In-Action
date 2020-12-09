package chap3

fun main() {
    val list = listOf(1, 2, 3)
    println(list)

    println(joinToString(list, "; ", "{", "} "))
    //출력: {1; 2; 3}

    println(joinToString(collection = list, separator = " separator ",
                prefix = " prefix ", postfix = " postfix "))
    //출력: 123.

    //separator 생략 가능
    println(joinToString(list))
    //출력: 1, 2, 3
    println(joinToString(list, prefix = "<", postfix = ">"))
    //출력: <1, 2, 3>

    println("kotlin".lastChar())
    //출력: n

    println(listOf(1, 5, 6).joinToString(", "))
    //1, 5, 6
}

@JvmOverloads
fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun <T> Collection<T>.expendJoinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

//실제로 java로 Decomplie 해보면 수신객체를 매개변수로 받고 있다.
//실제 클래스 함수로 생성되는 것이 아니다. 그래서 java 클래스의 캡슐화가 깨지지 않고 private 멤버와 protected 멤버를 사용할 수 없다.
//따라서 상속관계의 오버라이드도 안된다.
fun String.lastChar() : Char = this.get(this.length - 1)