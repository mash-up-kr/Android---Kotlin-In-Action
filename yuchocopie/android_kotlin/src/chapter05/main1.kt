import ch05.ex2_4_2_FlatMapFlatten1.Book
import java.io.File
import  kotlinx.coroutines. *

fun main(args: Array<String>) {
/*

    val sum = { x: Int, y: Int -> x + y } // 람다식 변수에 저장
    println(sum(1, 2)) // 변수에 저장된 람다식 호출

//    { println(42) }()
    run { println(42) }

    val sum0 = { x: Int, y: Int ->
        println("Computing the sum of $x and $y...")
        x + y
    }

    println(sum0(42, 2))
//
//    fun Person.isAdult() = age >= 21
//    val predicate = Person::isAdult
//
//    println(predicate)
//
//    val list = listOf(Person("Bob", 31), Person("Alice", 29))
//
//    val filterAndMaxBy = list.filter { it.age == list.maxBy(Person::age)?.age ?: 0}

    val numbers = mapOf(0 to "zero", 1 to "one", 2 to "two", 3 to "three")
    val filterValuesMap = numbers.filterValues { it == "zero" }
    val mapValuesMap = numbers.mapValues { it.value.toUpperCase() }
    println(filterValuesMap)
    println(mapValuesMap)

    val filterKeysMap = numbers.filterKeys { it == 1 }
    val mapKeysMap = numbers.mapKeys { it.key % 2 }
    println(filterKeysMap)
    println(mapKeysMap)

//  filterValuesMap = {0=zero}
//  mapValuesMap = {0=ZERO, 1=ONE, 2=TWO, 3=THREE, 4=FOUR}
//  filterKeysMap = {1=one}
//  mapKeysMap = {0=four, 1=three}

    val list = listOf(
        Person("Alice", 27),
        Person("Bob", 31),
        Person("hzoou", 25),
        Person("txxbro", 28),
        Person("iyj", 28),
        Person("WooVictory", 27)
    )

// 술어 선언
//    val canBeInClub27 = { p: Person -> p.age <= 27 }
//    println("all: ${list.all(canBeInClub27)}")
//    println("any: ${list.any(canBeInClub27)}")
//    println("count: ${list.count(canBeInClub27)}")
//    println("find: ${list.find(canBeInClub27)}")

    val a = listOf(0, 2, 3, 4, null, 3)

    a.forEach {
        println(it.toString())
    }

    a.forEach {
        it?.let { a ->
            println(a.toString())
        }
    }


//    val books = listOf(
//        Book("Thursday Next", listOf("Jasper Fforde")),
//        Book("Mort", listOf("Terry Pratchett")),
//        Book("Good Omens", listOf("Terry Pratchett",
//            "Neil Gaiman"))
//    )
//    println(books.flatMap { it.authors }.toSet())
//
//    println("flatten(): ${books.map { it.authors }.flatten()}")
//
//    val number = generateSequence(0) { it + 1 } // 시퀀스 생성
//    val numbersTo100 = number.takeWhile { it <= 100 } // while loop 시퀀스 생성
////    numbersTo100.forEach {
////        println(it)
////    }
//    println(numbersTo100.toString()) // 위의 모든 시퀀스는 sum의 결과를 계산할 때 수행된다.
//    println(numbersTo100.toList()) // 위의 모든 시퀀스는 sum의 결과를 계산할 때 수행된다.
//// 5050
//
//    // File의 확장함수 선언
//    fun File.isInsideHiddenDirectory() = generateSequence(this) { it.parentFile }.any { it.isHidden }
//    val file = File("/Users/svtk/.HiddenDir/a.txt")
//    println(file.isInsideHiddenDirectory())
// 결과: true

    data class Point(var x: Int, var y: Int)

    operator fun Point.get(i: Int): Int {
        return when (i) {
            0 -> x
            1 -> y
            else -> 0
        }
    }

    operator fun Point.set(i: Int): Int {
        when (i) {
            0 -> x = i
            1 -> y = i
            else -> 0
        }
    }


    val p = Point(10, 10)
    println(p[1])
    println(p.get(1))
*/


    fun  main () {
        GlobalScope .launch { // 백그라운드에서 새 코 루틴을 시작하고 
            delay ( 1000L ) // 1 초 동안 비 차단 지연 (기본 시간 단위는 ms) 
            println ( " World! " ) // 이후 인쇄 지연
        }
        println ( " Hello, " ) // 코 루틴이 지연되는 동안 메인 스레드는 계속됩니다 
        Thread .sleep ( 2000L ) // JVM을 유지하기 위해 2 초 동안 메인 스레드를 차단 
    }
}


data class Person(val name: String, val age: Int)
