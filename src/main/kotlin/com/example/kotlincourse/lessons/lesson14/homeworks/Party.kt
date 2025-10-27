package com.example.kotlincourse.lessons.lesson14.homeworks

class Party ( var location: String, var attendees: Int) {
    fun details () {
        println("место проведение Party - ${location} и гостей будет ${attendees}")
    }
}