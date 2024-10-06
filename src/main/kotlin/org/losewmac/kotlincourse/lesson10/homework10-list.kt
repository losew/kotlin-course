package org.losewmac.kotlincourse.lesson10

fun main() {

// Задание 1: Создание Пустого Списка
// Создайте пустой неизменяемый список целых чисел.
    val list1 = listOf<Int>()

// Задание 2: Создание и Инициализация Списка
// Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val list2 = listOf("Hello", "World", "Kotlin")

// Задание 3: Создание Изменяемого Списка
// Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val list3 = mutableListOf(1, 2, 3, 4, 5)

// Задание 4: Добавление Элементов в Список
// Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    val list4 = mutableListOf(1, 2, 3, 4, 5)
    list4.add(6)
    list4.add(7)
    list4.add(8)

// Задание 5: Удаление Элементов из Списка
// Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val list5 = mutableListOf("Hello", "World", "folks")
    list5.remove("World")

// Задание 6: Перебор Списка в Цикле
// Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val list6 = listOf(1, 2, 3, 4, 5)
    for (i in list6){
        println(i)
    }

// Задание 7: Получение Элементов Списка по Индексу
// Создайте список строк и получите из него второй элемент, используя его индекс.
    val list7 = listOf("Каждый", "охотник", "желает")
    println(list7[1])

// Задание 8: Перезапись Элементов Списка по Индексу
// Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент на позиции 2 на новое значение).
    val list8 = mutableListOf("Папа ", "мама ", "и ", "я")
    list8[2] = "тетя "

// Задание 9: Объединение Двух Списков
// Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
    val list9 = listOf("one", "two", "three")
    val secondList9 = listOf("four", "five", "six")
    val unitedList = mutableListOf<String>()
    for (element in list9){
        unitedList.add(element)
    }
    for (element in secondList9){
        unitedList.add(element)
    }
    println(unitedList)

// Задание 10: Нахождение Минимального/Максимального Элемента
// Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    val list10 = listOf(0, 212, 23, 11, -5, 10, -155)
    var minValue = 0
    var maxValue = 0
    for (i in list10) {
        if (i < minValue) {
            minValue = i
        }
        if (i > maxValue) {
            maxValue = i
        }
    }
    println("Минимальное число: $minValue")
    println("Максимальное число: $maxValue")

// Задание 11: Фильтрация Списка
// Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val list11 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = mutableListOf<Int>()
    for (i in list11){
        if (i % 2 == 0){
            evenList.add(i)
        }
    }
    println(evenList)


}