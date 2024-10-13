package org.losewmac.kotlincourse.lesson12

fun main() {
    drawRectangle(20, 20)
}

// Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.
fun function1 () {
    // тело функции
}

// Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.
fun function2 (first2: Int, second2: Int): Int {
    return first2 + second2
}

// Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.
fun function3 (text3: String) {
    // тело функции
}

// Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.
fun function4 (list4: List<Int>): Double{
    // тело функции
    return TODO("Provide the return value")
}

// Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.
fun function5 (text5: String?): Int? {
    // тело функции
    return TODO("Provide the return value")
}

// Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.
fun function6 (): Double? {
    // тело функции
    return TODO("Provide the return value")
}

// Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.
fun function7 (list7: List<Int>?) {
    // тело функции
}

// Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.
fun function8 (variable8: Int): String? {
    // тело функции
    return TODO("Provide the return value")
}

// Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.
fun function9 (): List<String>? {
    // тело функции
    return TODO("Provide the return value")
}

// Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun function10 (text10: String?, variable1: Int?): Boolean? {
    // тело функции
    return TODO("Provide the return value")
}

// Напиши рабочий код для следующих задач:
// Задача 1:
// Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo (variable11: Int): Int {
    return variable11 * 2
}

// Задача 2:
// Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven (variable12: Int): Boolean {
    if (variable12 % 2 == 0) {
        return true
    } else {
        return false
    }
}

// Задача 3:
// Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n. Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil (variable13: Int) {
    if (variable13 < 1)
        return
    for (i in 1..variable13) {
        println(i)
    }
}

// Задача 4:
// Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative (variable14: List<Int>): Int? {
    for (i in variable14) {
        if (i < 0) {
            return i
        }
    }
    return null
}

// Задача 5:
// Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.

fun processList(variable15: List<String?>) {
    for (string in variable15) {
        if (string == null) return
        println(string)
    }
}

/*Сделай рефакторинг функции, через определение вспомогательных приватных функций. Требуется избавиться от дублирования кода и трудно воспринимаемых фрагментов. Сначала сделай запуск функции и посмотри на результат её работы. Сделай запуск после рефакторинга и проверь, чтобы результат работы был аналогичным.*/

private fun checkSize(xy: Int, result: String) {
    if (xy <= 0) throw IllegalArgumentException("$result width должно быть положительным и больше нуля")
}

fun drawRectangle(width: Int, height: Int) {
    checkSize(width, "width")
    checkSize(height, "height")

    // Верхняя граница
    var topLine = "+"
    for (i in 1 until width - 1) {
        topLine += "-"
    }
    topLine += "+\n"
    print(topLine)

    // Боковые границы
    for (i in 1 until height - 1) {

        var middleLine = "|"
        for (j in 1 until width - 1) {
            middleLine += " "
        }
        middleLine += "|\n"
        print(middleLine)
    }

    // Нижняя граница
    var bottomLine = "+"
    for (i in 1 until width - 1) {
        bottomLine += "-"
    }
    bottomLine += "+\n"
    print(bottomLine)
}