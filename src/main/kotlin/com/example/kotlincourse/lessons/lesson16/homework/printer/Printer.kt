package com.example.kotlincourse.lessons.lesson16.homework.printer

abstract class Printer {
    abstract fun printString(str: String)
    protected fun splitString(str: String): List<String>{
        return str.split(" ")
    }
}