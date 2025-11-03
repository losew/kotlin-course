package com.example.kotlincourse.lessons.lesson16.homework.animals

import com.example.kotlincourse.lessons.lesson16.homework.Colors

class Cat(name: String): Animal(name) {
    override fun makeSound() {
        println("${Colors.BLUE}$name Meow${Colors.RESET}")
    }
}