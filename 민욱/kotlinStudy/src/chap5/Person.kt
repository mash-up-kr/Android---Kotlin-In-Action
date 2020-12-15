package chap5

data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31), Person("Carol", 31))
    findTheOldest(people)

    println(people.maxByOrNull { it.age })

    //함수 호출 시 마지막 인자가 람다라면 호출문 밖으로 꺼낼 수 있다.
    println(people.maxByOrNull() {
        p: Person -> p.age
    })

    //람다 함수가 마지막 인자라면 괄호를 제거 가능
    println(people.maxByOrNull {
            p: Person -> p.age
    })

    //컴파일러가 타입 추론
    println(people.maxByOrNull {
            p -> p.age
    })

    //넘기려는 코드가 이미 함수(or 객체)에 포함되어 잇는 경우
    println(people.maxByOrNull(Person::age))

    //변수에 람다를 저장할때는 자료형을 적어주어야 한다.
    val sum = { x: Int, y: Int ->
        println("Computing the sum of $x ans $y ...")
        x + y
    }

    println(sum(1, 2))

    val errors = listOf("403 Forbidden", "404 Not Fount")
    printMessageWithPrefix(errors, "Error:")

    val response = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
    printProblemCounts(response)

    //생성자 참조
    val createPerson = ::Person
    val p = createPerson("Alice", 29)
    print(p)

    //filter는 걸러내는 함수로 true를 반환하는 요소만 모은다.
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })

    //요소를 변환하는 함수 map
    val list2 = listOf(1, 2, 3, 4)
    println(list2.map { it * it })

    //모든 요소가 이 술어를 만족하는
    println(people.all(canBeInClub27))

    //요소 중 하나라도 만족 하는
    println(people.any(canBeInClub27))

    //요소 중 술어를 만족하는 요소 개수
    println(people.count(canBeInClub27))

    //요소 중 만족하는 첫번 째 요소를 반환, 없으면 null
    println(people.find(canBeInClub27))

    //동일한 값에 따라서 그룹을 만든다. Map 컬렉션을 반환
    println(people.groupBy { it.age })
}

fun Person.isAdult() = age >= 21

//확장 함수도 참조 가능
val predcate = Person::isAdult



//가장 연장자를 찾는 방법 중 직접 찾
fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null
    for(person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }

    println(theOldest)
}

fun printMessageWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

//람다 안에서 바깥 함수의 로컬 변수 변경하기
fun printProblemCounts(response: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0

    response.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else {
            serverErrors++
        }
    }

    println("$clientErrors client errors, $serverErrors server errors")
}

val canBeInClub27 = { p: Person -> p.age <= 27 }

