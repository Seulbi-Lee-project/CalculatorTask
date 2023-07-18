package com.example.calculatortask

fun main() {
    var calculator = Calculator()
    var answer = calculator.addOperation(7, 3)
    println("더하기 답: ${answer}")
    answer = calculator.subtractOperation(7, 3)
    println("빼기 답: ${answer}")
    var answer2:Long
    answer2 = calculator.multiplyOperation(7, 3)
    println("곱하기 답: ${answer2}")
    answer = calculator.divideOperation(7, 3)
    println("나누기 답: ${answer}")
    answer = calculator.remainderOperation(7, 3)
    println("나머지 답: ${answer}")
}