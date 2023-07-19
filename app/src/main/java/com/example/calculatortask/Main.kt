package com.example.calculatortask

import androidx.annotation.RequiresPermission

fun main() {
    println("계산기를 실행합니다. 숫자를 입력해 주세요.")
    var answer = readLine()!!
    println("사칙연산을 선택해 주세요. [1] 더하기 [2] 빼기 [3] 곱하기 [4] 나누기")
    var cal = readLine()!!
    when(cal){
        "1" -> println("더하기")
        "2" -> println("빼기")
        "3" -> println("곱하기")
        "4" -> println("나누기")
        else -> println("잘못 선택했습니다.")
    }
    println("숫자를 입력해 주세요.")
    var b = readLine()!!
    var add = AddOperation()
    var sub = SubtractOperation()
    var mul = MultiplyOperation()
    var div = DivideOperation()
    when(cal){
        "1" -> println( add.operation(answer.toInt(), b.toInt()))
        "2" -> println( sub.operation(answer.toInt(), b.toInt()))
        "3" -> println( mul.operation(answer.toInt(), b.toInt()))
        "4" -> println( div.operation(answer.toInt(), b.toInt()))
    }
}