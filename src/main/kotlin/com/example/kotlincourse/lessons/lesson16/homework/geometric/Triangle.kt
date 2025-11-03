package com.example.kotlincourse.lessons.lesson16.homework.geometric

class Triangle(
    private val height: Double,
    private val base: Double): Shape()   {
    override fun area(): Double {
        return (base * height)/2
    }
}