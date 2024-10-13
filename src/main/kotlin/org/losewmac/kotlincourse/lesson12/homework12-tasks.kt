package org.losewmac.kotlincourse.lesson12

import java.lang.reflect.AnnotatedTypeVariable

fun main() {
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