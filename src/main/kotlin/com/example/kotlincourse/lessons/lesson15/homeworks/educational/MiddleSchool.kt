package com.example.kotlincourse.lessons.lesson15.homeworks.educational

class MiddleSchool(
    name: String,
    level: String
): School(name, level) {
    fun getSchoolName(): String {
        return name
    }
}