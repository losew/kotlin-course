package com.example.kotlincourse.lessons.lesson16.homework.animals

import com.example.kotlincourse.lessons.lesson16.homework.Colors


class Bird(name: String): Animal(name) {
    override fun makeSound() {
        println("${Colors.YELLOW}$name Tweet${Colors.RESET}")
    }
}