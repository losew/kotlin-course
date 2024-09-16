package org.losewmac.kotlincourse.lesson3

//Название мероприятия:
val eventName: String = "Hackathon"

//Дата проведения:
const val exebitionDate: String = "01.09.2024"

//Место проведения:
lateinit var place: String

//Бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы:
var totalCost: Int = 1000
var hardwareCost: Int = 500
var cateringCost: Int = 200
var otherCost: Int = 500

//Количество участников:
var quantityHuman: Int = 100

//Длительность хакатона:
var hackathonTime: Int = 5

//Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг:
val suppliersContact: String = "тел. 123-45-67, hackaton@mail.ru"

//Текущее состояние хакатона (статус):
var status: String = "не начат"

//Список спонсоров:
val sponsors: String = "222-22-22 sponsor@mail.ru"

//Бюджет мероприятия?
var budget: Int = 1000

//Текущий уровень доступа к интернету:
var internetOn: Int = 5

//Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки:
val instruction: String = "Доставка оборудования, подготовка помещения, управление командой"

//Количество команд:
var quantityTeam: Int = 4

//Перечень задач:
var tasksList: String = "1. Планирование" + "2. Согласование" + "3. Проведение" + "4. Отчетность"

//План эвакуации:
val evacuationPlan: String = "План эвакуации в помещении на стене"

//Список доступного оборудования:
val equipmentList: String = "Компьютер, проектор, аудиоусилитель, колонки, микрофон"

//Список свободного оборудования:
var equipmentFree: String = "Компьютер, проектор, аудиоусилитель, колонки, микрофон"

//График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
val foodSchedule: String by lazy {
    ""
}

//План мероприятий на случай сбоев:
var emergency: String = "Перенос даты"

//Список экспертов и жюри:
var juryList: String = "1... 2..."

//Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
private val lazyFeedbackCheck: String by lazy {
    "опрос, интервью"
}

//Политика конфиденциальности:
var privacyPolicy: String = "Политика конфиденциальности"

//Приватные отзывы (фидбэк) участников и зрителей для анализа проблем:
private val lazyFeedback: String by lazy {
    "Отзывы, пожелания"
}

//Текущая температура в помещении:
var temperatureIndoor: Int = 22

//Мониторинг и анализ производительности сетевого оборудования и интернет-соединения:
var monitoringNetwork: String = ""
    get() = field
    set(value) {
        if (value == "Все работает") field = "Хорошо}"
        else field = "Не работает"
    }

//Уровень освещения:
var lumensLevl: Int = 800

//Лог событий мероприятия
private var log: String = "текст"

//Доступность медицинской помощи:
var ambulance: Double? = null

//Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций:
private var safety: String = "Куда эвакуироваться" + evacuationPlan

//Регистрационный номер мероприятия:
val nomber: Int = 233

//Максимально допустимый уровень шума в помещении хакатона:
val dicebellMax: Int = 40

//Индикатор превышения уровня шума в помещениях:
var dicebell: Int = 0
    get() = field
    set(value) {
        if (value <= dicebellMax) field = value
        else field = 1000
    }

//Формат мероприятия (зависит от геополитической обстановки):
var exhibitionFormat: String = ""
    get() = field
    set(value) {
        if (value == "Плохая погода") field = "Отмена"
        else field = "Новая дата мероприятия..."
    }

//Количество свободных мест для отдыха (например, кресел или диванов),
var availableSeats: Int = 0
    get() = field
    set(value) {
        if (value < 0) field = 0
        else field = 0
    }

//План взаимодействия с прессой:
val contactsWithPress: String = "Комментарии"

//Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок:
var projectOne: String = "Работает"
var projectTwo: String = "Работает"
var projectThree: String = "Работает"
var informationAboutProjects: String = projectOne + projectTwo + projectThree

//Статус получения всех необходимых разрешений:
var permissions: Boolean = true

//Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию):
var freeAccess: Boolean = false

//Список партнеров мероприятия:
val partnersList: String = "Партнер №1: т. 111-11-11, Партнер №2: т. 222-22-22, Партнер №3: т. 333-33-33"

//Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия:
lateinit var awardsList: String

//План распределения призов:
val planPrize: String = "Супер, ХОрошоие, Молодцы"

//Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам:
val emergencyСontacts: String = "тел 911"

//Особые условия для участников с ограниченными возможностями:
val SpecialFeatures: String = "пандус и лифт"

//Общее настроение участников (определяется опросами):
lateinit var moodFroze: String

//Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.
lateinit var hackathonPlan: String

//Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия:
lateinit var specialGuest: String

//Максимальное количество людей, которое может вместить место проведения:
val guestsMaximum: Int = 100

//Стандартное количество часов, отведенное каждой команде для работы над проектом:
var timeProjectOne: Int = 5
var timeProjectTwo: Int = 5
var timeProjectThree: Int = 5