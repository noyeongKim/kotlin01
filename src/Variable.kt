fun main(arg: Array<String>) {
    // var = 변수
    // 변수 명 뒤에 타입 명시는 값의 초기화를 해주지 않는 경우 꼭 타입 지정을 해야 한다.
    var number1: Int = 3
    var string1 = "String"

    println(number1)
    println(string1)

    number1 = 4
    string1 = "hello"
    println(number1)
    println(string1)

    // val = 상수 (java final)
    val number2: Int
    val string2: String
    number2 = 3
    // type error string2 = 44
    string2 = "how"
    println(number2)
    println(string2)

    // 상수값 변경 불가 string2 = "ggg"

}