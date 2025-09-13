package com.example.kotlincourse.lessons.lesson3

// показывал классную работу

const val wheels = 4

class Auto {

    private val vincode: String = "VAR33309"
    var color: String = "blue"
    var mileage: Int = 0 + 5
    lateinit var ownername: String

    val utilreport: String by lazy {
        "sample text"
    }

}

val test = 1

