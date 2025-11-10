package com.example.kotlincourse.lessons.lesson18.homeworks

class SuperFridge(maxTemperature: Int) : TemperatureControlledDevice(maxTemperature) {
    fun cool() {
        if (!isPoweredOn) {
            println("Выключено и него не работает.")
            return
        }
        println("Охлаждаем до - $currentTemperature°C.")
    }

    override fun operate() {
        TODO("Not yet implemented")
    }
}