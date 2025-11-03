package com.example.kotlincourse.lessons.lesson16.homework.geometric

class Square(private val base: Double, private val height: Double): Shape() {
    override fun area(): Double {
        return  base * height
    }
}