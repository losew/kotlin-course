package com.example.kotlincourse.lessons.lesson15.homeworks.educational

class College(name: String, private val courses: List<String>) : EducationalInstitution(name) {
    fun getCourseList(): String {
        return "$name has following courses: ${courses.joinToString(", ")}."
    }
}