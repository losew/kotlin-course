package org.losewmac.kotlincourse.lesson8

fun main() {
    println(convertor1("Это невозможно выполнить за один день"))
    println(convertor2("Я не уверен в успехе этого проекта"))
    println(convertor3("Произошла катастрофа на сервере"))
    println(convertor4("Этот код работает без проблем"))
    println(convertor5("Удача"))

//Задание 1: Извлечение Даты из Строки Лога. Используй indexOf или split для получения правой части сообщения.
//Описание: У вас есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23". Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди.

    val logsFromServer = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    val cutLogsFromServer = logsFromServer.indexOf(">")
    println(logsFromServer.substring(cutLogsFromServer + 2))

//Задание 2: Маскирование Личных Данных
//Описание: Дана строка с номером кредитной карты "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних четырех, символами "*".



}


fun convertor1(string: String): String {
    return when {
        string.contains("невозможно", true) -> string.replace(
            "невозможно",
            "совершенно точно возможно, просто требует времени",
            true
        )
        else -> string
    }
}

fun convertor2(string: String): String {
    return when {
        string.startsWith("я не уверен", true) -> "$string, но моя интуиция говорит об обратном"
        else -> string
    }
}

fun convertor3(string: String): String {
    return when {
        string.contains("катастрофа", true) -> string.replace(
            "а катастрофа",
            "о интересное событие",
            true
        )
        else -> string
    }
}

fun convertor4(string: String): String {
    return when {
        string.endsWith("без проблем", true) -> string.replace(
            "без проблем",
            "с парой интересных вызовов на пути",
            true
        )
        else -> string
    }
}

fun convertor5(string: String): String {
    return when {
        string.contains("удача", true) -> "Иногда ${string.lowercase()}, но не всегда"
        else -> string
    }
}


/*Задание 3: Форматирование Адреса Электронной Почты. Используй replace
Описание: У вас есть электронный адрес "username@example.com". Преобразуйте его в строку "username [at] example [dot] com".

Задание 4: Извлечение Имени Файла из Пути
Описание: Дан путь к файлу "C:/Пользователи/Документы/report.txt". Извлеките название файла с расширением.

Задание 5: Создание Аббревиатуры из Фразы. Используй split с набором символов для разделения. Используй for для перебора слов. Используй var переменную для накопления первых букв.
Описание: У вас есть фраза, например "Объектно-ориентированное программирование". Создайте аббревиатуру из начальных букв слов (например, "ООП").*/
