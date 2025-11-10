package com.example.kotlincourse.lessons.lesson17.homeworks

//Игровой автомат
//Опиши схематически класс игрового автомата, правильно расставив объявление полей (val или var) и методов (аргументы и возвращаемые значения), включая модификаторы доступа (private для приватных)
//___Поля:
//цвет
//модель
//включен
//ОС загружена
//список установленных игр
//наличие джойстика
//баланс вырученных средств
//владелец
//телефон поддержки.
//игровой сеанс оплачен
//стоимость одного игрового сеанса
//пин-код автомата
//___Методы:
//включить
//выключить
//загрузить ОС
//завершить работу ОС
//показать список игр
//включить игру
//оплатить игровой сеанс
//забрать наличные с помощью пин-кода
//открыть сейф и выдать наличные

class GameMachine(
    val color: String,
    val model: String,
    val hasGamePad: Boolean,
) {
    private var isOn = false
    private var osIsLoaded = false
    private val listOfGames = mutableListOf("Tetris", "Tanks")
    private var balance = 0.00
    private var owner = ""
    var supportPhone = ""
    private var gameTimeIsCharged = false
    private var costOfGameTime = 10.00
    private var pinCode = "1234"

    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    private fun loadOS(){
        println("OS is loaded")
    }

    private fun shutDownOS(){
        println("OS is stopped")
    }

    fun showGamesList(){
        println(listOfGames.toString())
    }

    fun playGame(gameName: String){
        if (this.gameTimeIsCharged){
            println("Пополни баланс")
            return
        }
        println("Игра запущена")
    }

    fun pay(){
        balance += costOfGameTime
    }

    fun takeMoney(pin: String): Double {
        if (pin != this.pinCode){
            return 0.00
        }
        return giveMoney()
    }

    private fun giveMoney(): Double {
        val takeMoney = balance
        balance = 0.00
        return takeMoney
    }

}