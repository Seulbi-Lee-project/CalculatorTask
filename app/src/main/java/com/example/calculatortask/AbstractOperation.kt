package com.example.calculatortask

interface AbstractOperation {
    fun addOperation(a:Int, b:Int): Int

    fun subtractOperation(a:Int, b:Int): Int

    fun multiplyOperation(a:Int, b:Int): Long

    fun divideOperation(a:Int, b:Int): Int
}