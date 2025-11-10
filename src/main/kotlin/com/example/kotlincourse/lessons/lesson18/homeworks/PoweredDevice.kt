package com.example.kotlincourse.lessons.lesson18.homeworks

abstract class PoweredDevice : Powerable {

    override fun powerOn() {
        println("Включен")
    }

    override fun powerOff() {
        println("Выключен")
    }
}