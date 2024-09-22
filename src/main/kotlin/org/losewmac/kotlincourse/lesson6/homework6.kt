package org.losewmac.kotlincourse.lesson6

fun main(){
    println(getYearSeason(9)) // Задание 1: Определение сезона
    println(getCalculatedPetAge(3.0)) // Задание 2: Расчет возраста питомца
    println(getTransport(9.0)) // Задание 3: Определение вида транспорта
    println(getCalculateBonuses(1001.0)) // Задание 4: Расчет бонусных баллов
    println(getDocumentType("txt")) // Задание 5: Определение типа документа
    println(conversion(18.0, "C")) // Задание 6: Конвертация температуры
    println(selectClothes(15)) // Задание 7: Подбор одежды по погоде
    println(getMovieByAge(19)) // Задание 8: Выбор фильма по возрасту
}

// Задание 1: "Определение Сезона"
// Контекст: Напишите функцию, которая на основе номера месяца возвращает сезон года.

fun getYearSeason(monthNumber: Int): String {
    if (monthNumber !in 1..12) {
        throw Exception("Некорректный номер месяца")
    } else {
        val season: String = when (monthNumber) {
            in 3..5 -> "Весна"
            in 6..8 -> "Лето"
            in 9..11 -> "Осень"
            else -> "Зима"
        }
        return season
    }
}

// Задание 2: "Расчет Возраста Питомца"
// Контекст: Создайте функцию, которая преобразует возраст собаки в "человеческие" годы. До 2 лет каждый год собаки равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам.

fun getCalculatedPetAge(petAge: Double): Double{
    val calculatedPetAge: Double = if (petAge in 0.0..2.0) {petAge * 10.5} else {(petAge - 2) * 4 + 2 * 10.5}
    return calculatedPetAge
}

// Задание 3: "Определение Вида Транспорта"
// Контекст: Напишите функцию, которая определяет, какой вид транспорта лучше использовать, исходя из длины маршрута. Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".

fun getTransport(distance: Double): String{
    if (distance <= 0) {throw Exception("Дистанция маршрута должна быть больше нуля")} else {
        val transport: String = when {
            distance <= 1 -> "пешком"
            distance in 1.0..5.0 -> "велосипед"
            else -> "автотранспорт"
        }
        return transport
    }
}

// Задание 4: "Расчет Бонусных Баллов"
// Контекст: Клиенты интернет-магазина получают бонусные баллы за покупки. Напишите функцию, которая принимает сумму покупки и возвращает количество бонусных баллов: 2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и 5 баллов за каждые 100 рублей при сумме свыше этого.
fun getCalculateBonuses(purchaseSum: Double): Double {
    if (purchaseSum <= 0) {throw Exception("Сумма покупки должна быть больше нуля")} else {
        val calculatedBonuses: Double = when {
            purchaseSum > 1000.0 -> (purchaseSum / 100) * 5
            purchaseSum in 100.0..1000.0 -> (purchaseSum / 100) * 2
            else -> 0.0
        }
        return calculatedBonuses
    }
}

// Задание 5: "Определение Типа Документа"
// Контекст: В системе хранения документов каждый файл имеет расширение. Напишите функцию, которая на основе расширения файла возвращает его тип: "Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".

fun getDocumentType(extension: String): String{
    return when (extension){
        in listOf("txt", "doc") -> "Текстовый документ"
        in listOf("jpeg") -> "Изображение"
        in listOf("xls") -> "Таблица"
        else -> "Неизвестный тип"
    }
}

// Задание 6: "Конвертация Температуры"
// Контекст: Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот в зависимости от указанной единицы измерения (C/F). Единицу измерения нужно передать вторым аргументом функции. Несколько аргументов передаются через запятую. Возвращать нужно строку. Подсказка: для генерации строки из числа и буквы можно использовать шалон “$result F” для фаренгейта или “$result C” для цельсия

fun conversion(temperature: Double, scale: String): String {
    return when (scale) {
        "C" -> {
            val result = temperature * 9 / 5 + 32
            "$result F"
        }
        "F" -> {
            val result = (temperature - 32) * 5 / 9
            "$result C"
        }
        else -> {
            "Invalid scale"
        }
    }
}

//Задание 7: "Подбор Одежды по Погоде"
//Контекст: Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды: "куртка и шапка" при температуре ниже 0, "ветровка" от 0 до 15 градусов и "футболка и шорты" при температуре выше 15. При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.

fun selectClothes(temperature: Int): String{
    return when {
        temperature > 35 || temperature < -30 -> "из дома не выходить"
        temperature in -1 downTo -30 -> "куртка и шапка"
        temperature in 0 ..15 -> "ветровка"
        temperature > 15 -> "футболка и шорты"
        else -> ""
    }
}

// Задание 8: "Выбор Фильма по Возрасту"
// Контекст: Кинотеатр предлагает фильмы разных возрастных категорий. Напишите функцию, которая принимает возраст зрителя и возвращает доступные для него категории фильмов: "детские", "подростковые", "18+".

fun getMovieByAge(age: Int): String{
    if (age <= 0) {
        throw Exception("Некорректное значение возраста")} else
        return when {
            age in 5..10 -> "детские"
            age in 5 until 18 -> "подростковые"
            age >= 18 -> "18+"
            else -> "Вход запрещен"
        }
}

