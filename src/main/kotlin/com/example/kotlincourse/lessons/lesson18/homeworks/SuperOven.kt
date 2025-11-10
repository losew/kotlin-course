package com.example.kotlincourse.lessons.lesson18.homeworks

class SuperOven(maxTemperature: Int) : TemperatureControlledDevice(maxTemperature) {
    fun bake() {
        if (!isPoweredOn) {
            println("Надо дать энергии")
            return
        }
        println("Жгу как не в себя, скоро будет - $currentTemperature°C.")
    }

    override fun operate() {
        TODO("Not yet implemented")
    }
}