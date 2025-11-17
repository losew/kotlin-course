package com.example.kotlincourse.lessons.lesson19.homeworks

//Напишите интерфейс Validator<T>, который будет проверять значение типа T на соответствие определенным
//условиям и возвращать булево значение (успешная или неуспешная проверка).

interface Validator<T> {
    fun validate(value: T): Boolean
}