package chap5

data class Book(val title: String, val authors: List<String>)

fun main() {
    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })

    val books = listOf(Book("Thur", listOf("Jasper")),
                    Book("Mort", listOf("Terry")),
                    Book("Good", listOf("Terry", "Neil")))

    println(books.flatMap { it.authors }.toSet())


    //중간 결과를 매번 리스트를 생성하여 저장하는 것이 아니도록 해줌 -> Sequence
    //이것은 iterator를 이용하여 순차적으로 원소에 접근하다.
    books.asSequence()
        .map(Book::title)
        .filter { it.startsWith("T") }
        .toList()

    val naturalNumbers = generateSequence (0) {it + 1}

    val numberTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numberTo100.sum())
    val name = 10
    { println(3)}()

}