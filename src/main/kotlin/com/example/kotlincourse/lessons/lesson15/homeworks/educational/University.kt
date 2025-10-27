package com.example.kotlincourse.lessons.lesson15.homeworks.educational

class University(name: String, private val facultyCount: Int): EducationalInstitution(name) {
    fun getFacultyCount(): Int{
        return facultyCount
    }
}