package com.example.kotlincourse.lessons.lesson18.homeworks

abstract class TemperatureControlledDevice (
    override val maxTemperature: Int
) : ProgrammedDevice(), TemperatureRegulatable, Openable {

    protected var currentTemperature: Int = 0
    protected var isPoweredOn: Boolean = false
    private var isOpen: Boolean = false

    override fun powerOn() {
        isPoweredOn = true
        println("Подключено")
    }

    override fun powerOff() {
        isPoweredOn = false
        println("Выключено")
    }

    override fun setTemperature(temp: Int) {
        if (!isPoweredOn) {
            println("Устройство не подключено")
            return
        }
        if (temp in 0..maxTemperature) {
            currentTemperature = temp
            println("Температура - $currentTemperature°C.")
        } else {
            println("Температура - $temp°C еще немного и будет - $maxTemperature°C.")
        }
    }

    override fun open() {
        if (!isPoweredOn) {
            println("Не могу открыть")
            return
        }
        if (!isOpen) {
            isOpen = true
            println("Открыто.")
        } else {
            println("Уже открыто")
        }
    }

    override fun close() {
        if (isOpen) {
            isOpen = false
            println("Закрыто")
        } else {
            println("Уже закрыто")
        }
    }
}