package com.example.kotlincourse.lessons.lesson16.homework.printer

import com.example.kotlincourse.lessons.lesson16.homework.Background
import com.example.kotlincourse.lessons.lesson16.homework.Colors

class LaserPrinter: Printer() {
    override fun printString(str: String) {
        for (word in splitString(str)){
            println("${Colors.BLACK}${Background.WHITE}$word${Colors.RESET}")
        }
    }
}