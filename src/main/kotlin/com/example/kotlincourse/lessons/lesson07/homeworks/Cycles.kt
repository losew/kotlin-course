package com.example.kotlincourse.lessons.lesson07.homeworks

fun main() {

    println("#1")
//Задания для цикла for
//Прямой диапазон
//1. Напишите цикл for, который выводит числа от 1 до 5.
    for (a in 1..5) {
        println(a)
    }

    println("#2")
//2. Напишите цикл for, который выводит четные числа от 1 до 10.
    for (b in 1..10) {
        if (b % 2 == 0) {
            println(b)
        }
    }

    println("#3")

//Обратный диапазон
//3. Создайте цикл for, который выводит числа от 5 до 1.
    for (c in 5 downTo 1) {
        println(c)
    }

    println("#4")
//4. Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    for (d in 10 downTo 1) {
        println(d - 2)
    }

    println("#5")

//С шагом (step)
//5. Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
    for (e in 1..9 step 2) {
        println(e)
    }

    println("#6")
//6. Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
    for (f in 1..20 step 3) {
        println(f)
    }

    println("#7")
//Использование до (until)
//7. Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.
    val size = 10
    for (g in 3 until size) {
        println(g)
    }

    println("#8")
//Задания для цикла while
//Цикл while
//8. Создайте цикл while, который выводит квадраты чисел от 1 до 5.
    var h = 0
    while (h++ < 5) {
        println(h * h)
    }

    println("#9")
//9. Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль.
    var i = 10
    while (i-- > 5) {
    }
    println(i)

    println("#10")
//Цикл do while
//10. Используйте цикл do while, чтобы вывести числа от 5 до 1.
    var j = 5
    do {
        println(j)
        j--
    } while (j >= 1)

    println("#11")
//11. Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
    var counter = 5
    do {
        println(counter)
        counter++
    } while (counter < 10)

    println("#12")
//Задания для прерывания и пропуска итерации
//Использование break
//12. Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    for (k in 1..10) {
        if (k > 6) break
        println(k)
    }

    println("#13")
//13. Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
    var l = 1
    do {
        println(l)
        l++
    } while (l < 10)

    println("#14")
//Использование continue
//14. В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    for (m in 1..10) {
        if (m % 2 == 0) continue
        println(m)
    }

    println("#15")
//15. Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
    var n = 1
    do {
        if (n % 3 !== 0)
            println(n)
        n++
    } while (n <= 10)

}