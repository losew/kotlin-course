package org.losewmac.kotlincourse.lesson5

import java.lang.Exception

fun main() {
    printSoundDecrease (startSound = 100.0, coefficientExperimental = null)
    printTotalCostDelivery (costDelivery = null, insuranceDelivery = 0.5)
    printWeatherPreasure (atmospherePreasure = null)
}

// Оператор элвиса.
// Задание выполняется в виде функций, принимающих один или более аргументов. Все функции должны быть вызваны из функции main() в вариантах с null и с вещественным значением.

// Контекст: Вы изучаете физическое явление затухания звука в помещении. У вас есть измеренное значение начальной интенсивности звука, но из-за ограничений оборудования данные о коэффициенте затухания иногда могут быть неизвестны.
// Задача: Рассчитать предполагаемую интенсивность звука после затухания. Интенсивность звука после затухания пропорциональна начальной интенсивности, умноженной на коэффициент затухания. Если коэффициент затухания неизвестен, использовать стандартное значение 0.5.

fun printSoundDecrease(startSound: Double, coefficientExperimental: Double?) {
    val coefficientExperimental = coefficientExperimental ?: 0.5
    println("Интенсивность звука после затухания: " + startSound * coefficientExperimental)
}

// Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз, которая составляет 0,5% от его стоимости. В случае, если стоимость не указана, то берётся стандартная стоимость в $50
// Задача: Рассчитать полную стоимость доставки.

fun printTotalCostDelivery(costDelivery: Int?, insuranceDelivery: Double){
    val costDelivery = costDelivery ?: 50
    println("Полная стоимость доставки: " + costDelivery * insuranceDelivery)
}

// Контекст: Вы проводите метеорологические измерения. Одним из важных показателей является атмосферное давление, которое должно быть зафиксировано. Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять.
// Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.

fun printWeatherPreasure(atmospherePreasure: Int?){
    val atmospherePreasure = atmospherePreasure ?: throw Exception("Нет данных об атмосферном давлении")
    println("Атмосферное давление: " + atmospherePreasure)
}