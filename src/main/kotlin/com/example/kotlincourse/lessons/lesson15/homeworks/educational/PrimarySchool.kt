package com.example.kotlincourse.lessons.lesson15.homeworks.educational

class PrimarySchool(
    name: String,
    level: String
): School(name, level) {
    fun getBasicProgram(): String {
        return "Check basic program on site: https://psnumberone.com"
    }
}