package com.example.calculatortask

import androidx.annotation.RequiresPermission

fun main() {
    println("계산기를 실행합니다. 숫자를 입력해 주세요.")
    var num1 = readLine()!!
    println("사칙연산을 선택해 주세요. [+] 더하기 [-] 빼기 [*] 곱하기 [/] 나누기 [%]나머지")
    var cal = readLine()!!
    println("숫자를 입력해 주세요.")
    var num2 = readLine()!!
    var add = AddOperation()
    var sub = SubtractOperation()
    var mul = MultiplyOperation()
    var div = DivideOperation()
    var rem = Calculator()
    when(cal){
        "+" -> println( "${num1} ${cal} ${num2}는 ${add.operation(num1.toInt(), num2.toInt())}입니다.")
        "-" -> println( "${num1} ${cal} ${num2}는 ${sub.operation(num1.toInt(), num2.toInt())}입니다.")
        "*" -> println( "${num1} ${cal} ${num2}는 ${mul.operation(num1.toInt(), num2.toInt())}입니다.")
        "/" -> println( "${num1} ${cal} ${num2}는 ${div.operation(num1.toInt(), num2.toInt())}입니다.")
        "%" -> println( "${num1} ${cal} ${num2}는 ${rem.remainder(num1.toInt(), num2.toInt())}입니다.")
    }
}