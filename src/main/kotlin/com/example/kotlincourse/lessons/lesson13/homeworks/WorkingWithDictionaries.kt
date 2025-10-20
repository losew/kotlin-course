package com.example.kotlincourse.lessons.lesson13.homeworks

fun main(){

//    1. Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.
    val m1 = mapOf("Test1" to 6.0, "Test2" to 7.0, "Test3" to 8.0, "Test4" to 9.0)

    val entries = m1.entries
    val values = m1.values.sum() / m1.size
//    println(entries)
    println("1. $values")

//    2. Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными. Выведите список всех тестовых методов.
    val keys = m1.keys
    println("2. $keys")

//    3. В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val newM1 = m1 + ("Test 5" to 10.0) //создаем новый словарь + новая пара, на основе неизменяемого m1
    println("3. $newM1")

//    4. Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из passed, failed, skipped).
    val m4 = mapOf("Test1" to "passed", "Test2" to "skipped", "Test3" to "passed", "Test4" to "failed", "Test 5" to "failed")
    val valueCounts = m4.count { it.value == "passed" }
    println("4. Успешных тестов: $valueCounts")

//    5. Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен (ключ - название, значение - статус исправления).
    val m5 = m4.toMutableMap()
    m5.remove("Test1")
    println("5. $m5 - удалили 1-й элемент по ключу")

//    6. Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
    m4.forEach {
        println("6. ${it.key} status ${it.value}")
    }

//    7. Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    val m7 = mapOf(
        "Service_1" to 100,
        "Service_2" to 200,
        "Service_3" to 300,
        "Service_4" to 400,
        "Service_5" to 500
    )
    val respTimeServ = m7.filter { it.value < 300 }
    println("7. Время ответа $respTimeServ")

//    8. В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки). Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val m8 = mapOf("EndPoint_1" to "200 OK", "EndPoint_2" to "500 OK", "EndPoint_3" to "Not found")
    val testAPI = m8.getOrElse("EndPoint_4") { "не был протестирован" }
    println("8. TestAPI $testAPI")

//    9. Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации, значение - сама конфигурация), получите значение для "browserType". Ответ не может быть null.
    val m9 = mapOf("browserType" to "Google Chrome", "timeout" to "30s")
    println(m9.getValue("browserType"))

//    10. Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    val m10 = m9 + ("browserType_2" to "Яндекс Браузер")
    println("10. $m10")

//    11. Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства, значение - строка с настройками), получите настройки для конкретной модели или верните настройки по умолчанию.
    val m11 = mapOf("iPhone" to "Обновить", "Samsung" to "Перезагрузить")
    println(m11.getOrDefault("Samsung", "выключай уже"))

//    12. Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
    val m12 = mapOf(404 to "Not Found", 500 to "Server Error")
    println(m12.containsKey(404))

//    13. Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version", а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов, то-есть в ключе содержится требуемая версия.
    val m13 = mapOf("TestID_1.0" to "Passed", "TestID_2.0" to "Failed", "TestID_3.0" to "Skipped")
    println(m13.filterKeys { it.endsWith("2.0") })

//    14. У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
    val m14 = mapOf("Module1" to "Passed", "Module2" to "Failed")
    println(m14.filterValues { it == "Failed" }.keys)

//    15. Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val m15 = mutableMapOf("Proc" to "i7", "SSD" to "2TB")
    val additionalSettings = mapOf("RAM" to "16GB")
    m15.putAll(additionalSettings)
    println(m15)

//    16. Объедините два неизменяемых словаря с данными о багах.
    val bugs1 = mapOf("bug1" to "open")
    val bugs2 = mapOf("bug2" to "closed")
    val bugs3 = bugs1 + bugs2
    println(bugs3)

//    17. Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    val tempData = mutableMapOf("temp1" to "data")
    tempData.clear()
    println(tempData)

//    18. Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”). Ключи - название теста, значения - статус.
    val testResultsWithSkipped =
        mapOf("test1" to "Passed", "test2" to "Skipped", "test3" to "Skipped", "test4" to "Passed")
    val testResultsWithSkipped1 = testResultsWithSkipped.filter { it.value == "Skipped" }
    println(testResultsWithSkipped1)

//    19. Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
    val m19 = mutableMapOf("Proc" to "i7", "SSD" to "2TB", "RAM" to "16GB")
    val keysToRemove = setOf("Proc", "SSD")
    val publicConfig = m19.filterKeys { key -> key !in keysToRemove }
    println("Исходный словарь: $m19")
    println("Скопированный словарь: $publicConfig")

//    20. Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
    val testResultsReport = mapOf("Test 4377" to "Failed", "Test 4567" to "Skipped", "Test 3457" to "Passed with warnings",)
    println(testResultsReport
        .map { "${it.key}: ${it.value}" }
        .joinToString("; "))

//    21. Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    val archivedReport = testResultsReport.toMap()
    println(archivedReport)

//    22. Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов, заменив идентификаторы тестов на их строковый аналог (например через toString()).
    val testResults1 = mapOf("Test 4678" to 233,
        "Test 8996" to 456,
        "Test 1290" to 7789,)
    fun getNameById(id: String): String {
        return when (id) {
            "Test 4678" -> "Login Test"
            "Test 8996" -> "Registration Test"
            "Test 1290" -> "Checkout Test"
            else -> "Unknown Test"
        }
    }
    println(testResults1.mapKeys { getNameById(it.key) })

//    23. Для словаря с оценками производительности различных версий приложения (ключи - строковая версия, значения - дробное число времени ответа сервера) увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
    val performanceRate = mapOf("v1" to 8.2, "v2" to 4.8, "v3" to 1.9)
    println(performanceRate.mapValues { it.value * 1.1 })

//    24. Проверьте, пуст ли словарь с ошибками компиляции тестов.
    val errorCompilations = mapOf<String, String>()
    println(errorCompilations.isEmpty())

//    25. Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    println(performanceRate.isNotEmpty())

//    26. Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
    println(m14.all {it.value == "Passed"})

//    27. Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
    println(m14.any() {it.value == "Failed"})

//    28. Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.
    val testResults2 = mapOf("optional s1" to "Passed", "s2" to "Passed", "s3" to "Skipped", "optional s4" to "Passed")
    println(testResults2
        .filter { it.key.contains("optional")}
        .filter {it.value == "Passed"})

}