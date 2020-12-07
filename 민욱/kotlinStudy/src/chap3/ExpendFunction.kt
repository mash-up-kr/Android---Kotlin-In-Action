package chap3

fun main() {
    val list = listOf(1, 2, 3)
    println(list)

    println(joinToString(list, "; ", "{", "} "))
    //출력: {1; 2; 3}

    println(joinToString(collection = list, separator = " ",
                prefix = " ", postfix = "."))
    //출력: 123.

    //separator 생략 가능
    println(joinToString(list, prefix = "; "))
}

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