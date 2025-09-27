package com.example.kotlincourse.lessons.lesson07.homeworks

import kotlin.enums.enumEntries

fun main() {

// 1. Используя вложенный цикл реализовать таблицу умножения, как на картинке.
    for (i in 1..10) { // цикл печати таблицы
        for (j in 1..10) { // цикл печати строки
            print("%4d".format(i * j))
        }
        println() // первод строки
    }

// 2. Напишите функцию, которая суммирует числа от 1 до 'arg' с помощью цикла for. 'arg' - целочисленный аргумент функции.
    val arg = 10
    var summa = 0
    for (n in 1..arg) {
        summa = summa + n
    }
    println(summa)


// 3. Напишите функцию, которая вычисляет факториал числа 'arg' с использованием цикла while.
    var counter = 1
    var factorial = 1
    var arg3 = 10
    while (counter++ < arg3) {
        factorial *= counter
    }
    println(factorial)


// 4. Напишите функцию, которая находит сумму всех четных чисел от 2 до 'arg', используя цикл while.
    var counter4 = 1
    var sum = 0
    var arg4 = 100
    while (counter4++ < arg4) {
        if (counter4 % 2 == 0) sum += counter4
    }
    println(sum)

// 5. Напишите функцию, которая используя вложенные циклы while, выведет заполненный прямоугольник размером 5x3 из символов *.
    for (p in 1..3) {
        for (q in 1..5) {
            print("*  ")
        }
        println()
    }

// 6. Напишите функцию, которая используя цикл for найдёт суммы чётных и нечётных значений чисел от 1 до arg.
    var summaOdd = 0
    var summaEven = 0
    var arg6 = 100
    for (i in 1..arg6) {
        if (i % 2 == 0) summaOdd += i
        else summaEven += i
}
println("$summaOdd, $summaEven")


}