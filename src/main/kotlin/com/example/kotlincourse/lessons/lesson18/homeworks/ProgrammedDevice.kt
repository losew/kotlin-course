package com.example.kotlincourse.lessons.lesson18.homeworks

abstract class ProgrammedDevice : PoweredDevice(), Programmable {

    override fun programAction(action: String) {
        println("$action - добавлено")
    }

    override fun execute() {
        println("Executing programmed")
    }
}