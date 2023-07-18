package com.example.calculatortask

fun main() {
    var calculator = Calculator()
    var answer = calculator.addOperation(2, 3)
    println(answer)
    answer = calculator.subtractOperation(1, 2)
    println(answer)
    answer = calculator.multiplyOperation(1, 2)
    println(answer)
    answer = calculator.divideOperation(2, 3)
    println(answer)
    answer = calculator.remainderOperation(2, 3)
    println(answer)
}