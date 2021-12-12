fun main(arg: Array<String>) {
    println("Hello world")
    // sum1
    val sum1 = sum1(1, 2)
    println("sum 1 = $sum1")
    // sum2
    println("sum2 = ${sum2(2, 3)}")

}

// return type 명시
fun sum1(a: Int, b: Int): Int {
    return a + b
}

// 표현식 직접 대입
fun sum2(a: Int, b: Int) = a + b
