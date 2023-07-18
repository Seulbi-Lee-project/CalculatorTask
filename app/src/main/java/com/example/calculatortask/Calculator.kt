package com.example.calculatortask

class Calculator : AbstractOperation{

    override fun addOperation(a:Int, b:Int): Int {
        return a + b
    }

    override fun subtractOperation(a:Int, b:Int): Int {
        return a - b
    }

    override fun multiplyOperation(a:Int, b:Int): Int {
        return  a * b
    }

    override fun divideOperation(a:Int, b:Int): Int {
        return  a / b
    }

    fun remainderOperation(a:Int, b: Int): Int{
        return  a % b
    }
}