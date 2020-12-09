package chap3

fun main(args: Array<String>) {

    val set1: HashSet<Int> = HashSet();

    var set2: Set<Int> = emptySet<Int>()
    val set3 = hashSetOf(1, 7, 3)

    set2 = set2.plus(1)

    println(set2)

    val list = arrayListOf(1, 7, 3)
    val map = hashMapOf(1 to "one",
        7 to "seven",
        53 to "fifty-three")

    //기존 자바와의 호환성을 깨트리고 싶지 않은 kotlin의 방향성을 볼 수 있다.
    println(set3.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    println(list.max())

    //kotlin 1.4 버전에서 max, min은 deprecated
    //코틀린 함수의 명명 규칙을 따른다면 각 함수는 컬렉션의 최대/최솟값을 반환하거나, 컬렉션이 빈 경우 예외를 일으켜야 합니다.
    //min and max 는 1.0 버전에서 생성된 함수로 당시에는 명명 규칙이 적용되지 않아 사용했다고 하네요.

    //study -> Int? nullable 선언 방법과 ? 명령어 !! 명령어?
    println(set3.maxOrNull())
    println(list.minOrNull())
}