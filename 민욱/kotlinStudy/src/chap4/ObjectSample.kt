package chap4

interface JSONFactory<T> {
    fun fromJSON(jsonText: String) : T
}
class Person(val name: String){

    //동반 객체로 static
    companion object : JSONFactory<Person> {
        override fun fromJSON(jsonText: String) : Person {
            return Person(jsonText) //임시로..
        }
    }

}

object Payroll {
    val allEmployees = arrayListOf<Person>()

    fun calculateSalary() {
        for (person in allEmployees) {
            //...
        }
    }
}

//동반 객체에 대한 확장 함
fun Person.Companion.expend() {

}