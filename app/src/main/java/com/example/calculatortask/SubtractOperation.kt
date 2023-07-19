package com.example.calculatortask

class SubtractOperation : Calculator() {
    override fun operation(num1: Int, num2: Int): Double {
        return (num1 - num2).toDouble()
    }
}