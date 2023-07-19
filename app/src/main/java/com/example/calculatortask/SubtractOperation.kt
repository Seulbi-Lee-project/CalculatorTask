package com.example.calculatortask

class SubtractOperation : Calculator() {
    override fun operation(a: Int, b: Int): Int {
        return a-b
    }
}