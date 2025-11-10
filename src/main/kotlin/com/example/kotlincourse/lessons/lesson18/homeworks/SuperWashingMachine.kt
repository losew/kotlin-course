package com.example.kotlincourse.lessons.lesson18.homeworks

class SuperWashingMachine(maxTemperature: Int) : TemperatureControlledDevice(maxTemperature) {
    fun startWashCycle() {
        if (!isPoweredOn) {
            println("Нужно подключить")
            return
        }
        println("Мы начали работу и греемся до $currentTemperature°C.")
    }

    override fun operate() {
        TODO("Not yet implemented")
    }
}