package com.example.kotlincourse.lessons.lesson15.homeworks.task2

//Второй класс должен получать список строк и вставлять их в начало контейнера но поочерёдно с теми данными,
//которые уже есть. То-есть, наш список должен появиться в контейнере по индексам 0, 2, 4 и так далее.

class AlternatingContainer : Materials() {
    fun addMaterialsAlternating(newMaterials: List<String>) {
        val firstList = extractMaterial()


        val maxSize = maxOf(newMaterials.size, firstList.size)

        for (i in 0 until maxSize) {
            if (i < newMaterials.size) addMaterial(newMaterials[i])
            if (i < firstList.size) addMaterial(firstList[i])
        }
    }
}