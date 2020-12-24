package ch05.ex1_3_3_SyntaxForLambdaExpressions2

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int -> x + y} // 람다식 변수에 저장
    println(sum(1, 2)) // 변수에 저장된 람다식 호출

}
