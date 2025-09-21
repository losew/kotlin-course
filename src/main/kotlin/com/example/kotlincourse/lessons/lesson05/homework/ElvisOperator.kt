package com.example.kotlincourse.lessons.lesson05.homework

fun main() {

    // task 1
    val baseIntensity: Double = 50.0
    val coefficient: Double? = 0.65 // может быть null
    val baseCoefficient: Double = 0.5
    val resultIntensity = baseIntensity * (coefficient ?: baseCoefficient)
    println("Интенсивность звука после затухания " + resultIntensity)

    // task 2
    val defaultCost: Double = 50.0
    val cost: Double? = 20.0 // может быть null
    val deliveryCost = 5.0
    val insuranceCoefficient = 0.005
    // стоимость страховки
    val insuranceCost = (cost ?: defaultCost) * insuranceCoefficient
    val totalCost: Double = deliveryCost + insuranceCost
    println("Полная стоимость доставки: " + totalCost)

    // task 3
    val pressure: String? = "760" // но может быть null
    val attentionMessage = "Внимание, показатель давления отсутствует!"
    val pressureForLab = pressure ?: attentionMessage
    println("Давление: " + pressureForLab)

}