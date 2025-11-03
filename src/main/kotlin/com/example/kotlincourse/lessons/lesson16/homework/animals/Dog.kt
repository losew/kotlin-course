package com.example.kotlincourse.lessons.lesson16.homework.animals

import com.example.kotlincourse.lessons.lesson16.homework.Colors

class Dog(name: String): Animal(name) {
    override fun makeSound() {
        println("${Colors.PURPLE}$name Bark${Colors.RESET}")
    }
}