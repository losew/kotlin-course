package com.example.kotlincourse.lessons.lesson09.homeworks

fun main() {

//    Работа с массивами Array
//    1. Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val arr1: Array<Int> = arrayOf(1, 2, 3, 4, 5)

//    2. Создайте пустой массив строк размером 10 элементов.
    val arr2 = Array<String>(10) { "" }

//    3. Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val arr3: Array<Double> = Array(5) { 0.0 }
    for (i in arr3.indices) {
        arr3[i] = (i * 2).toDouble()
    }

//    4. Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
    val arr4: Array<Int> = Array(5) { 0 }
    for (i in arr4.indices) {
        arr4[i] = (i * 3).toInt()
    }

//    5. Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val arr5 = arrayOfNulls<String?>(3)
    arr5[0] = null
    arr5[1] = "один"
    arr5[2] = "два"

//    6. Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val arr6 = arrayOf(1, 2, 3, 4)
    val newArr6 = Array(4) { 0 }
    for (i in arr6.indices) {
        newArr6[i] = arr6[i]
    }

//    7. Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого. Распечатайте полученные значения.
    val arr7 = arrayOf(3, 5, 7, 9)
    val secondArr7 = arrayOf(2, 3, 4, 5)
    val newArr7 = Array(4) { 0 }
    for (i in arr7.indices) {
        newArr7[i] = arr7[i] - secondArr7[i]
    }
    println(newArr7.contentToString())

//    8. Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.
    val arr8 = arrayOf(0, 1, 2, 3, 4, 5, 6, 7)
    var i = 0
    while (i < arr8.lastIndex) {
        if (arr8[i] == 5) {
            println(arr8[i])
        } else {
            println(-1)
        }
        i++
    }

//    9. Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    val arr9 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (index in arr9.indices) {
        if (arr9[index] % 2 == 0) {
            println("${arr9[index]} - чётное")
        } else {
            println("${arr9[index]} - нечётное")
        }
    }

//    10. Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.
val arr10 = arrayOf("раз", "два", "три", "четыре", "пять" )
val searchString = "четыре"
println(search(arr10, searchString))
}

fun search(arr10: Array<String>, searchString: String?): String {
    if (searchString != null) {
        for (i in arr10) {
            if (i.contains(searchString)) {
                return i
            } else{
                Unit
            }
        }
    }
    return "не найдено"
}


fun list() {
//Работа со списками List
//1. Создайте пустой неизменяемый список целых чисел.
    val list1 = listOf<Int>()

//2. Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val list2 = listOf("Hello", "World", "Kotlin")

//3. Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val list3 = mutableListOf(1, 2, 3, 4, 5)

//4. Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    val list4 = mutableListOf(1, 2, 3, 4, 5)
    list4.add(6)
    list4.add(7)
    list4.add(8)

    //5. Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val list5 = mutableListOf("Hello", "World", "folks")
    list5.remove("World")

//6. Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val list6 = listOf(1, 2, 3, 4, 5)
    for (i in list6){
        println(i)
    }

//7. Создайте список строк и получите из него второй элемент, используя его индекс.
    val list7 = listOf("Каждый", "охотник", "желает")
    println(list7[1])

//8. Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент с индексом 2 на новое значение).
    val list8 = mutableListOf("Папа ", "мама ", "и ", "я")
    list8[2] = "тетя "

//9. Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
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

//10. Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
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

//11. Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val list11 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = mutableListOf<Int>()
    for (i in list11){
        if (i % 2 == 0){
            evenList.add(i)
        }
    }
    println(evenList)


}


fun set() {

// Работа с Множествами Set
//1. Создайте пустое неизменяемое множество целых чисел.
    val set1 = setOf<Int>()

//2. Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val set2 = setOf(1, 2, 3)

//3. Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
    val set3 = mutableSetOf("Kotlin", "Java", "Scala")

//4. Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    val set4 = mutableSetOf("Kotlin", "Java", "Scala")
    set4.add("Swift")
    set4.add("Go")

//5. Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val set5 = mutableSetOf(1, 2, 3, 4, 5)
    set5.remove(2)

//6. Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    val set6 = setOf(1, 2, 3, 4, 5)
    for (i in set6){
        println(i)
    }

//7. Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка. Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
    val set7 = setOf("раз", "два", "три", "четыре", "пять")
    val searchString = "два"
    var checker: Boolean = false
    for (i in set7){
        if (i == "три"){
            checker = true
        }
        println(checker)

//8. Создайте множество строк и конвертируйте его в изменяемый список строк с использованием цикла.
        val set8 = setOf("один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь")
        val list8 = mutableListOf<String>()
        for (i in set8){
            list8.add(i)
        }
        println(list8)
    }


}