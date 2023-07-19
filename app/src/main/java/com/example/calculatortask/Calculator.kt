package com.example.calculatortask

open class Calculator : AbstractOperation{
    override fun operation (num1:Int, num2:Int):Double{
        return (num1 + num2).toDouble()
    }

    fun remainder (num1:Int, num2: Int):Int{
        return num1 % num2
    }
}