package com.example.kotlincourse.lessons.lesson14.homeworks

class Emotion(
    var type: String,
    var intensity: Int
) {
    fun express() {
        val message = when (intensity) {
            in 1..30 -> "У вас ${type} легкого уровня"
            in 31..60 -> "У вас ${type} среднего уровня"
            in 61..100 -> "У вас ${type} сильного уровня"
            else -> "Что?"
        }
        println(message)
    }
}