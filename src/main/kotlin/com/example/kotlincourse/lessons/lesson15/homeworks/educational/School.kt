package com.example.kotlincourse.lessons.lesson15.homeworks.educational

open class School(
    name: String,
    val level: String): EducationalInstitution(name) {

    fun getDescription(): String{
        return "Welcome to $level school"
    }

}