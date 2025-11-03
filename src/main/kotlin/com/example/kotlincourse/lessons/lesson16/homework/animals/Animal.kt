package com.example.kotlincourse.lessons.lesson16.homework.animals

abstract class Animal(val name: String) {
    open fun makeSound() = println("This animal makes no sound.")
}