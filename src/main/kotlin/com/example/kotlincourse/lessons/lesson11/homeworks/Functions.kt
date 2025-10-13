package com.example.kotlincourse.lessons.lesson11.homeworks

fun main() {
}

//Задачи на сигнатуру метода
//Напишите сигнатуру метода в которую входит модификатор доступа, название функции, список аргументов с типами и возвращаемое значение. В теле метода можешь сделать возврат объекта нужного типа если это требуется для устранения ошибок.
//1. Не принимает аргументов и не возвращает значения.
fun function1() {
}

//2. Принимает два целых числа и возвращает их сумму.
fun function2(first2: Int, second2: Int): Int {
    return first2 + second2
}

//3. Принимает строку и ничего не возвращает.
fun function3(text3: String) {
}

//4. Принимает список целых чисел и возвращает среднее значение типа Double.
fun function4(list4: List<Int>): Double {
    return TODO("Provide the return value")
}

//5. Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
fun function5(text5: String?): Int? {
    return TODO("Provide the return value")
}

//6. Не принимает аргументов и возвращает nullable вещественное число.
fun function6(): Double? {
    // тело функции
    return TODO("Provide the return value")
}

//7. Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun function7(list7: List<Int>?) {
    // тело функции
}

//8. Принимает целое число и возвращает nullable строку.
fun function8(variable8: Int): String? {
    return TODO("Provide the return value")
}

//9. Не принимает аргументов и возвращает список nullable строк.
fun function9(): List<String>? {
    return TODO("Provide the return value")
}

//10. Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun function10(text10: String?, variable1: Int?): Boolean? {
    return TODO("Provide the return value")
}

//Задачи на написание кода
//Напишите валидную сигнатуру метода а так же рабочий код для задач.
//11. Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(variable11: Int): Int {
    return variable11 * 2
}

//12. Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(variable12: Int): Boolean {
    if (variable12 % 2 == 0) {
        return true
    } else {
        return false
    }
}

//13. Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n. Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(variable13: Int) {
    if (variable13 < 1)
        return
    for (i in 1..variable13) {
        println(i)
    }
}

//14. Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(variable14: List<Int>): Int? {
    for (i in variable14) {
        if (i < 0) {
            return i
        }
    }
    return null
}

//15. Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(variable15: List<String?>) {
    for (string in variable15) {
        if (string == null) return
        println(string)
    }
}
